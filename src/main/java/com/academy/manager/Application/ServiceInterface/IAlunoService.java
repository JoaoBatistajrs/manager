package com.academy.manager.Application.ServiceInterface;

import java.util.List;

import com.academy.manager.Application.Dto.AlunoDto;
import com.academy.manager.Application.Dto.AlunoUpdateDto;
import com.academy.manager.Model.Aluno;
import com.academy.manager.Model.AvaliacaoFisica;

public interface IAlunoService {

  Aluno create(AlunoDto form);

  Aluno get(Long id);

  List<Aluno> getAll(String dataDeNascimento);

  Aluno update(Long id, AlunoUpdateDto formUpdate);

  void delete(Long id);
  
  List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}