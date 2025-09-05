package com.escolaativa.server.entities;

import java.util.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_teams_mission")
public class TeamsMission {

  @EmbeddedId
  private TeamsMissionIds id = new TeamsMissionIds();

  @ManyToOne
  @MapsId("teams")
  @JoinColumn(name = "teams_id")
  private Teams teams;

  @ManyToOne
  @MapsId("mission")
  @JoinColumn(name = "mission_id")
  private Mission mission;

  private Boolean completed;

  private Date createIn;

  public TeamsMission(TeamsMissionIds id, Boolean completed, Date createIn) {
    this.id = id;
    this.completed = completed;
    this.createIn = createIn;
  }

  public void setId(TeamsMissionIds id) {
    this.id = id;
  }

  public TeamsMissionIds getId() {
    return id;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public Boolean getCompleted() {
    return completed;
  }

  public void setCreateIn(Date createIn) {
    this.createIn = createIn;
  }

  public Date getCreateIn() {
    return createIn;
  }
}
