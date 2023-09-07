package com.example.vollyebox.controller;

import com.example.vollyebox.domain.Hall;
import com.example.vollyebox.service.HallService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hall")
@RequiredArgsConstructor
public class HallController {

    private final HallService hallService;

    @GetMapping()
    public ResponseEntity<List<Hall>> getAllHalls() {
        List<Hall> halls = hallService.getAllHalls();
        return ResponseEntity.ok(halls);
    }

}
