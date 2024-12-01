package mk.finki.ukim.mk.lab3.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Event {
    private String name;
    private String description;
    private double popularityScore;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Location location;

    boolean liked;

    public Event(String name, String description, double popularityScore) {
        this.name = name;
        this.description = description;
        this.popularityScore = popularityScore;
        this.liked = true;
    }
    public boolean isLiked() {
        return liked;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPopularityScore() {
        return popularityScore;
    }
    public long getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPopularityScore(double popularityScore) {
        this.popularityScore = popularityScore;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void like(){
        this.popularityScore+=5;
        liked = false;
    }


}