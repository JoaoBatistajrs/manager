package com.academy.manager.Application.ServiceInterface;

import java.util.List;
import java.util.Optional;

import com.academy.manager.Application.Dto.AvaliacaoFisicaDto;
import com.academy.manager.Application.Dto.AvaliacaoFisicaUpdateDto;
import com.academy.manager.Model.AvaliacaoFisica;

public interface IAvaliacaoFisicaService {

  AvaliacaoFisica create(AvaliacaoFisicaDto form);

  Optional<AvaliacaoFisica> get(Long id);

  List<AvaliacaoFisica> getAll();

  AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDto formUpdate);

  void delete(Long id);
}
