package com.dh.pacientes.service;

import static org.junit.jupiter.api.Assertions.*;

import com.dh.pacientes.dao.impl.PacienteDAOH2;
import com.dh.pacientes.model.Paciente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class PacienteServiceTest {

    PacienteService pacienteService;
    @BeforeEach
    void doBefore(){
        pacienteService = new PacienteService(new PacienteDAOH2());
    }
    @Test
    public void guardarPaciente() {

        Paciente paciente = new Paciente("Fulano", "Ciclano", "4501021231", "Rua das Flores, 123" );

        pacienteService.salvar(paciente);

        Assertions.assertTrue(paciente.getId() > 0);
    }

    }
