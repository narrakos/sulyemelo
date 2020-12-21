package com.backend;

import com.backend.entity.Competition;
import com.backend.entity.Event;
import com.backend.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
public class DataGenerator {


    private final EventService eventService;

    @Autowired
    public DataGenerator(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("generate")
    public String run(){
        generateEventsAndCompetitions();
        return "generálva";
    }


    private void generateEventsAndCompetitions(){
        Competition compForE1 = new Competition();
        Competition compForE2 = new Competition();
        Competition compForE3 = new Competition();
        Event e1 = new Event();
        Event e2 = new Event();
        Event e3 = new Event();

        compForE1.setName("comp1name");
        compForE1.setEvent(e1);
        compForE1.setAgeGroup("compAgeGroup1");
        compForE1.setClassSport("comp1ClassSport");
        compForE1.setGender(Boolean.FALSE);
        compForE2.setName("comp2name");
        compForE2.setEvent(e2);
        compForE2.setAgeGroup("compAgeGroup2");
        compForE2.setClassSport("comp2ClassSport");
        compForE2.setGender(Boolean.TRUE);
        compForE3.setName("comp3name");
        compForE3.setEvent(e3);
        compForE3.setAgeGroup("compAgeGroup3");
        compForE3.setClassSport("comp3ClassSport");
        compForE3.setGender(Boolean.FALSE);

        e1.setDateTime(LocalDateTime.now());
        e1.setName("e1Name");
        e1.setCompetition(compForE1);
        e1.setTicketPrice(1);
        e1.setLocation("e1location");
        e1.setContactName("e1ContactName");
        e2.setDateTime(LocalDateTime.now());
        e2.setName("e2Name");
        e2.setCompetition(compForE2);
        e2.setTicketPrice(2);
        e2.setLocation("e2location");
        e2.setContactName("e2ContactName");
        e3.setDateTime(LocalDateTime.now());
        e3.setName("e3Name");
        e3.setCompetition(compForE3);
        e3.setTicketPrice(3);
        e3.setLocation("e3location");
        e3.setContactName("e3ContactName");

        ArrayList<Event> events = new ArrayList<>();
        events.add(e1);
        events.add(e2);
        events.add(e3);

        eventService.saveAll(events);
    }
}
