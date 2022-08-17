package com.dh.hoteis.service;

import com.dh.hoteis.dao.impl.FilialDaoH2;
import com.dh.hoteis.model.Filial;

import java.sql.SQLException;

public class FilialService {

    private FilialDaoH2 filialDao;

    public FilialService(FilialDaoH2 filialDao){

        this.filialDao = filialDao;

    }

    public Filial salvar(Filial filial) {
        return filialDao.salvar(filial);
    }

}
