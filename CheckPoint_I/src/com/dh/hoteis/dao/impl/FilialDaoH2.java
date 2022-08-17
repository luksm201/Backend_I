package com.dh.hoteis.dao.impl;

import com.dh.hoteis.dao.ConfiguracaoJDBC;
import com.dh.hoteis.dao.iDao;
import com.dh.hoteis.model.Filial;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FilialDaoH2 implements iDao <Filial> {


    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger logger = Logger.getLogger(FilialDaoH2.class);
    @Override
    public Filial salvar(Filial filial) {

        logger.info("Registrando filial: " + filial.getNome());

        configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver", "jdbc:h2:~/filial;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");

        Connection connection = configuracaoJDBC.getConnection();

        String query = String.format("INSERT INTO Filial (nome, rua, numero, cidade, estado, e5Estrelas) values ('%s', '%s', '%d', '%s', '%s', '%b')",
                filial.getNome(), filial.getRua(), filial.getNumero(), filial.getCidade(), filial.getEstado(), filial.isE5Estrelas());

        try{
            Statement statement =  connection.createStatement();
            statement.execute(query, Statement.RETURN_GENERATED_KEYS);

            ResultSet resultSet = statement.getGeneratedKeys();

            if(resultSet.next()){
                filial.setId(resultSet.getInt(1));
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

        return filial;
    }
}
