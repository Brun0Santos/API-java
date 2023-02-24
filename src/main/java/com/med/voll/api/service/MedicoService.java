package com.med.voll.api.service;

import com.med.voll.api.dto.DadosListagemMedico;
import com.med.voll.api.dto.MedicoDto;
import com.med.voll.api.model.Medico;
import com.med.voll.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository repository;

    public void cadastrar(@RequestBody MedicoDto dadosDto) {
        repository.save(new Medico(dadosDto));
    }

    public Page<DadosListagemMedico> buscarMedico(Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }

    public DadosListagemMedico buscarPorId(Long id) {
        return new DadosListagemMedico(repository.findAllById(id));
    }
}
