package com.example.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by xiachao on 2017/3/18.
 */
@Entity
public class User implements Serializable{

    private static final long serialVersionUID = -3773342487087404465L;
    @Id
    @GenericGenerator(name = "userIdGenerator",strategy = "uuid2")
    @GeneratedValue(generator = "userIdGenerator")
    private UUID id;

    @Column
    private String userName;

    @Column
    private String pwd;

    public User() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
