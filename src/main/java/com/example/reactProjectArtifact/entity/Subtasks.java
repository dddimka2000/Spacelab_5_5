package com.example.reactProjectArtifact.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "subtasks")
@Data
public class Subtasks {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String name;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "task_id", referencedColumnName = "id")
    private TaskEntity taskEntity;

    private LevelTask levelTask;
    private StatusTask statusTask;
    private String purpose;
    private String content;
}
