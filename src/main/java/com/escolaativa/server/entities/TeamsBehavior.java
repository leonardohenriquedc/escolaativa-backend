package com.escolaativa.server.entities;

import java.util.Date;

import org.hibernate.id.insert.GetGeneratedKeysDelegate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_teams_behavior")
public class TeamsBehavior {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "behavior_id")
  private Behavior behavior;

  @ManyToOne
  @JoinColumn(name = "teams_id")
  private Teams teams;

  private Date createIn;

  public TeamsBehavior(Integer id, Behavior behavior, Teams teams, Date createIn) {
    this.id = id;
    this.behavior = behavior;
    this.teams = teams;
    this.createIn = createIn;
  }

  public TeamsBehavior() {
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setBehavior(Behavior behavior) {
    this.behavior = behavior;
  }

  public Behavior getBehavior() {
    return behavior;
  }

  public void setTeams(Teams teams) {
    this.teams = teams;
  }

  public Teams getTeams() {
    return teams;
  }

  public void setCreateIn(Date createIn) {
    this.createIn = createIn;
  }

  public Date getCreateIn() {
    return createIn;
  }
}
