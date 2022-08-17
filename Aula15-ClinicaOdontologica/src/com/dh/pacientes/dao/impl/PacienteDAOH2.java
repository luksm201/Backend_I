package com.dh.pacientes.dao.impl;

import com.dh.pacientes.dao.ConfiguracaoJDBC;
import com.dh.pacientes.dao.iDao;
import com.dh.pacientes.model.Paciente;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PacienteDAOH2 implements iDao <Paciente> {


    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger logger = Logger.getLogger(PacienteDAOH2.class);
    @Override
    public Paciente salvar(Paciente paciente) {

        logger.info("Registrando paciente: " + paciente.getNome());

        configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver", "jdbc:h2:~/paciente;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");

        Connection connection = configuracaoJDBC.getConnection();

        String query = String.format("INSERT INTO Paciente (nome, sobrenome, RG, endereco) values ('%s', '%s', '%s', '%s')",
                paciente.getNome(), paciente.getSobrenome(), paciente.getRG(), paciente.getEndereco());

        try{
            Statement statement =  connection.createStatement();
            statement.execute(query, Statement.RETURN_GENERATED_KEYS);

            ResultSet resultSet = statement.getGeneratedKeys();

            if(resultSet.next()){
                paciente.setId(resultSet.getInt(1));
            }

        }
        catch(Exception e){

            e.printStackTrace();

        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                logger.error(e.getMessage());
                throw new RuntimeException(e);
            }

        }

        return paciente;
    }
}
