package com.example.demo.controller.project;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.model.ProjectRest;
import com.example.demo.domain.projects.ProjectService;

@RestController
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping(value = "/projects", produces = "application/json")
    List<ProjectRest> getProjectList() {
        return projectService.getProjects().stream().map(project -> new ProjectRest(
                project.id(), project.name(), project.description(),
                project.startDate(), project.endDate(), project.getDurationInDays())).toList();
    }
}
