package com.backend.controller;


import com.backend.entity.ClubMember;
import com.backend.service.ClubMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;

@RestController
@CrossOrigin("*")
@RequestMapping("member")
public class ClubMemberController {

    private final ClubMemberService clubMemberService;

    @Autowired
    public ClubMemberController(ClubMemberService cms){
        this.clubMemberService = cms;
    }

    @GetMapping("getAll")
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

    @PostMapping("save")
    public void saveClubMember(@RequestParam String name,
                               @RequestParam LocalDate birthdate,
                               @RequestParam Integer wightClass,
                               @RequestParam Integer bestSnatch,
                               @RequestParam Integer bestCleanAndJerk){
        ClubMember cm = new ClubMember();
        cm.setBestSnatch(bestSnatch);
        cm.setBirthdate(birthdate);
        cm.setName(name);
        cm.setBestCleanAndJerk(bestCleanAndJerk);
        cm.setWeightClass(wightClass);

        clubMemberService.save(cm);
    }

}
