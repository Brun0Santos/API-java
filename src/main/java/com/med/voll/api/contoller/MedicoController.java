package com.med.voll.api.contoller;

import com.med.voll.api.dto.MedicoDto;
import com.med.voll.api.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService service;

    @PostMapping
    public void cadastrarMedico(@RequestBody MedicoDto medicoDto) {
        service.cadastrar(medicoDto);
    }
}
