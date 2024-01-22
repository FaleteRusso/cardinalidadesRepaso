package com.corenetworks.repasoentidadeshibernat22ene.servicio;

import com.corenetworks.repasoentidadeshibernat22ene.modelo.Socio;
import com.corenetworks.repasoentidadeshibernat22ene.repository.ISocioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Service
public class SocioServiciolmpl implements ISocioServicio{
    @Autowired
    private ISocioRepo repo;
    @Override
    public List<Socio> mostrarTodos() {
        return repo.findAll();
    }

    @Override
    public Socio mostrarUno(String dni) {
        return repo.findById(dni).orElse(new Socio());
    }

    @Override
    public Socio insertar(Socio s1) {
        return null;
    }

    @Override
    public Socio modificar(Socio s1) {
        return null;
    }

    @Override
    public void eliminar(String dni) {

    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Socio> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Socio> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Socio> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Socio getOne(String s) {
        return null;
    }

    @Override
    public Socio getById(String s) {
        return null;
    }

    @Override
    public Socio getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends Socio> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Socio> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Socio> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Socio> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Socio> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Socio> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Socio, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Socio> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Socio> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Socio> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<Socio> findAll() {
        return null;
    }

    @Override
    public List<Socio> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Socio entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Socio> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Socio> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Socio> findAll(Pageable pageable) {
        return null;
    }
}
