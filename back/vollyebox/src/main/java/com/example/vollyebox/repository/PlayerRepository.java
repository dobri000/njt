package com.example.vollyebox.repository;

import com.example.vollyebox.domain.Player;
import com.example.vollyebox.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    @Query("SELECT p FROM Player p WHERE LOWER(p.firstname) LIKE LOWER(CONCAT(:search, '%')) OR LOWER(p.lastname) LIKE LOWER(CONCAT(:search, '%'))")
    List<Player> getPlayerssBySearch(@Param("search") String search);

}
