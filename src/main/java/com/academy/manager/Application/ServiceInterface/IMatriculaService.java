package com.academy.manager.Application.ServiceInterface;

import java.util.List;

import com.academy.manager.Application.Dto.MatriculaDto;
import com.academy.manager.Model.Matricula;

public interface IMatriculaService {

  Matricula create(MatriculaDto form);

  Matricula get(Long id);

  List<Matricula> getAll(String bairro);

  void delete(Long id);
}
