package com.web.aulaweb.domain.repository;
import com.web.aulaweb.domain.model.Aluno;


import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long>  {
    
}
