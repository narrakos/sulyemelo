package com.backend.entity;

import java.time.LocalDateTime;

public class Document {

    private Long id;
    private ClubMember idClubMember;
    private String title;
    private String content;
    private LocalDateTime dateOfCreation;

    public Document() {
    }

    public Document(Long id, ClubMember idClubMember, String title, String content,
                    LocalDateTime dateOfCreation) {
        this.id = id;
        this.idClubMember = idClubMember;
        this.title = title;
        this.content = content;
        this.dateOfCreation = dateOfCreation;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
}
