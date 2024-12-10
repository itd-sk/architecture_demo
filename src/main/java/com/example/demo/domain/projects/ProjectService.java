package com.example.demo.domain.projects;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.model.Project;

public interface ProjectService {
    List<Project> getProjects();
}

@Service
class ProjectServiceImpl
        implements ProjectService {

    private final Projects projects;

    public ProjectServiceImpl(Projects projects) {
        this.projects = projects;
    }

    @Override
    public List<Project> getProjects() {
        return projects.getProjects();

    }
}