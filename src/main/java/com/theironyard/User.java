package com.theironyard;

import javax.persistence.*;

//field names should be determined by the front end names them
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String username;

    @Column(nullable = false)
    String passord;


    @Column(nullable = false)
    String email;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassord() {
        return this.passord;
    }

    public void setPassord(String passord) {
        this.passord = passord;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}