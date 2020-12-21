package com.backend.controller;


import com.backend.entity.Competition;
import com.backend.entity.Event;
import com.backend.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
@CrossOrigin("*")
public class EventController {


    private final EventService eventService;


    @Autowired
    public EventController(EventService eventService){
        this.eventService = eventService;
    }


    @GetMapping("getEvents")
    public ArrayList<Event> getEvents() {
        Event e1 = new Event();
        Event e2 = new Event();
        Event e3 = new Event();





        ArrayList<Event> events = new ArrayList<>();
        events.add(e1);
        events.add(e2);
        events.add(e3);

        return events;


    }

    public void saveEvent(
            Competition competition_id,
            String name,
            LocalDateTime date_time,
            String location,
            Integer ticket_price,
            String contact_name){

        Event toSaveEvent = new Event();
        toSaveEvent.setName(name);
        toSaveEvent.setLocation(location);
        toSaveEvent.setContactName(contact_name);
        toSaveEvent.setCompetition(competition_id);
        toSaveEvent.setTicketPrice(ticket_price);
        toSaveEvent.setDateTime(date_time);

        eventService.save(toSaveEvent);
    }




    //service bekérése: private final EventService eventService;
    //konstruktor létrehozása
    //@autowired




}
