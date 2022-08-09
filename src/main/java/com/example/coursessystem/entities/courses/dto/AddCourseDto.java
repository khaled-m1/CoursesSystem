package com.example.coursessystem.entities.courses.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.math.BigDecimal;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class AddCourseDto {
    private String title;
    private String description;
    private BigDecimal price;
}
