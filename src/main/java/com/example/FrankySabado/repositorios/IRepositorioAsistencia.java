package com.example.FrankySabado.repositorios;

import com.example.FrankySabado.modelos.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;
@Repository
public interface IRepositorioAsistencia extends JpaRepository <Asistencia, Integer >{

    List<Asistencia> findByFechaBetween(LocalDateTime inicio, LocalDateTime fin);
}
