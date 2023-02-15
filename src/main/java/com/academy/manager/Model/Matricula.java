package com.academy.manager.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;

@Entity
public class Matricula {
  private Long id;
  private Aluno aluno;
  private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
