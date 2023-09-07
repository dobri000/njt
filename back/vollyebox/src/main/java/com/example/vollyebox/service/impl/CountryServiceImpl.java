package com.example.vollyebox.service.impl;

import com.example.vollyebox.domain.Country;
import com.example.vollyebox.repository.CountryRepository;
import com.example.vollyebox.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
