package com.codenotfound.model.factory;

import com.codenotfound.model.dao.*;

public abstract class ProfesoresDaoFactory extends DAOFactory{
	
    public abstract ProfesoresDao getProfesoresDao();
    
}



