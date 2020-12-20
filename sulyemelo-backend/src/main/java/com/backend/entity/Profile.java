package com.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "Profile")
public class Profile extends AbstractEntity{

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
