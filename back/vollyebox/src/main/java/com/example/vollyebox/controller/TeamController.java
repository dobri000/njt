package com.example.vollyebox.controller;

import com.example.vollyebox.domain.Team;
import com.example.vollyebox.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/team")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @GetMapping("/{teamId}")
    public ResponseEntity<Team> getTeam(@PathVariable("teamId") int teamId) {
        Optional<Team> team = teamService.getTeam(teamId);
        if(team.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(team.get());
    }

    @GetMapping()
    public ResponseEntity<List<Team>> getAllTeams() {
        return ResponseEntity.ok(teamService.getAllTeams());
    }

    @PostMapping()
    public ResponseEntity<Team> postTeam(@RequestBody Team team) {
        team = teamService.postTeam(team);
        return ResponseEntity.ok(team);
    }

    @PutMapping()
    public ResponseEntity<String> updateTeam(
            @RequestBody Team team
    ) {
        team = teamService.updateTeam(team);
        if(team == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Team is successfully updated");
    }

    @GetMapping("/search/{search}")
    public ResponseEntity<List<Team>> searchTeams(@PathVariable("search") String search) {
        List<Team> teams = teamService.searchTeams(search);
        return ResponseEntity.ok(teams);
    }

    @DeleteMapping("/{teamId}")
    public ResponseEntity<String> deleteTeam(@PathVariable("teamId") int teamId) {
        teamService.deleteTeam(teamId);
        return ResponseEntity.ok("Team was successfully deleted");
    }



}
