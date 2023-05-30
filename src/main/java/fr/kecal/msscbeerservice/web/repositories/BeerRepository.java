package fr.kecal.msscbeerservice.web.repositories;

import fr.kecal.msscbeerservice.web.domain.Beer;
import java.util.UUID;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
