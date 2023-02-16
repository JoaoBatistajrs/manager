package com.academy.manager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.academy.manager.Application.Dto.AlunoDto;
import com.academy.manager.Application.Service.AlunoService;
import com.academy.manager.Model.Aluno;
import com.academy.manager.Model.AvaliacaoFisica;



@RestController
@RequestMapping("/alunos")
public class AlunoController {
  
  @Autowired
  private AlunoService service;

  @PostMapping
  public Aluno create(@RequestBody AlunoDto alunoDto) {
    return service.create(alunoDto);
  }

  @GetMapping("/avaliacoes/{id}")
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
    return service.getAllAvaliacaoFisicaId(id);
  }

  @GetMapping
  public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                                  String dataDeNacimento){
    return service.getAll(dataDeNacimento);
  }
}
