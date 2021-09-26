package com.codecool.SpringDemo.rest;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ProductControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ProductService productService;

    @Autowired
    private MappingJackson2HttpMessageConverter mapper;

    @Test
    public void test() throws Exception {
        //given:
        ProductDTO p1 = new ProductDTO(1, "A", "B", BigDecimal.valueOf(10.5));
        ProductDTO p2 = new ProductDTO(2, "C", "BDDDDD", BigDecimal.valueOf(16.5));
        List<ProductDTO> expected = Arrays.asList(p1, p2);
        when(productService.getAll()).thenReturn(expected);

        //when - then:
        mvc.perform(get("/products"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{\"id\":1,\"name\":\"A\",\"description\":\"B\",\"price\":10.5},{\"id\":2,\"name\":\"C\",\"description\":\"BDDDDD\",\"price\":16.5}]"));
    }


}