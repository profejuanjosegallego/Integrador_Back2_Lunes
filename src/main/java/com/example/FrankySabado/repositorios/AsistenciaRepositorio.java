package com.example.FrankySabado.repositorios;

import com.example.FrankySabado.modelos.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface AsistenciaRepositorio extends JpaRepository<Asistencia, Integer> {
    List<Asistencia> findByEstudianteId(Integer estudianteId);
    List<Asistencia> findByGrupoId(Integer grupoId);
    List<Asistencia> findByFecha(LocalDate fecha);
}
