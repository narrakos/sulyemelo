package com.backend.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Event {

    private Long id;
    private ClubMember idClubMember;
    private Competition idCompetition;
    private String name;
    private LocalDateTime dateTime;
    private String location;
    private Integer ticketPrice;
    private String contactName;

    public Event() {
    }

    public Event(Long id, ClubMember idClubMember, Competition idCompetition, String name,
                 LocalDateTime dateTime, String location, Integer ticketPrice, String contactName) {
        this.id = id;
        this.idClubMember = idClubMember;
        this.idCompetition = idCompetition;
        this.name = name;
        this.dateTime = dateTime;
        this.location = location;
        this.ticketPrice = ticketPrice;
        this.contactName = contactName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClubMember getIdClubMember() {
        return idClubMember;
    }

    public void setIdClubMember(ClubMember idClubMember) {
        this.idClubMember = idClubMember;
    }

    public Competition getIdCompetition() {
        return idCompetition;
    }

    public void setIdCompetition(Competition idCompetition) {
        this.idCompetition = idCompetition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
