package com.escolaativa.server.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class TeachingIds implements Serializable {

  @Column(name = "disciplines_id")
  private Integer disciplines;

  @Column(name = "classes_id")
  private Integer classes;

  @Column(name = "user_id")
  private Integer user;

  public TeachingIds(Integer user, Integer disciplines, Integer classes) {
    this.user = user;
    this.classes = classes;
    this.disciplines = disciplines;
  }

  public TeachingIds() {
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass())
      return false;
    TeachingIds that = (TeachingIds) obj;
    return Objects.equals(disciplines, that.disciplines) && Objects.equals(user, that.user)
        && Objects.equals(classes, that.classes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disciplines, user, classes);
  }

  public void setUser(Integer user) {
    this.user = user;
  }

  public Integer getUser() {
    return user;
  }

  public void setClasses(Integer classes) {
    this.classes = classes;
  }

  public Integer getClasses() {
    return classes;
  }

  public void setDisciplines(Integer disciplines) {
    this.disciplines = disciplines;
  }

  public Integer getDisciplines() {
    return disciplines;
  }
}
