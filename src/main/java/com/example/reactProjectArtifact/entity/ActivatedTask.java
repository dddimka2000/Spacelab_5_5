package com.example.reactProjectArtifact.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table
@Data
public class ActivatedTask {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private StatusTaskForStudent statusTaskForStudent;
    private String debts;//Долги

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private UserEntity student;

    @ManyToOne
    @JoinColumn(name = "task_id", referencedColumnName = "id")
    private TaskEntity task;

    private LocalDate time;


}
