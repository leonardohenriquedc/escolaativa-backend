package com.escolaativa.server.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_dispute")
public class Dispute {

  @EmbeddedId
  private DisputeIds id = new DisputeIds();

  @ManyToOne
  @MapsId(value = "teams")
  @JoinColumn(name = "teams_id")
  private Teams teams;

  @ManyToOne
  @MapsId(value = "tournaments")
  @JoinColumn(name = "tournaments_id")
  private Tournaments tournaments;

  public Dispute(DisputeIds id, Teams teams, Tournaments tournaments) {
    this.id = id;
    this.teams = teams;
    this.tournaments = tournaments;
  }

  public void setId(DisputeIds id) {
    this.id = id;
  }

  public DisputeIds getId() {
    return id;
  }

  public void setTeams(Teams teams) {
    this.teams = teams;
  }

  public Teams getTeams() {
    return teams;
  }

  public void setTournaments(Tournaments tournaments) {
    this.tournaments = tournaments;
  }

  public Tournaments getTournaments() {
    return tournaments;
  }
}
