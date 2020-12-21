package com.backend.controller;

import com.backend.entity.Competition;
import com.backend.entity.Event;
import com.backend.entity.Profile;
import com.backend.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@CrossOrigin("*")
@RequestMapping("profile")
public class ProfileController {

    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping("save")
    public void saveProfile(
            @RequestParam String name) {

        Profile toSaveProfile = new Profile();
        toSaveProfile.setName(name);

        profileService.save(toSaveProfile);
    }
}
