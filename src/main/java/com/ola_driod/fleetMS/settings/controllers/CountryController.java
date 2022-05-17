package com.ola_driod.fleetMS.settings.controllers;

import com.ola_driod.fleetMS.settings.models.Country;
import com.ola_driod.fleetMS.settings.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CountryController {
    @Autowired
    private CountryService countryService;
    
    @GetMapping("/countries")
//    @ResponseBody - this returns a json format of Country objects.
    public String getAllCountries(Model model){
        List<Country> countries = this.countryService.getCountries();
        model.addAttribute("countries",countries);
        return "settings/countryList";
    }

    @GetMapping("/newCountry")
//    @ResponseBody - this returns a json format of Country objects.
    public String addNewCountry(Model model){

        return "settings/countryAdd";
    }
}
