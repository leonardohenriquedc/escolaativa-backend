package com.escolaativa.server.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tournaments")
public class Tournaments {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  private String award;

  private String bimester;

  private Date createIn;

  @ManyToOne
  @JoinColumn(name = "classes_id")
  private Classes classes;

  public Tournaments(Integer id, String name, String award, String bimester, Date createIn) {
    this.id = id;
    this.name = name;
    this.award = award;
    this.bimester = bimester;
    this.createIn = createIn;
  }

  public Tournaments() {
  }
}
