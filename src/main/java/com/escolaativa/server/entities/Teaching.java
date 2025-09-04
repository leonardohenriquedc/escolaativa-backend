package com.escolaativa.server.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_teaching")
public class Teaching {

  @EmbeddedId
  private TeachingIds teachingIds = new TeachingIds();

  @ManyToOne(cascade = CascadeType.ALL)
  @MapsId("disciplines") // mapeia pelo campo do EmbeddedId
  @JoinColumn(name = "disciplines_id")
  private Disciplines disciplines;

  @ManyToOne(cascade = CascadeType.ALL)
  @MapsId("classes")
  @JoinColumn(name = "classes_id")
  private Classes classes;

  @ManyToOne
  @MapsId("user")
  @JoinColumn(name = "user_id")
  private User user;

  public Teaching(TeachingIds id, Disciplines disciplines, Classes classes, User user) {
    this.teachingIds = id;
    this.disciplines = disciplines;
    this.classes = classes;
    this.user = user;
  }

  public Teaching() {
  }
}
