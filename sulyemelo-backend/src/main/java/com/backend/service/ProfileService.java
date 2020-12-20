package com.backend.service;

import com.backend.entity.Profile;
import com.backend.repository.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileService extends AbstractService<Profile, ProfileRepository>{
}
