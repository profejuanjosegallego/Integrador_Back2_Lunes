package com.example.FrankySabado.dtos;

import com.example.FrankySabado.ayudas.EstadosAsistencia;

import java.time.LocalDate;

public class AsistenciaDTO {
    public Integer id;
    public LocalDate fecha;
    public Integer grupoId;
    public Integer estudianteId;
    public String observacion;
    public EstadosAsistencia estado;
}
