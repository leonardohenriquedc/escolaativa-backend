package com.escolaativa.server.entities;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_behavior")
public class Behavior {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  private String description;

  private String points;

  private String active;

  @OneToMany(mappedBy = "behavior")
  private List<TeamsBehavior> teamsBehaviors = new ArrayList<>();

  public Behavior(Integer id, String name, String description, String points, String active) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.points = points;
    this.active = active;
  }

  public Behavior() {
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

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

}
