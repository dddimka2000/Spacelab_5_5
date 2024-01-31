package com.example.reactProjectArtifact.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class ContactEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    //TODO по макапу не понял, нужно ли это поле вообще.
}
