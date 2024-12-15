package mk.finki.ukim.mk.demo.service;

import mk.finki.ukim.mk.demo.model.EventBooking;

import java.util.List;

public interface EventBookingService {
    EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, int numberOfTickets);
    List<EventBooking> search(String text);
}
