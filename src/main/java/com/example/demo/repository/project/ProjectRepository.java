package com.example.demo.repository.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.ProjectEntity;

interface ProjectRepositoryJpa extends JpaRepository<ProjectEntity, Long> {
}

@Repository
public class ProjectRepository {
    // TODO: Implement the ProjectRepository class
}