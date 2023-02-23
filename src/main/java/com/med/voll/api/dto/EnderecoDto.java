package com.med.voll.api.dto;

public record EnderecoDto(String logradouro, String bairro, String complemento, String numero,
                          String cidade, String uf, String cep
) {
}
