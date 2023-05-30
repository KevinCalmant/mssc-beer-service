package fr.kecal.msscbeerservice.web.services;

import fr.kecal.msscbeerservice.web.model.BeerDto;
import java.util.UUID;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface BeerService {
    BeerDto getById(UUID beerId) throws ChangeSetPersister.NotFoundException;

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto) throws ChangeSetPersister.NotFoundException;

    void deleteBeerById(UUID beerId);
}
