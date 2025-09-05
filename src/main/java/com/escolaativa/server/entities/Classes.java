package com.escolaativa.server.entities;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_classes")
public class Classes {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String degree;

  private String series;

  private Year yearOfClass;

  private String period;

  private String educationLevel;

  @OneToMany(mappedBy = "classes")
  private List<Tournaments> tournaments = new ArrayList<>();

  @OneToMany(mappedBy = "classes")
  private List<Teams> teams = new ArrayList<>();

  public Classes(Integer id, String degree, String series, Year year, String period, String educationLevel) {
    this.id = id;
    this.degree = degree;
    this.series = series;
    this.yearOfClass = year;
    this.period = period;
    this.educationLevel = educationLevel;
  }

  public Classes() {
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }

  public String getDegree() {
    return degree;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public String getSeries() {
    return series;
  }

  public void setYear(Year year) {
    this.yearOfClass = year;
  }

  public Year getYear() {
    return yearOfClass;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public String getPeriod() {
    return period;
  }

  public void setEducationLevel(String educationLevel) {
    this.educationLevel = educationLevel;
  }

  public String getEducationLevel() {
    return educationLevel;
  }
}
