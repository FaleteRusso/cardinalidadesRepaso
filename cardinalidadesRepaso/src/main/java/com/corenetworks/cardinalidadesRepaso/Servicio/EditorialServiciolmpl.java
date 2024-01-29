package com.corenetworks.cardinalidadesRepaso.Servicio;

import com.corenetworks.cardinalidadesRepaso.modelo.Editorial;
import com.corenetworks.cardinalidadesRepaso.repository.IEditorialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EditorialServiciolmpl implements IEditorialServicio{
    @Autowired
    private IEditorialRepo editorialRepo;
    @Override
    public Editorial crear(Editorial e) {
        return editorialRepo.save(e);
    }

    @Override
    public Editorial modificar(Editorial e) {
        return editorialRepo.save(e);
    }

    @Override
    public void eliminar(int id) {
editorialRepo.deleteById(id);
    }

    @Override
    public Editorial consultarUno(int id) {
        return editorialRepo.findById(id).orElse(new Editorial());
    }

    @Override
    public List<Editorial> consultarTodos() {
        return editorialRepo.findAll();
    }
}
