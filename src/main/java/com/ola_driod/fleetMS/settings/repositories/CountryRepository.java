package com.ola_driod.fleetMS.settings.repositories;

import com.ola_driod.fleetMS.settings.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
