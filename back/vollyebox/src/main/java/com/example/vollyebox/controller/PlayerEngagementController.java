package com.example.vollyebox.controller;

import com.example.vollyebox.domain.PlayerEngagement;
import com.example.vollyebox.service.PlayerEngagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/playerEngagement")
@RequiredArgsConstructor
public class PlayerEngagementController {

    private final PlayerEngagementService playerEngagementService;

    @PostMapping
    public ResponseEntity<PlayerEngagement> addPlayerEngagement(@RequestBody PlayerEngagement playerEngagement) {
        playerEngagementService.addEngagement(playerEngagement);
        return ResponseEntity.ok(playerEngagement);
    }

    @DeleteMapping("/{playerEngagementId}")
    public ResponseEntity<String> deletePlayerEngagement(@PathVariable("playerEngagementId") int playerEngagementId) {
        playerEngagementService.deleteEngagement(playerEngagementId);
        return ResponseEntity.ok("Player engagement has been successfully deleted");
    }

}
