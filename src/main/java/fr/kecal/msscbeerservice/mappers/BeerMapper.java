package fr.kecal.msscbeerservice.mappers;

import fr.kecal.msscbeerservice.web.domain.Beer;
import fr.kecal.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto toDto(Beer beer);

    Beer toEntity(BeerDto beerDto);
}
