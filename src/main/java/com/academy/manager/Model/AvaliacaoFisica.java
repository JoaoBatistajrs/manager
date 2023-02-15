package com.academy.manager.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;

@Entity
public class AvaliacaoFisica {
  private Long id;
  private Aluno aluno;
  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();
  private Double peso;
  private Double altura;
}
