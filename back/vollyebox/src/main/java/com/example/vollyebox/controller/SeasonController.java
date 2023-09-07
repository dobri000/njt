package com.example.vollyebox.controller;

import com.example.vollyebox.domain.Season;
import com.example.vollyebox.service.SeasonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/season")
public class SeasonController {

    private final SeasonService seasonService;

    @GetMapping()
    public ResponseEntity<List<Season>> getAllSeasons() {
        List<Season> seasons = seasonService.getAllSeasons();
        return ResponseEntity.ok(seasons);
    }

}
