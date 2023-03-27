package com.basedatos.basededatos.models;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;


@Entity
@Table(schema = "Register")
@CrossOrigin

public class RegisterModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column (name = "confirmpassword")
    private String confirmpassword;

    @Column (name = "email")
    private String email;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser_name() {
        return username;
    }

    public void setUser_name(String user_name) {
        this.username = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirmpassword;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirmpassword = confirm_password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}