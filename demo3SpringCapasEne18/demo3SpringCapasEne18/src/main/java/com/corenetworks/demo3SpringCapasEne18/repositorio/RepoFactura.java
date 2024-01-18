package com.corenetworks.demo3SpringCapasEne18.repositorio;

import com.corenetworks.demo3SpringCapasEne18.modelo.Factura;
import com.corenetworks.demo3SpringCapasEne18.modelo.Pedido;
import org.springframework.stereotype.Repository;

@Repository
public class RepoFactura implements IRepoFactura {

    @Override
    public String insertar(Factura f) {
        return String.format("capa repo simulando BBDD %s",f.toString());
    }
}
