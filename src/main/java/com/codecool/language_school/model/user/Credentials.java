package com.codecool.language_school.model.user;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Credentials {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    private String email;

    @Basic
    private String login;

    @Basic
    private String password;

    public Credentials(String email, String login, String password) {
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public Credentials() {}

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
