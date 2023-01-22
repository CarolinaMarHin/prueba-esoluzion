package com.example.ecommerce.controller;

import com.example.esoluzion.ApplicationMock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ECommerceController.class)
@ContextConfiguration(classes = ApplicationMock.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class ECommerceControllerTest {
    @Autowired
    private MockMvc mocMvc;

    @Test
    @DisplayName("Should return price_list: 1 with 2020-06-14 10:00")
    void shouldBeReturnPriceDtoTest1() throws Exception {
        mocMvc.perform(get("/getFinalPrice/2020-06-14/10:00/35455/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("price", is(35.5)))
                .andExpect(jsonPath("price_list", is(1)));
    }

    @Test
    @DisplayName("Should return price_list: 2 with 2020-06-14 16:00")
    void shouldBeReturnPriceDtoTest2() throws Exception {
        mocMvc.perform(get("/getFinalPrice/2020-06-14/16:00/35455/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("price", is(25.45)))
                .andExpect(jsonPath("price_list", is(2)));
    }

    @Test
    @DisplayName("Should return price_list: 4 with 2020-06-14 21:00")
    void shouldBeReturnPriceDtoTest3() throws Exception {
        mocMvc.perform(get("/getFinalPrice/2020-06-14/21:00/35455/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("price", is(35.50)))
                .andExpect(jsonPath("price_list", is(1)));
    }

    @Test
    @DisplayName("Should return price_list: 4 with 2020-06-15 10:00")
    void shouldBeReturnPriceDtoTest4() throws Exception {
        mocMvc.perform(get("/getFinalPrice/2020-06-15/10:00/35455/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("price", is(30.5)))
                .andExpect(jsonPath("price_list", is(3)));
    }

    @Test
    @DisplayName("Should return price_list: 4 with 2020-06-16 21:00")
    void shouldBeReturnPriceDtoTest5() throws Exception {
        mocMvc.perform(get("/getFinalPrice/2020-06-16/21:00/35455/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("price", is(38.95)))
                .andExpect(jsonPath("price_list", is(4)));
    }
}