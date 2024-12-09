package com.example.demo.domain.model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ProjectTest {

    @Test
    void getDurationInDays() {
        Project project = new Project(1L,
                "Project 1",
                "Description 1",
                LocalDate.of(2024, 1, 1),
                LocalDate.of(2024, 1, 31));
        assertEquals(31L, project.getDurationInDays());
    }
}