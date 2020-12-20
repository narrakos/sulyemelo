package com.backend.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Event")
public class Event extends AbstractEntity{

    @OneToOne
    @JoinColumn(name = "competition_id")
    private Competition competition;

    @Column(name = "name")
    private String name;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    @Column(name = "location")
    private String location;

    @Column(name = "ticket_price")
    private Integer ticketPrice;

    @Column(name = "contact_name")
    private String contactName;

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

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

}
