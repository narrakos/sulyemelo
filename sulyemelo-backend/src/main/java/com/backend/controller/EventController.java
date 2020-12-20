package com.backend.controller;


import com.backend.entity.ClubMember;
import com.backend.entity.Competition;
import com.backend.entity.Event;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@CrossOrigin("*")
public class EventController {

    @GetMapping("getEvent")
    public Event getEvent() {

        Event response = new Event();
//        response.setClubMember(new ClubMember());
        response.setLocation("");
        response.setContactName("");
        response.setTicketPrice(12);
        response.setDateTime(LocalDateTime.now());
        response.setCompetition(new Competition());

        return response;
    }


}
