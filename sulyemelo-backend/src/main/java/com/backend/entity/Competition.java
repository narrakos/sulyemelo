package com.backend.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Competition")
public class Competition extends AbstractEntity{

    @OneToOne
    @JoinColumn(name = "event_id" )
    private Event event;

    @ManyToMany
    @JoinColumn(name = "clubmember_id" )
    private Set<ClubMember> clubMember;

    @Column(name = "name")
    private String name;

    @Column(name = "class_sport")
    private String classSport;

    @Column(name = "gender")
    private Boolean gender;

    @Column(name = "age_group")
    private String ageGroup;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Set<ClubMember> getClubMember() {
        return clubMember;
    }

    public void setClubMember(Set<ClubMember> clubMember) {
        this.clubMember = clubMember;
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
