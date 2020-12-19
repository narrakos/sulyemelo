package com.backend.entity;

import java.sql.Clob;
import java.time.LocalDateTime;

public class Post {

    private Long id;
    private Profile idProfile;
    private String title;
    private Clob body;
    private LocalDateTime dateOfCreation;

    public Post() {
    }

    public Post(Long id, Profile idProfile, String title, Clob body, LocalDateTime dateOfCreation) {
        this.id = id;
        this.idProfile = idProfile;
        this.title = title;
        this.body = body;
        this.dateOfCreation = dateOfCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Profile getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(Profile idProfile) {
        this.idProfile = idProfile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Clob getBody() {
        return body;
    }

    public void setBody(Clob body) {
        this.body = body;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
}
