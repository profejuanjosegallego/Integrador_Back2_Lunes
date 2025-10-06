package com.example.FrankySabado.servicios;

import com.example.FrankySabado.modelos.Asistencia;
import com.example.FrankySabado.repositorios.IRepositorioAsistencia;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AsistenciaServicio {

    private final IRepositorioAsistencia repositorio;

    public AsistenciaServicio(IRepositorioAsistencia repositorio) {
        this.repositorio = repositorio;
    }

    public List<Asistencia> buscarPorRangoFechas(LocalDateTime inicio, LocalDateTime fin) {
        return repositorio.findByFechaBetween(inicio, fin);
    }
}
