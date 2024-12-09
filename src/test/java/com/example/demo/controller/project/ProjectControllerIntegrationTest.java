package com.example.demo.controller.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.example.demo.controller.model.ProjectRest;
import com.example.demo.domain.model.Project;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class ProjectControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void shouldReturnDefaultMessage() throws Exception {
        MvcResult result = this.mockMvc.perform(get("/projects"))
                .andExpect(status().isOk())
                .andReturn();

        String json = result.getResponse()
                .getContentAsString();
        List<ProjectRest> projects = objectMapper.readValue(json, new TypeReference<>() {
        });


        assertNotNull(projects);
        assertEquals(6, projects.size());
    }

}