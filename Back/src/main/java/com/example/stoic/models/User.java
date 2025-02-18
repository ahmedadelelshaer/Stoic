package com.example.stoic.Models;

import jakarta.persistence.*;
import org.checkerframework.common.aliasing.qual.Unique;


@Entity
@Table(name="user",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "email"),
                @UniqueConstraint(columnNames = "username")
        })
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idUser")
    private int idUser;

    @Column(name="userName",nullable=false)
    private String username;

    @Column(name="email",nullable=false)
    private String email;

    @Column(name="passHash",nullable=false)
    private String password;

    @Column(name="userRole")
    private UserRole userRole;

    @Column(name="language")
    private Language language;

}
