package com.backend.repository;

import com.backend.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsletterEmailRepository extends JpaRepository<Profile, Long> {
}
