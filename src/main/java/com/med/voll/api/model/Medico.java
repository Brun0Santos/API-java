package com.med.voll.api.model;

import com.med.voll.api.dto.EspecialidadeDto;
import com.med.voll.api.dto.MedicoDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "tb_medicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;
    @Enumerated(EnumType.STRING)
    private EspecialidadeDto especialidade;
    @Embedded
    private Endereco endereco;

    public Medico(MedicoDto dadosDto) {
        this.nome = dadosDto.nome();
        this.email = dadosDto.email();
        this.crm = dadosDto.crm();
        especialidade = dadosDto.especialidade();
        endereco = new Endereco(dadosDto.endereco());
    }
}