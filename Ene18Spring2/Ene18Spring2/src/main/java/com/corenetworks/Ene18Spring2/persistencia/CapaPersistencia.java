package com.corenetworks.Ene18Spring2.persistencia;

import com.corenetworks.Ene18Spring2.modelo.Cliente;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.PrivateKey;

@Component
public class CapaPersistencia {
    @Autowired
    private IBBDD baseDatos;

    public String insertar(Cliente c){
        return baseDatos.insertar(c);
    }
    public String modificar(Cliente c){
        return baseDatos.modificar(c);
    }
    public String eliminar(Cliente c){
        return baseDatos.eliminar(c);
    }
    public String consultar(Cliente c){
        return baseDatos.consultar(c);
    }



}
