package com.example.coursessystem.entities.courses;

import com.example.coursessystem.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "courses")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course extends BaseEntity {

    @NotNull(message = "Title is required")
    @NotBlank(message = "Title may not be blank")
    @Column(name = "title",length = 100)
    @Size(max = 100, message = "Title may not be more than 100 characters")
    private String title;

    @NotNull(message = "Description is required")
    @NotBlank(message = "Description may not be blank")
    @Column(name = "Description",length = 1000)
    @Size(max = 1000, message = "Description may not be more than 1000 characters")
    private String description;


    @NotNull(message = "Price is required")
    @DecimalMin("1.00")
    private BigDecimal price;
}
