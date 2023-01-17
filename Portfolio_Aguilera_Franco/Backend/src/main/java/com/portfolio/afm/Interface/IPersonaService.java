package com.portfolio.afm.Interface;

import com.portfolio.afm.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer una lista de Personas
    public List<Persona> getPersona();
    
    //guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //eliminar objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //buscar una Persona por id
    public Persona findPersona(Long id);
    
}