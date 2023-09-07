package com.example.vollyebox.service.impl;

import com.example.vollyebox.domain.PlayerEngagement;
import com.example.vollyebox.repository.PlayerEngagementRepository;
import com.example.vollyebox.service.PlayerEngagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlayerEngagementServiceImpl implements PlayerEngagementService {

    private final PlayerEngagementRepository playerEngagementRepository;

    @Override
    public PlayerEngagement addEngagement(PlayerEngagement playerEngagement) {
        return playerEngagementRepository.save(playerEngagement);
    }

    @Override
    public void deleteEngagement(int playerEngagementId) {
        Optional<PlayerEngagement> pe = playerEngagementRepository.findById(playerEngagementId);
        PlayerEngagement engagement = pe.get();
        playerEngagementRepository.delete(engagement);
    }
}
