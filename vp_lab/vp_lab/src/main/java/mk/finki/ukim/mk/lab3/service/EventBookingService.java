package mk.finki.ukim.mk.lab3.service;

import mk.finki.ukim.mk.lab3.model.EventBooking;

import java.util.List;

public interface EventBookingService {
    EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, int numberOfTickets);
    List<EventBooking> search(String text);
}
