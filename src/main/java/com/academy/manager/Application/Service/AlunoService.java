package com.academy.manager.Application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academy.manager.Application.Dto.AlunoDto;
import com.academy.manager.Application.Dto.AlunoUpdateDto;
import com.academy.manager.Application.ServiceInterface.IAlunoService;
import com.academy.manager.Model.Aluno;
import com.academy.manager.Model.AvaliacaoFisica;
import com.academy.manager.Repository.AlunoRepository;

@Service
public class AlunoService implements IAlunoService{

  @Autowired
  private AlunoRepository repository;
  
  @Override
  public Aluno create(AlunoDto alunoDto) {
    Aluno aluno = new Aluno();
    aluno.setNome(alunoDto.getNome());
    aluno.setCpf(alunoDto.getCpf());
    aluno.setBairro(alunoDto.getBairro());
    aluno.setDataDeNascimento(alunoDto.getDataDeNascimento());
    
    return repository.save(aluno);
  }

  @Override
  public Aluno get(Long id) {

    return null;
  }

  @Override
  public List<Aluno> getAll(String dataDeNascimento) {
    return repository.findAll();
  }

  @Override
  public Aluno update(Long id, AlunoUpdateDto alunoUpdateDto) {

    return null;
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }

  @Override
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
    Aluno aluno = repository.findById(id).get();

    return aluno.getAvaliacoes();
  }
  
}
