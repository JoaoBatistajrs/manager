package com.academy.manager.Application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academy.manager.Application.Dto.MatriculaDto;
import com.academy.manager.Application.ServiceInterface.IMatriculaService;
import com.academy.manager.Model.Aluno;
import com.academy.manager.Model.Matricula;
import com.academy.manager.Repository.AlunoRepository;
import com.academy.manager.Repository.MatriculaRepository;

@Service
public class MatriculaService implements IMatriculaService {

  @Autowired
  private MatriculaRepository matriculaRepository;

  @Autowired
  private AlunoRepository alunoRepository;

  @Override
  public Matricula create(MatriculaDto matriculaDto) {
    Matricula matricula = new Matricula();
    Aluno aluno = alunoRepository.findById(matriculaDto.getAlunoId()).get();

    matricula.setAluno(aluno);

    return matriculaRepository.save(matricula);
  }

  @Override
  public Matricula get(Long id) {
    return matriculaRepository.findById(id).get();
  }

  @Override
  public List<Matricula> getAll(String bairro) {

    if(bairro == null){
      return matriculaRepository.findAll();
    }else{
      return matriculaRepository.findAlunosMatriculadosBairro(bairro);
    }

  }

  @Override
  public void delete(Long id) {
    matriculaRepository.deleteById(id);
  }
}
