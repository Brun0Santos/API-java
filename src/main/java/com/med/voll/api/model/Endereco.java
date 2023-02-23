package com.med.voll.api.model;

import com.med.voll.api.dto.EnderecoDto;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Embeddable
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(EnderecoDto dadosDto) {
        this.logradouro = dadosDto.logradouro();
        this.bairro = dadosDto.bairro();
        this.cep = dadosDto.cep();
        this.numero = dadosDto.numero();
        this.complemento = dadosDto.complemento();
        this.cidade = dadosDto.cidade();
        this.uf = dadosDto.uf();
    }
}
