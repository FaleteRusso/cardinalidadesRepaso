package com.corenetworks.demo3SpringCapasEne18.servicio;

import com.corenetworks.demo3SpringCapasEne18.modelo.Pedido;
import com.corenetworks.demo3SpringCapasEne18.repositorio.IRepoPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPedido implements IServicioPedido{

    //Llamamos al paquete repositorio
    @Autowired
    private IRepoPedido capaRepo;

    public String insertar(Pedido p) {
        return capaRepo.insertar(p);
    }

}
