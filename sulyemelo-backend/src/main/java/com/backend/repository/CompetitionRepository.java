package com.backend.repository;

import com.backend.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends JpaRepository<Profile, Long> {
}
