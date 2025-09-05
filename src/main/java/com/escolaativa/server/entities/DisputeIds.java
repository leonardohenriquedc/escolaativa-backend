package com.escolaativa.server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.criteria.CriteriaBuilder.In;

@Embeddable
public class DisputeIds {

  @Column(name = "tournaments_id")
  private Integer tournaments;

  @Column(name = "teams_id")
  private Integer teams;

  public DisputeIds(Integer tournaments, Integer teams) {
    this.teams = teams;
    this.tournaments = tournaments;
  }

  public DisputeIds() {
  }

  public void setTournaments(Integer tournaments) {
    this.tournaments = tournaments;
  }

  public Integer getTournaments() {
    return tournaments;
  }

  public void setTeams(Integer teams) {
    this.teams = teams;
  }

  public Integer getTeams() {
    return teams;
  }
}
