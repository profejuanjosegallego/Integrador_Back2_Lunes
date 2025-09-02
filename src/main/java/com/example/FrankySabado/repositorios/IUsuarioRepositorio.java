package com.example.FrankySabado.repositorios;


import com.example.FrankySabado.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer> {

    

}
