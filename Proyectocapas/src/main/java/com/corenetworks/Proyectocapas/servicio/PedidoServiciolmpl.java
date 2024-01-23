package com.corenetworks.Proyectocapas.servicio;

import com.corenetworks.Proyectocapas.modelo.Pedido;
import com.corenetworks.Proyectocapas.repository.IPedidoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiciolmpl implements IPedidoServicio{
    @Autowired
    private IPedidoRepo repositorio;
    @Override
    public Pedido insertar(Pedido p) {
        return repositorio.save(p) ;
    }

    @Override
    public Pedido modificar(Pedido p) {
        return null;
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }

    @Override
    public Pedido obtenerUno(int id) {
        return repositorio.findById(id).orElse(new Pedido());
    }

    @Override
    public List<Pedido> obtenerTodos() {
        return repositorio.findAll();
    }
}
