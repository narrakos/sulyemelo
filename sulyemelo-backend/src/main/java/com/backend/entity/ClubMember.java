package com.backend.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ClubMember")
public class ClubMember extends AbstractEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @Column(name = "weight_class")
    private Integer weightClass;

    @Column(name = "best_snatch")
    private Integer bestSnatch;

    @Column(name = "best_clean_and_jerk")
    private Integer bestCleanAndJerk;

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
