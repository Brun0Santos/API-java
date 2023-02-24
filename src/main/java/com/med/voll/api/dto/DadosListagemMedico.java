package com.med.voll.api.dto;

import com.med.voll.api.model.Medico;

public record DadosListagemMedico(String nome, String email, String crm, EspecialidadeDto especialidadeDto) {
    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getCrm(), medico.getEmail(), medico.getEspecialidade());
    }
}
