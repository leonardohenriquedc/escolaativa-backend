package com.escolaativa.server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

@Embeddable
public class TeamsMissionIds {

  @Column(name = "teams_id")
  private Integer teams;

  @Column(name = "mission_id")
  private Integer mission;

  public TeamsMissionIds(Integer teams, Integer mission) {
    this.teams = teams;
    this.mission = mission;
  }

  public TeamsMissionIds() {
  }

  public void setTeams(Integer teams) {
    this.teams = teams;
  }

  public Integer getTeams() {
    return teams;
  }

  public void setMission(Integer mission) {
    this.mission = mission;
  }

  public Integer getMission() {
    return mission;
  }
}
