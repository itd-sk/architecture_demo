package com.example.demo.controller.model;

import java.time.LocalDate;

public record ProjectRest(Long id, String name, String description, LocalDate startDate,
                          LocalDate endDate, int durationInDays) {
}
