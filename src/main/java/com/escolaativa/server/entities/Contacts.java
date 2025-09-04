package com.escolaativa.server.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_contacts")
public class Contacts {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String telephone;

  private String email;

  @OneToMany(mappedBy = "contacts")
  private List<User> users = new ArrayList<>();

  public Contacts(Integer id, String telephone, String email) {
    this.id = id;
    this.telephone = telephone;
    this.email = email;
  }

  public Contacts() {
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }
}
