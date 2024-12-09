package com.example.demo.domain.model;

import java.time.LocalDate;
import java.time.Period;

public record Project(Long id, String name, String description, LocalDate startDate, LocalDate endDate) {

    public int getDurationInDays() {
       Period period = Period.between(startDate, endDate);
       // Add one day to include the end date
       return period.getDays()+1;
    }
}
