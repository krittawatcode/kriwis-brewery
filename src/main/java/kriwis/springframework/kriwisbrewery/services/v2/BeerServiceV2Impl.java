package kriwis.springframework.kriwisbrewery.services.v2;

import kriwis.springframework.kriwisbrewery.web.model.BeerDto;
import kriwis.springframework.kriwisbrewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Bishop Care")
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2) {

        return BeerDtoV2.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2) {
        // todo impl would add real update
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer ...");
    }
}
