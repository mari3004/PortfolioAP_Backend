
package com.ar.maribelaizpitarte.backend.controller;

import com.ar.maribelaizpitarte.backend.entity.Usuario;

import java.util.List;
import java.util.Optional;
import javax.persistence.TypedQuery;

public class DaoUsuario implements Dao<Usuario>{

    @Override
    public Optional<Usuario> get(int id) {
        return Optional.ofNullable(DataBase.conection().find(Usuario.class, id));
    }

    @Override
    public List<Usuario> getAll() {
        return null;
    }

    @Override
    public boolean save(Usuario usuario) {
        return false;
    }

    @Override
    public void delete(Usuario usuario) {

    }

    public Usuario getUserByNombreUsuario(String nombreUsuario){
        DataBase.connect();
        TypedQuery<Usuario> query = DataBase.conection().createQuery(
                "SELECT u FROM Usuario u WHERE u.nombreUsu = :nu" , Usuario.class);
        return query.setParameter("nu", nombreUsuario).getSingleResult();
    }
}