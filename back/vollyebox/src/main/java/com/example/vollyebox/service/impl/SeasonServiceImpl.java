package com.example.vollyebox.service.impl;

import com.example.vollyebox.domain.Season;
import com.example.vollyebox.repository.SeasonRepository;
import com.example.vollyebox.service.SeasonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeasonServiceImpl implements SeasonService {

    private final SeasonRepository seasonRepository;
    @Override
    public List<Season> getAllSeasons() {
        return seasonRepository.findAll();
    }
}
