package com.web.aulaweb.domain.service;

import com.web.aulaweb.domain.model.Sala;
import com.web.aulaweb.domain.repository.SalaRepository;
import com.web.aulaweb.domain.resource.SalaRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    public void salvar(){

        var obj = salaRepository.findById(5l);

        System.out.println(obj.toString());

        Sala sala = null;
        
        salaRepository.save(sala);

    }

    public void arthur(SalaRequest obj){

    }
    
}
