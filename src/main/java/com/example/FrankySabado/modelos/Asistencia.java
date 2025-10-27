package com.example.FrankySabado.modelos;

import com.example.FrankySabado.ayudas.EstadosAsistencia;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "asistencias")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private LocalDate fecha;

    // Usamos IDs primitivos para NO depender de otras tablas/módulos
    @NotNull
    @Column(name = "grupo_id")
    private Integer grupoId;

    @NotNull
    @Column(name = "estudiante_id")
    private Integer estudianteId;

    @Size(max = 500)
    private String observacion;

    @NotNull
    @Enumerated(EnumType.STRING)
    private EstadosAsistencia estado;

    public Asistencia() {}

    public Asistencia(Integer id, LocalDate fecha, Integer grupoId, Integer estudianteId, String observacion, EstadosAsistencia estado) {
        this.id = id;
        this.fecha = fecha;
        this.grupoId = grupoId;
        this.estudianteId = estudianteId;
        this.observacion = observacion;
        this.estado = estado;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public Integer getGrupoId() { return grupoId; }
    public void setGrupoId(Integer grupoId) { this.grupoId = grupoId; }
    public Integer getEstudianteId() { return estudianteId; }
    public void setEstudianteId(Integer estudianteId) { this.estudianteId = estudianteId; }
    public String getObservacion() { return observacion; }
    public void setObservacion(String observacion) { this.observacion = observacion; }
    public EstadosAsistencia getEstado() { return estado; }
    public void setEstado(EstadosAsistencia estado) { this.estado = estado; }
}
