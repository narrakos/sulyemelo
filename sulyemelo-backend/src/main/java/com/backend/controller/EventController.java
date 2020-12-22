package com.backend.controller;


import com.backend.entity.Competition;
import com.backend.entity.Event;
import com.backend.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
@CrossOrigin("*")
@RequestMapping("event")
public class EventController {


    private final EventService eventService;


    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }


    @GetMapping("getAll")
    public ArrayList<Event> getEvents() {
        return (ArrayList<Event>) eventService.findAll();
    }

    @PostMapping("save")
    public void saveEvent(
            @RequestParam String name,
            @RequestParam String location) {

        Event toSaveEvent = new Event();
        toSaveEvent.setName(name);
        toSaveEvent.setLocation(location);

        eventService.save(toSaveEvent);
    }


    //service bekérése: private final EventService eventService;
    //konstruktor létrehozása
    //@autowired


}
