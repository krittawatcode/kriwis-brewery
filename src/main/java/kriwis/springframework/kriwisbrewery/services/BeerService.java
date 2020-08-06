package kriwis.springframework.kriwisbrewery.services;

import kriwis.springframework.kriwisbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
