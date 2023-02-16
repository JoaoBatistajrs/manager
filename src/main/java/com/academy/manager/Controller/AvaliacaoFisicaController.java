package com.academy.manager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academy.manager.Application.Dto.AvaliacaoFisicaDto;
import com.academy.manager.Application.Service.AvaliacaoFisicaService;
import com.academy.manager.Model.AvaliacaoFisica;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
  
  @Autowired
  private AvaliacaoFisicaService service;

  @PostMapping
  public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaDto avaliacaoDto) {
    return service.create(avaliacaoDto);
  }

  @GetMapping
  public List<AvaliacaoFisica> getAll(){
    return service.getAll();
  }

  @DeleteMapping
  public void delete(@RequestBody Long id){
    service.delete(id);
  }

}
