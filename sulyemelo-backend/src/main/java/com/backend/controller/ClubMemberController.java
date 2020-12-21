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

        cm1.setName("cm1Nev");
        cm1.setWeightClass(1);
        cm1.setBirthdate(LocalDate.now());
        cm1.setBestCleanAndJerk(11);
        cm1.setBestSnatch(111);
        cm2.setName("cm2Nev");
        cm2.setWeightClass(2);
        cm2.setBirthdate(LocalDate.now());
        cm2.setBestCleanAndJerk(22);
        cm2.setBestSnatch(222);
        cm3.setName("cm3Nev");
        cm3.setWeightClass(3);
        cm3.setBirthdate(LocalDate.now());
        cm3.setBestCleanAndJerk(33);
        cm3.setBestSnatch(33);

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
