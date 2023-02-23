package com.med.voll.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public record MedicoDto(
        Long id,
        @NotBlank
        @Size(min = 3)
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        EspecialidadeDto especialidade,
        @NotNull
        @Valid
        EnderecoDto endereco
) {
}
