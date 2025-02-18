package com.example.stoic.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, name = "id_post")
    private int idPost;
    @Column(name = "post_date", nullable = false)
    private Date post_date;


    @Column(name = "post_content", nullable = false)
    private String post_content;
    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false, unique = true)
    private User idUser;

    public Post(Date post_date, String post_content, User idUser) {
        this.post_date = post_date;
        this.post_content = post_content;
        this.idUser = idUser;
    }
    public Post() {}

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "Post{" +
                "idPost=" + idPost +
                ", post_date=" + post_date +
                ", post_content='" + post_content + '\'' +
                ", idUser=" + idUser +
                '}';
    }
}