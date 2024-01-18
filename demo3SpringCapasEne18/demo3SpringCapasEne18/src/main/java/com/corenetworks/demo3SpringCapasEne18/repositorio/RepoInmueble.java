package com.corenetworks.demo3SpringCapasEne18.repositorio;

import com.corenetworks.demo3SpringCapasEne18.modelo.Inmueble;
import org.springframework.stereotype.Repository;

@Repository
public class RepoInmueble implements IRepoInmueble{
    @Override
    public String insertar(Inmueble i) {
        return String.format("Capa repo simulando BBDD %s",i.toString());
    }
}
