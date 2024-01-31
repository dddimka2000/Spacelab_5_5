package com.example.reactProjectArtifact.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class LiteratureEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private TypeLiterature typeLiterature;
    private String name;
    private String link;
    private String keyWords;

    //TODO Eе 1 к 1 делать? Или ее много можно давать. Получается она полностью идет сразу для всех студентов
    //private CourseEntity course;
}
