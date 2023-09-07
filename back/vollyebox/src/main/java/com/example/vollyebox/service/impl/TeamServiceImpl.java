package com.example.vollyebox.service.impl;

import com.example.vollyebox.domain.Team;
import com.example.vollyebox.repository.TeamRepository;
import com.example.vollyebox.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    @Override
    public Optional<Team> getTeam(int teamId) {
        return teamRepository.findById(teamId);
    }

    @Override
    public Team postTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team updateTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public List<Team> searchTeams(String search) {
        return teamRepository.getTeamsBySearch(search);
    }

    @Override
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public void deleteTeam(int teamId) {
        Optional<Team> found = teamRepository.findById(teamId);
        if(found.isPresent()){
            Team team = found.get();
            teamRepository.delete(team);
        }
    }
}
