package com.dh.hoteis.service;

import static org.junit.jupiter.api.Assertions.*;

import com.dh.hoteis.dao.impl.FilialDaoH2;
import com.dh.hoteis.model.Filial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class FilialServiceTest {

    FilialService filialService;
    @BeforeEach
    void doBefore(){
        filialService = new FilialService(new FilialDaoH2());
    }
    @Test
    public void guardarFilial() {

        Filial filial1 = new Filial("Filial 1", "rua das flores", 132, "sao paulo", "SP", true );

        Filial filial2 = new Filial("Filial 2", "rua das macalias", 1546, "sao paulo", "SP", false );

        Filial filial3 = new Filial("Filial 3", "rua das emas", 1883, "sao paulo", "SP", true );

        Filial filial4 = new Filial("Filial 4", "rua dos mouros", 659, "sao paulo", "SP", false );

        Filial filial5 = new Filial("Filial 5", "avenida patajoca", 7986, "sao paulo", "SP", true );

        filialService.salvar(filial1);
        filialService.salvar(filial2);
        filialService.salvar(filial3);
        filialService.salvar(filial4);
        filialService.salvar(filial5);

        Assertions.assertTrue(filial1.getId() > 0);
        Assertions.assertTrue(filial2.getId() > 0);
        Assertions.assertTrue(filial3.getId() > 0);
        Assertions.assertTrue(filial4.getId() > 0);
        Assertions.assertTrue(filial5.getId() > 0);
    }

}