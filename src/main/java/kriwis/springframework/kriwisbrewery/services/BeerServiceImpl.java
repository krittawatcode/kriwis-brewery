package kriwis.springframework.kriwisbrewery.services;

import kriwis.springframework.kriwisbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Bishop Care")
                .beerStyle("Pale Ale")
                .build();
    }


}
