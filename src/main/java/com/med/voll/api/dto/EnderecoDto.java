package com.med.voll.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EnderecoDto(
        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank
        String complemento,
        @NotBlank
        String numero,
        @NotBlank
        String cidade,
        String uf,
        @Pattern(regexp = "\\d{8}")
        String cep
) {
}
