package com.escolaativa.server.entities;

import org.hibernate.id.insert.GetGeneratedKeysDelegate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_mission")
public class Mission {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  private Integer points;

  public Mission(Integer id, String name, Integer points) {
    this.id = id;
    this.name = name;
    this.points = points;
  }

  public Mission() {
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

  public void setPoints(Integer points) {
    this.points = points;
  }

  public Integer getPoints() {
    return points;
  }
}
