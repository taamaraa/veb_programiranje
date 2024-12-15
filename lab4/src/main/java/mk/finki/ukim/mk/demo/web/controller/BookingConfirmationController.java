package mk.finki.ukim.mk.demo.web.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mk.finki.ukim.mk.demo.bootstrap.DataHolder;
import mk.finki.ukim.mk.demo.model.EventBooking;
import mk.finki.ukim.mk.demo.service.EventBookingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.crypto.Data;
import java.io.IOException;

@Controller
public class BookingConfirmationController {

    private final EventBookingService Bookings;

    public BookingConfirmationController(EventBookingService bookings) {
        Bookings = bookings;
    }

    @GetMapping("/event/BookingConfirmation")
    public String bookingConfirmation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //EventBooking tmp = DataHolder.bookings.get(DataHolder.bookings.size()-1);
        //request.setAttribute("num_tickets", tmp.getNumberOfTickets());
        //request.setAttribute("event_name", tmp.getEventName());
        //request.setAttribute("client_ip", tmp.getAttendeeAddress());
        //request.setAttribute("attende_name", tmp.getAttendeeName());
       // request.setAttribute("Bookings", DataHolder.bookings);
        return "bookingConfirmation";
    }
}
