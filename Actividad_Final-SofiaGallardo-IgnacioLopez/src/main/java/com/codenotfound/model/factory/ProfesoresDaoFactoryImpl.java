package com.codenotfound.model.factory;

import com.codenotfound.model.dao.*;

public class ProfesoresDaoFactoryImpl extends ProfesoresDaoFactory {
    //public static final String DATASOURCE = "jdbc/ruda_masindivDS";

    @Override
    public ProfesoresDao getProfesoresDao() {
        return new ProfesoresDaoImpl();
    }


}