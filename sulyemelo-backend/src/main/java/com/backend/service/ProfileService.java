package com.backend.service;

import com.backend.entity.Profile;
import com.backend.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileService extends AbstractService<Profile>{

    private final ProfileRepository repository;

    @Autowired
    public ProfileService(ProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    JpaRepository<Profile, Long> getRepository() {
        return repository;
    }
}
