package com.academy.manager.Repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.academy.manager.Model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
