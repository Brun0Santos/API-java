package com.med.voll.api.contoller;

import com.med.voll.api.dto.DadosListagemMedico;
import com.med.voll.api.dto.MedicoDto;
import com.med.voll.api.service.MedicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService service;

    @Transactional
    @PostMapping
    public void cadastrarMedico(@Valid @RequestBody MedicoDto medicoDto) {
        service.cadastrar(medicoDto);
    }

    @GetMapping
    public List<DadosListagemMedico> listar() {
        return service.getMedico();
    }
}
