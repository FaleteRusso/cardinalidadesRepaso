package com.corenetworks.RelacionNM.servicio;

import com.corenetworks.RelacionNM.modelo.Autobus;
import com.corenetworks.RelacionNM.modelo.Lugar;

import java.util.List;

public interface ILugarServicio {
    Lugar insert(Lugar l);
    Lugar modif(Lugar l);
    void eliminar(int idLugar);
    List<Lugar> obtenerTodos();
    Lugar obtenerUno(int idLugar);
}
