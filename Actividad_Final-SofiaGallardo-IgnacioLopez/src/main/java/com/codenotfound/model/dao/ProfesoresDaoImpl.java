package com.codenotfound.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.codenotfound.model.Profesores;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("repositoryB")
public class ProfesoresDaoImpl implements ProfesoresDao {

    @Override
    public List findAll() {
        List<Profesores> list = new ArrayList<Profesores>();
        Profesores profesores = null;
        String data = this.readFile();
        for (String nombreProfesores : data.split(";")) {
            profesores = new Profesores();
            profesores.setNombre(nombreProfesores.trim());
            list.add(profesores);
        }
        return list;
    }

    private String readFile()  {
        String data = "";
        try {
            FileInputStream fis = new FileInputStream("data/academics.txt");
            data = IOUtils.toString(fis, "UTF-8");
            System.out.println(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    
}