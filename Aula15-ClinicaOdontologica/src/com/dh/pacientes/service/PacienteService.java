package com.dh.pacientes.service;


import com.dh.pacientes.dao.impl.PacienteDAOH2;
import com.dh.pacientes.model.Paciente;

import java.sql.SQLException;

public class PacienteService {

    private PacienteDAOH2 pacienteDao;

    public PacienteService(PacienteDAOH2 pacienteDao){

        this.pacienteDao = pacienteDao;

    }

    public Paciente salvar(Paciente paciente) {
        return pacienteDao.salvar(paciente);
    }

}
