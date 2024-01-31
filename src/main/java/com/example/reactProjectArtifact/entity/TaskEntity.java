package com.example.reactProjectArtifact.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "tasks")
public class TaskEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String name;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private CourseEntity course;

    private LevelTask levelTask;
    private StatusTask statusTask;
    private String purpose;
    private String content;

    @OneToMany(mappedBy = "taskEntity")
    private List<Subtasks> subtasks;

    @JsonIgnore
    @OneToMany(mappedBy = "task")
    private List<ActivatedTask> activatedTasks;
}
