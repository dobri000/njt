package com.example.vollyebox.service;

import com.example.vollyebox.domain.PlayerEngagement;

public interface PlayerEngagementService {

    public PlayerEngagement addEngagement(PlayerEngagement playerEngagement);
    public void deleteEngagement(int playerEngagementId);

}
