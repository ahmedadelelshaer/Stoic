package com.example.stoic.models;

@Entity
@Table(name="posts")
public class Post{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false , name="id_post")
    private int idPost;
    @Column(name="post_date",nullable = false)
    private Date post_date;
    @Column(name="post_content",nullable = false)
    private String post_content;
    @ManytoOne
    @JoinColumn(name="idUser",nullable = false,unique = true)
    private User idUser;
}