package com.example.reactProjectArtifact.entity;

import com.example.reactProjectArtifact.entity.UserEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class StudentScore {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity student;

    private String mark,hours,comment,reason;

    @ManyToOne
    @JoinColumn(name = "lesson_id", referencedColumnName = "id")
    private LessonEntity lessonEntity;
}
