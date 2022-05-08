package com.cuhksz.admin.entity;

import javax.persistence.*;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.Date;

// template user schema
@Entity
public@Table(name = "users")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String fullName;

    private Date createdAt;
    private String password;
    private String bankAccount;

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bank_account) {
        this.bankAccount = bank_account;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date created_at) {
        this.createdAt = created_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String username) {
        this.fullName = username;
    }

    public String getFullName() {return fullName; }

    public void setPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        this.password = encoder.encode(password);
    }

    public boolean checkPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password).equals(this.password);
    }
}
