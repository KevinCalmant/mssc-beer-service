package fr.kecal.msscbeerservice.web.services;

import fr.kecal.msscbeerservice.web.model.BeerDto;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        return null;
    }

    @Override
    public void deleteBeer(UUID beerId) {

    }
}
