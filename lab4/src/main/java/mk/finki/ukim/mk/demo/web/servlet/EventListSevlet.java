package mk.finki.ukim.mk.demo.web.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mk.finki.ukim.mk.demo.model.Event;
import mk.finki.ukim.mk.demo.service.EventBookingService;
import mk.finki.ukim.mk.demo.service.EventService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.web.IWebExchange;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "event_list",urlPatterns = "/servlet/home")
public class EventListSevlet extends HttpServlet {
    private final EventService EventService;
    private final EventBookingService Bookings;
    private final SpringTemplateEngine engine;
    private boolean search_check = false;

    private List<Event> found_events;

    public EventListSevlet(mk.finki.ukim.mk.demo.service.EventService eventService, EventBookingService bookings, SpringTemplateEngine engine) {
        EventService = eventService;
        Bookings = bookings;
        this.engine = engine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IWebExchange webExchange = JakartaServletWebApplication
                .buildApplication(getServletContext())
                .buildExchange(req, resp);
        WebContext context = new WebContext(webExchange);
        context.setVariable("events",this.EventService.listAll());
        if(search_check){
            context.setVariable("searchEvents",found_events);
            found_events = new ArrayList<>();
            search_check = false;
        }
        this.engine.process("listEvents.html",context,resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tmp = req.getParameter("redirect");
        if(tmp!=null){
            int numTickets = Integer.parseInt(req.getParameter("numTickets"));
            String event_name = req.getParameter("event_name");
            String client_ip=req.getRemoteAddr();
            String name = req.getHeader("User-Agent");
            Bookings.placeBooking(event_name,name,client_ip,numTickets);
            resp.sendRedirect("/eventBooking");
        }
        else{
            String text = req.getParameter("searchText");
            double rating = Double.parseDouble(req.getParameter("searchDesc"));
            found_events = EventService.specialSearch(text,rating);
            search_check = true;
            resp.sendRedirect("/home");
        }

    }
}
