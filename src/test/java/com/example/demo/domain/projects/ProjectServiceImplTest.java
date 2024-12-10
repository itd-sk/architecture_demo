package com.example.demo.domain.projects;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.demo.domain.model.Project;

class ProjectServiceImplTest {

    @Test
    void getProjects() {
        ProjectServiceImpl projectServiceImpl = new ProjectServiceImpl(new Projects() {
            @Override
            public List<Project> getProjects() {
                return List.of(new Project(1L, "Project 1", "Description 1", LocalDate.of(2021, 1, 1), LocalDate.of(2021, 1, 31)),
                        new Project(2L, "Project 2", "Description 2", LocalDate.of(2021, 2, 1), LocalDate.of(2021, 2, 28)));
            }
        });

        List<Project> projects = projectServiceImpl.getProjects();

        assertEquals(2, projects.size());

    }
}