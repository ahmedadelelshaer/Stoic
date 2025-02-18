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
    public int idUser;

    @Column(name="userName",nullable=false)
    public String username;

    @Column(name="email",nullable=false)
    public String email;

    @Column(name="passHash",nullable=false)
    public String password;

    @Column(name="userRole")
    public UserRole userRole;

    @Column(name="language")
    public Language language;

}
