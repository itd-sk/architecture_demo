package com.example.demo.repository.project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.model.Project;
import com.example.demo.domain.projects.Projects;
import com.example.demo.repository.model.ProjectEntity;

interface ProjectRepositoryJpa extends JpaRepository<ProjectEntity, Long> {
}

@Repository
public class ProjectRepository implements Projects {
    private ProjectRepositoryJpa projectRepositoryJpa;
    public ProjectRepository(ProjectRepositoryJpa projectRepositoryJpa) {
        this.projectRepositoryJpa = projectRepositoryJpa;

    }
    public List<Project> getProjects() {
        List<ProjectEntity> projectEntities = projectRepositoryJpa.findAll();
        return projectEntities.stream()
                .map(projectEntity -> new Project(projectEntity.getId(), projectEntity.getName(), projectEntity.getDescription(), projectEntity.getStartDate(),
                        projectEntity.getEndDate()))
                .toList();
    }
}