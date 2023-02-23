package com.med.voll.api.dto;

public record MedicoDto(
        Long id,
        String nome,
        String email,
        String crm,
        EspecialidadeDto especialidade,
        EnderecoDto endereco
) {
}
