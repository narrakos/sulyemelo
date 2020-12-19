package com.backend.entity;

import java.time.LocalDate;

public class ClubMember {

    private Long id;
    private Event idEvent;
    private String name;
    private LocalDate birthdate;
    private Integer weightClass;
    private Integer bestSnatch;
    private Integer bestCleanAndJerk;

    public ClubMember() {
    }

    public ClubMember(Long id, Event idEvent, String name, LocalDate birthdate, Integer weightClass,
                      Integer bestSnatch, Integer bestCleanAndJerk) {
        this.id = id;
        this.idEvent = idEvent;
        this.name = name;
        this.birthdate = birthdate;
        this.weightClass = weightClass;
        this.bestSnatch = bestSnatch;
        this.bestCleanAndJerk = bestCleanAndJerk;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Event getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Event idEvent) {
        this.idEvent = idEvent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getWeightClass() {
        return weightClass;
    }

    public void setWeightClass(Integer weightClass) {
        this.weightClass = weightClass;
    }

    public Integer getBestSnatch() {
        return bestSnatch;
    }

    public void setBestSnatch(Integer bestSnatch) {
        this.bestSnatch = bestSnatch;
    }

    public Integer getBestCleanAndJerk() {
        return bestCleanAndJerk;
    }

    public void setBestCleanAndJerk(Integer bestCleanAndJerk) {
        this.bestCleanAndJerk = bestCleanAndJerk;
    }
}
