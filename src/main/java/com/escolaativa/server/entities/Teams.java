package com.escolaativa.server.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_teams")
public class Teams {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  private String leader;

  @ManyToOne
  @JoinColumn(name = "classes_id")
  private Classes classes;

  @OneToMany(mappedBy = "teams")
  private List<TeamsBehavior> teamsBehaviors = new ArrayList<>();

  public Teams(Integer id, String name, String leader, Classes classes) {
    this.id = id;
    this.name = name;
    this.leader = leader;
    this.classes = classes;
  }

  public Teams() {
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

  public void setLeader(String leader) {
    this.leader = leader;
  }

  public String getLeader() {
    return leader;
  }

  public void setClasses(Classes classes) {
    this.classes = classes;
  }

  public Classes getClasses() {
    return classes;
  }
}
