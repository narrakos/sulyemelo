package com.backend.controller;


import com.backend.entity.ClubMember;
import com.backend.service.ClubMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;

@RestController
@CrossOrigin("*")
public class ClubMemberController {

    private final ClubMemberService clubMemberService;

    @Autowired
    public ClubMemberController(ClubMemberService cms){
        this.clubMemberService = cms;
    }


    public ArrayList<ClubMember> getClubMembers(){
        ClubMember cm1 = new ClubMember();
        ClubMember cm2 = new ClubMember();
        ClubMember cm3 = new ClubMember();
        ArrayList<ClubMember> clubMembers = new ArrayList<>();
        clubMembers.add(cm1);
        clubMembers.add(cm2);
        clubMembers.add(cm3);

        return clubMembers;
    }

    public void saveClubMember(String name, LocalDate birthdate, Integer wightClass, Integer bestSnatch, Integer bestCleanAndJerk){
        ClubMember cm = new ClubMember();
        cm.setBestSnatch(bestSnatch);
        cm.setBirthdate(birthdate);
        cm.setName(name);
        cm.setBestCleanAndJerk(bestCleanAndJerk);
        cm.setWeightClass(wightClass);

        clubMemberService.save(cm);
    }

}
