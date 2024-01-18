package com.corenetworks.demo3SpringCapasEne18.servicio;

import com.corenetworks.demo3SpringCapasEne18.modelo.Inmueble;
import com.corenetworks.demo3SpringCapasEne18.repositorio.IRepoInmueble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioInmueble implements ISevicioInmueble {
    //Declara variable sobre la interfaz de la BBDD
    @Autowired
    private IRepoInmueble capaRepoInmueble;

    @Override
    public String insertar(Inmueble i) {
        return capaRepoInmueble.insertar(i);
    }
}
