package com.codenotfound.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import com.codenotfound.model.*;
import com.codenotfound.services.*;

@Named
public class ProfesoresController{

  private String firstName = "pablo";
  private String lastName = "escobar";
  
  private List<Profesores> listaProfesores = new ArrayList<Profesores>();
  
  @Inject
  private ProfesoresService profesoresService;

  @PostConstruct
  public void init(){
    this.listaProfesores = profesoresService.getProfesorestList();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String showGreeting() {
    Profesores s = new Profesores();
    s.setNombre(firstName + " " + lastName);
    this.listaProfesores.add(s);
    return "Hello " + firstName + " " + lastName + "!";
  }

    /**
     * @return List<Profesores> return the listaProfesores
     */
    public List<Profesores> getListaProfesores() {
        return listaProfesores;
    }

}
