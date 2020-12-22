package com.example.STM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String name;

    private String lastName;

    @Column(unique = true)
    private String email;

    private String password;

    private boolean status = false;

    @Column(name = "registration_time")
    private LocalDateTime registrationDateTime = LocalDateTime.now() ;
}
