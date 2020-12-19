package com.backend.entity;

public class Competition {

    private Long id;
    private Event idEvent;
    private ClubMember idClubMember;
    private String name;
    private String classSport;
    private Boolean gender;
    private String ageGroup;

    public Competition() {
    }

    public Competition(Long id, Event idEvent, ClubMember idClubMember, String name,
                       String classSport, Boolean gender, String ageGroup) {
        this.id = id;
        this.idEvent = idEvent;
        this.idClubMember = idClubMember;
        this.name = name;
        this.classSport = classSport;
        this.gender = gender;
        this.ageGroup = ageGroup;
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

    public ClubMember getIdClubMember() {
        return idClubMember;
    }

    public void setIdClubMember(ClubMember idClubMember) {
        this.idClubMember = idClubMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassSport() {
        return classSport;
    }

    public void setClassSport(String classSport) {
        this.classSport = classSport;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }
}
