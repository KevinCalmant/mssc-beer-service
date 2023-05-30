package fr.kecal.msscbeerservice.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.kecal.msscbeerservice.web.model.BeerDto;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BeerController.class)
class BeerControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getBeerById() throws Exception {
        mockMvc.perform(get("/api/v1/beers/" + UUID.randomUUID()).accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk());
    }

    @Test
    void saveNewBeer() throws Exception {
        BeerDto beerDto = BeerDto.builder().build();
        String beerDtoToJson = objectMapper.writeValueAsString(beerDto);

        mockMvc.perform(
            post("/api/v1/beers")
                .contentType(MediaType.APPLICATION_JSON)
                .content(beerDtoToJson)
        ).andExpect(status().isCreated());
    }

    @Test
    void updateBeerById() throws Exception {
        BeerDto beerDto = BeerDto.builder().build();
        String beerDtoToJson = objectMapper.writeValueAsString(beerDto);

        mockMvc.perform(
            put("/api/v1/beers/" + UUID.randomUUID())
                .contentType(MediaType.APPLICATION_JSON)
                .content(beerDtoToJson)
        ).andExpect(status().isNoContent());
    }

    @Test
    void deleteBeerById() throws Exception {
        mockMvc.perform(delete("/api/v1/beers/" + UUID.randomUUID())).andExpect(status().isNoContent());
    }
}
