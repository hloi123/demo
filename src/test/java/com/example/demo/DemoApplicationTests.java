package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(value = DemoController.class)
class DemoApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() {
    }

    @Test
    public void testEndpoint_WhenNegativeNumber_return409Result() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/demo/-1"))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    public void testEndpoint_WhenPositiveNumber_returnResult() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/demo/10"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
