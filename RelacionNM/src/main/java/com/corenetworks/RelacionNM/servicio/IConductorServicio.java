package com.corenetworks.RelacionNM.servicio;

import com.corenetworks.RelacionNM.modelo.Autobus;
import com.corenetworks.RelacionNM.modelo.Conductor;

import java.util.List;

public interface IConductorServicio {
    Conductor insert(Conductor c);
    Conductor modif(Conductor c);
    void eliminar(String dni);
    List<Conductor> obtenerTodos();
    Conductor obtenerUno(String dni);
}
