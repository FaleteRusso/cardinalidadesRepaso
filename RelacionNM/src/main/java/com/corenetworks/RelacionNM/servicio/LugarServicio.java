package com.corenetworks.RelacionNM.servicio;

import com.corenetworks.RelacionNM.modelo.Lugar;
import com.corenetworks.RelacionNM.repository.ILugarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LugarServicio implements ILugarServicio{
    @Autowired
    private ILugarRepo lugarRepo;
    @Override
    public Lugar insert(Lugar l) {
        return lugarRepo.save(l);
    }

    @Override
    public Lugar modif(Lugar l) {
        return lugarRepo.save(l);
    }

    @Override
    public void eliminar(int idLugar) {
        lugarRepo.deleteById(idLugar);

    }

    @Override
    public List<Lugar> obtenerTodos() {
        return lugarRepo.findAll();
    }

    @Override
    public Lugar obtenerUno(int idLugar) {
        return lugarRepo.findById(idLugar).orElse(new Lugar());
    }
}
