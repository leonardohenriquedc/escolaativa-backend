package com.escolaativa.server.entities;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.boot.model.internal.SetBasicValueTypeSecondPass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  private String password;

  private Boolean active;

  @ManyToOne
  @JoinColumn(name = "role_id")
  private Role role;

  @ManyToOne
  @JoinColumn(name = "contacts_id")
  private Contacts contacts;

  public User(Integer id, String name, String password, Boolean active) {
    this.id = id;
    this.name = name;
    this.password = password;
    this.active = active;
  }

  public User() {
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Boolean getActive() {
    return active;
  }
}
