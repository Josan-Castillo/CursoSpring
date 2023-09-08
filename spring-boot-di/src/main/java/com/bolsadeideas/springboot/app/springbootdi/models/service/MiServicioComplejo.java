package com.bolsadeideas.springboot.app.springbootdi.models.service;

import org.springframework.stereotype.Component;

//@Component("MiServicioComplejo")
public class MiServicioComplejo implements IServicio {

    @Override
    public String operacion(){

        return "Ejecutando algun proceso importante desde complejo";
    }
    
}
