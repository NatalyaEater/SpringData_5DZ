package com.example.SpringData_5DZ.model;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.time.LocalDateTime;

@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime creationDate;


}
