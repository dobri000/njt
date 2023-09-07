package com.example.vollyebox.service.impl;

import com.example.vollyebox.domain.Hall;
import com.example.vollyebox.repository.HallRepository;
import com.example.vollyebox.service.HallService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HallServiceImpl implements HallService {
    private final HallRepository hallRepository;

    @Override
    public List<Hall> getAllHalls() {
        return hallRepository.findAll();
    }
}
