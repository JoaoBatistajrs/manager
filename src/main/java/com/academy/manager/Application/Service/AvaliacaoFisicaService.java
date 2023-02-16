package com.academy.manager.Application.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academy.manager.Application.Dto.AvaliacaoFisicaDto;
import com.academy.manager.Application.Dto.AvaliacaoFisicaUpdateDto;
import com.academy.manager.Application.ServiceInterface.IAvaliacaoFisicaService;
import com.academy.manager.Model.Aluno;
import com.academy.manager.Model.AvaliacaoFisica;
import com.academy.manager.Repository.AlunoRepository;
import com.academy.manager.Repository.AvaliacaoFisicaRepository;

@Service
public class AvaliacaoFisicaService implements IAvaliacaoFisicaService {

  @Autowired
  private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

  @Autowired
  private AlunoRepository alunoRepository;

  @Override
  public AvaliacaoFisica create(AvaliacaoFisicaDto avaliacaoDto) {
    AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
    Aluno aluno = alunoRepository.findById(avaliacaoDto.getAlunoId()).get();

    avaliacaoFisica.setAluno(aluno);
    avaliacaoFisica.setPeso(avaliacaoDto.getPeso());
    avaliacaoFisica.setAltura(avaliacaoDto.getAltura());

    return avaliacaoFisicaRepository.save(avaliacaoFisica);
  }

  @Override
  public Optional<AvaliacaoFisica> get(Long id) {
    return avaliacaoFisicaRepository.findById(id);
  }

  @Override
  public List<AvaliacaoFisica> getAll() {

    return avaliacaoFisicaRepository.findAll();
  }

  @Override
  public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDto AvaliacaoUpdateDto) {
    return null;
  }

  @Override
  public void delete(Long id) {
    avaliacaoFisicaRepository.deleteById(id);
  }
}
