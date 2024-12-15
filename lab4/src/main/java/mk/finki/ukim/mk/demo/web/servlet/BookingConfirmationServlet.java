package mk.finki.ukim.mk.demo.web.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mk.finki.ukim.mk.demo.bootstrap.DataHolder;
import mk.finki.ukim.mk.demo.model.EventBooking;
import mk.finki.ukim.mk.demo.service.EventBookingService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.web.IWebExchange;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "booking_confirmation",urlPatterns = "/eventBooking")
public class BookingConfirmationServlet extends HttpServlet {
    private final SpringTemplateEngine engine;

    private final EventBookingService Bookings;


    public BookingConfirmationServlet(SpringTemplateEngine engine, EventBookingService bookings) {
        this.engine = engine;
        Bookings = bookings;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IWebExchange webExchange = JakartaServletWebApplication
                .buildApplication(getServletContext())
                .buildExchange(req, resp);
        WebContext context = new WebContext(webExchange);
        //EventBooking tmp = DataHolder.bookings.get(DataHolder.bookings.size()-1);
        //context.setVariable("attende_name",tmp.getAttendeeName());
       // context.setVariable("client_ip",tmp.getAttendeeAddress());
       // context.setVariable("event_name",tmp.getEventName());
       // context.setVariable("num_tickets",tmp.getNumberOfTickets());
       // context.setVariable("Bookings",DataHolder.bookings);
        this.engine.process("bookingConfirmation.html",context,resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text=req.getParameter("search_text");
        List<EventBooking> found_events = Bookings.search(text);
        IWebExchange webExchange = JakartaServletWebApplication
                .buildApplication(getServletContext())
                .buildExchange(req, resp);
        WebContext context = new WebContext(webExchange);
        context.setVariable("Bookings",found_events);
        this.engine.process("bookingConfirmation.html",context,resp.getWriter());
    }
}
