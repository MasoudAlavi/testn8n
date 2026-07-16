package com.example.calculator.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.http.MediaType;

@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testPowerSuccess() throws Exception {
        mockMvc.perform(get("/api/calculator/power")
                .param("a", "2")
                .param("b", "3")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value(8.0));
    }

    @Test
    void testPowerMissingParam() throws Exception {
        mockMvc.perform(get("/api/calculator/power")
                .param("a", "2")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error").exists());
    }

    @Test
    void testPowerInvalidParam() throws Exception {
        mockMvc.perform(get("/api/calculator/power")
                .param("a", "notANumber")
                .param("b", "2")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error").exists());
    }

    @Test
    void testZeroToNonPositive() throws Exception {
        mockMvc.perform(get("/api/calculator/power")
                .param("a", "0")
                .param("b", "0")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error").value("0 cannot be raised to zero or a negative power"));
    }
}
