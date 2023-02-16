package com.academy.manager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.academy.manager.Application.Dto.MatriculaDto;
import com.academy.manager.Application.Service.MatriculaService;
import com.academy.manager.Model.Matricula;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
  
  @Autowired
  private MatriculaService service;

  @PostMapping
  public Matricula create(@RequestBody MatriculaDto matriculaDto) {
    return service.create(matriculaDto);
  }

  @GetMapping
  public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
    return service.getAll(bairro);
  }

}
