package com.corenetworks.RelacionNM.servicio;

import com.corenetworks.RelacionNM.modelo.Autobus;

import java.util.List;

public interface IAutobusServicio {
    Autobus insert(Autobus a);
    Autobus modif(Autobus a);
    void eliminar(String matricula);
    List<Autobus> obtenerTodos();
    Autobus obtenerUno(String matricula);

}
