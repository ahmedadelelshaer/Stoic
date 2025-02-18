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


    public User(String username, String email, String password, UserRole userRole, Language language) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.userRole = userRole;
        this.language = language;
    }
    public User() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userRole=" + userRole +
                ", language=" + language +
                '}';
    }
}
