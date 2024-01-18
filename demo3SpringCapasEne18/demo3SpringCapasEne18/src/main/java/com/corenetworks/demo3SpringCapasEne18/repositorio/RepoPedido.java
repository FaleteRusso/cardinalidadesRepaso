package com.corenetworks.demo3SpringCapasEne18.repositorio;

import com.corenetworks.demo3SpringCapasEne18.modelo.Pedido;
import org.springframework.stereotype.Repository;

@Repository
public class RepoPedido implements IRepoPedido {
    @Override
    public String insertar(Pedido p) {
        return String.format("Capa repo %s",p.toString());
    }
}
