package com.corenetworks.demo3SpringCapasEne18.servicio;

import com.corenetworks.demo3SpringCapasEne18.modelo.Factura;
import com.corenetworks.demo3SpringCapasEne18.repositorio.IRepoFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciFactura implements IServicioFactura{
    //Declarar variable, sobre la interfaz de la BBDD
    @Autowired
    private IRepoFactura capaRepoFactura;
    @Override
    public String insertar(Factura f) {
        return capaRepoFactura.insertar(f);
    }
}
