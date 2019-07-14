package com.codenotfound.services;

import java.util.List;

import javax.inject.Named;

import com.codenotfound.model.*;
import com.codenotfound.model.factory.*;


@Named
public class ProfesoresService {
	
	private ProfesoresDaoFactory profesoresDaoFactory ;
	
	
	public ProfesoresService() {
		this.profesoresDaoFactory = (ProfesoresDaoFactory)DAOFactory.getDAOFactory(DAOFactory.PROFESORES_REPOSITORY);
	}
	

    public List<Profesores> getProfesorestList() {
        return this.profesoresDaoFactory.getProfesoresDao().findAll();

    }
    

}