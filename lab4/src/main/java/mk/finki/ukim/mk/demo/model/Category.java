package mk.finki.ukim.mk.demo.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;
    @OneToMany
    private List<Event> eventList;

    public Long getId() {
        return id;
    }

    public Category(String name) {
        Name = name;
        eventList = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
