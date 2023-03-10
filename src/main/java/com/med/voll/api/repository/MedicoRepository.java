package com.med.voll.api.repository;

import com.med.voll.api.dto.MedicoDto;
import com.med.voll.api.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Medico findAllById(Long id);

}
