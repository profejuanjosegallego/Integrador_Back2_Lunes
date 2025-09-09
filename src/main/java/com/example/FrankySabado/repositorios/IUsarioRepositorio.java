package com.example.FrankySabado.repositorios;

import com.example.FrankySabado.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository // para que se vuelva un conjunto de consultas
public interface IUsarioRepositorio extends JpaRepository<Usuario, Integer> {
    // JpaRepository <ClaseModelo, TipoDeDatoLlavePrimaria>

    // personalizando consultas
    List<Usuario> findByNombre(String nombre);
    Optional<Usuario> findByCorreo(String correo);


}
