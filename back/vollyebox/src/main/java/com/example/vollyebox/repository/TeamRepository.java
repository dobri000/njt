package com.example.vollyebox.repository;

import com.example.vollyebox.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Integer> {
    @Query("SELECT t FROM Team t WHERE LOWER(t.teamName) LIKE LOWER(CONCAT(:search, '%'))")
    List<Team> getTeamsBySearch(@Param("search")String search);
}
