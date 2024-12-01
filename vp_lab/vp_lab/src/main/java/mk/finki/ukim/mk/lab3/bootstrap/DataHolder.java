package mk.finki.ukim.mk.lab3.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.mk.lab3.model.Event;
import mk.finki.ukim.mk.lab3.model.EventBooking;
import mk.finki.ukim.mk.lab3.model.Location;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Event> events = new ArrayList<>();
    public static List<Location> locations = new ArrayList<>();
    public static List<EventBooking> bookings = new ArrayList<>();

    @PostConstruct
    public void init() {
        // Adding specific events with real names, descriptions, and popularity scores
        locations.add(new Location(101L, "Madison Square Garden", "New York", "USA", "Manhattan"));
        events.add(new Event("Concert: Taylor Swift", "A night with Taylor Swift performing live.", 95));
        events.get(events.size() - 1).setLocation(locations.get(locations.size() - 1));

        locations.add(new Location(102L, "Wembley Stadium", "London", "UK", "Wembley"));
        events.add(new Event("UEFA Champions League Final", "The biggest game in European club football.", 100));
        events.get(events.size() - 1).setLocation(locations.get(locations.size() - 1));

        locations.add(new Location(103L, "Tokyo Dome", "Tokyo", "Japan", "Bunkyo City"));
        events.add(new Event("Tokyo Jazz Festival", "Annual jazz festival featuring international artists.", 80));
        events.get(events.size() - 1).setLocation(locations.get(locations.size() - 1));

        locations.add(new Location(104L, "Sydney Opera House", "Sydney", "Australia", "Bennelong Point"));
        events.add(new Event("Opera: La Traviata", "A grand performance of Verdi's La Traviata.", 85));
        events.get(events.size() - 1).setLocation(locations.get(locations.size() - 1));

        locations.add(new Location(105L, "Royal Albert Hall", "London", "UK", "South Kensington"));
        events.add(new Event("BBC Proms", "The world's largest classical music festival.", 90));
        events.get(events.size() - 1).setLocation(locations.get(locations.size() - 1));

        locations.add(new Location(106L, "Staples Center", "Los Angeles", "USA", "Downtown LA"));
        events.add(new Event("NBA Finals Game 7", "The ultimate showdown for the NBA championship.", 98));
        events.get(events.size() - 1).setLocation(locations.get(locations.size() - 1));

        locations.add(new Location(107L, "Circuit de Monaco", "Monaco", "Monaco", "Monte Carlo"));
        events.add(new Event("Monaco Grand Prix", "Formula 1 race through the streets of Monaco.", 92));
        events.get(events.size() - 1).setLocation(locations.get(locations.size() - 1));

        locations.add(new Location(108L, "Red Rocks Amphitheatre", "Morrison", "USA", "Jefferson County"));
        events.add(new Event("Concert: The Lumineers", "An outdoor concert by The Lumineers.", 78));
        events.get(events.size() - 1).setLocation(locations.get(locations.size() - 1));

        locations.add(new Location(109L, "Glastonbury Festival", "Somerset", "UK", "Pilton"));
        events.add(new Event("Glastonbury 2024", "The biggest music festival in the UK.", 97));
        events.get(events.size() - 1).setLocation(locations.get(locations.size() - 1));

        locations.add(new Location(110L, "Burning Man", "Black Rock City", "USA", "Nevada"));
        events.add(new Event("Burning Man", "Annual gathering focused on community, art, self-expression, and self-reliance.", 88));
        events.get(events.size() - 1).setLocation(locations.get(locations.size() - 1));
    }
}
