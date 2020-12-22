package com.backend.controller;

import com.backend.entity.ClubMember;
import com.backend.entity.Competition;
import com.backend.entity.Event;
import com.backend.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@RestController
@CrossOrigin("*")
@RequestMapping("competition")
public class CompetitionController {

    private final CompetitionService competitionService;

    @Autowired
    public CompetitionController(CompetitionService competitionService) {
        this.competitionService = competitionService;
    }

    @GetMapping("getAll")
    public List<Competition> getCompetitions() {
        return competitionService.findAll();
    }

    @PostMapping("save")
    public void saveCompetition(
            @RequestParam Event event_id,
            @RequestParam ClubMember clubmember_id,
            @RequestParam String name,
            @RequestParam String classSport,
            @RequestParam Boolean gender,
            @RequestParam String ageGroup) {

        Competition toSaveCompetition = new Competition();
        toSaveCompetition.setEvent(event_id);
        toSaveCompetition.setClubMember((Set<ClubMember>) clubmember_id);
        toSaveCompetition.setName(name);
        toSaveCompetition.setClassSport(classSport);
        toSaveCompetition.setGender(gender);
        toSaveCompetition.setAgeGroup(ageGroup);

        competitionService.save(toSaveCompetition);
    }
}
