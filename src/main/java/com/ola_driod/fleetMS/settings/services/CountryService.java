package com.ola_driod.fleetMS.settings.services;

import com.ola_driod.fleetMS.settings.models.Country;
import com.ola_driod.fleetMS.settings.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;
    
    public List<Country> getCountries(){
        return this.countryRepository.findAll();
    }
}
