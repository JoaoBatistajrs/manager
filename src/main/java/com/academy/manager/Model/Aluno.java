package com.academy.manager.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aluno {

  private Long id;
  private String nome;
  private String cpf;
  private String bairro;
  private LocalDate dataDeNascimento;
  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
}
