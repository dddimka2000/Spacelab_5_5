package com.example.reactProjectArtifact.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class UserEntity {
    //TODO разделить на таблицы мб студентов и рабочих в компании, которые наследуют UserEntity

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String email;//all

    @JsonIgnore
    private String password;//all

    //  TODO roles

//    @ElementCollection(targetClass = UserRole.class, fetch = FetchType.EAGER)
//    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
//    @Enumerated(EnumType.STRING)
//    private Set<UserRole> roles;

    private String name, surname, middleName, phone, telegram;//all
    private StatusUser statusUser;//
    private String img;//all
    private LocalDate dateJoining;//student
    @JsonIgnore
    private String codeRestorePassword;//all

    private EmploymentStatus employmentStatus;//student

    //TODO educationList на уроке спросим как лучше, два листа или один
    @Column(name = "education_list")
    private List<String> education;//student

    private String placeOfWorking;//student
    private String LevelEnglish;//student
    private Integer mark;//student
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private CourseEntity course;//student

    @OneToMany(mappedBy = "student")
    private List<ActivatedTask> activatedTasks;//student

    @OneToOne(mappedBy = "mentor")
    private CourseEntity mentoringCourse;//mentor

    @ManyToOne
    @JoinColumn(name = "managed_course_id", referencedColumnName = "id")
    private CourseEntity managedCourse;//manager


    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentScore> studentScores;//students

    @OneToOne(mappedBy = "mentor", cascade = CascadeType.ALL, orphanRemoval = true)
    private LessonEntity lessonEntity;
}
