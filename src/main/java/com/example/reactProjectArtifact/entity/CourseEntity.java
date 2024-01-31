package com.example.reactProjectArtifact.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "course")
@Data
public class CourseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @OneToMany(mappedBy = "course")
    private List<TaskEntity> taskEntity;

    @OneToMany(mappedBy = "course")
    private List<UserEntity> userEntityList;

    private String name;

    private StatusCourse statusCourse;

    @OneToOne
    @JoinColumn(name = "mentor_id", referencedColumnName = "id")
    private UserEntity mentor;

    @OneToMany(mappedBy = "managedCourse")
    private List<UserEntity> managers;

}
