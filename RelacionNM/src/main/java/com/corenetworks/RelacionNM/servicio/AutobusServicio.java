package com.corenetworks.RelacionNM.servicio;

import com.corenetworks.RelacionNM.modelo.Autobus;
import com.corenetworks.RelacionNM.repository.IAutobusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutobusServicio implements IAutobusServicio {
    @Autowired
    private IAutobusRepo repoBus;
    @Override
    public Autobus insert(Autobus a) {
        return repoBus.save(a);
    }

    @Override
    public Autobus modif(Autobus a) {
        return repoBus.save(a);
    }

    @Override
    public void eliminar(String matricula) {
        repoBus.deleteById(matricula);

    }

    @Override
    public List<Autobus> obtenerTodos() {
        return repoBus.findAll();
    }

    @Override
    public Autobus obtenerUno(String matricula) {
        return repoBus.findById(matricula).orElse(new Autobus());
    }
}
