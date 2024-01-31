package com.example.reactProjectArtifact.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class LessonEntity {
    //Занятие
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity mentor;

    @OneToMany(mappedBy = "lessonEntity")
    private List<StudentScore> studentScores;
}
