package com.med.voll.api.service;

import com.med.voll.api.dto.MedicoDto;
import com.med.voll.api.model.Medico;
import com.med.voll.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository repository;

    public void cadastrar(@RequestBody MedicoDto dadosDto) {
        repository.save(new Medico(dadosDto));
    }
}
