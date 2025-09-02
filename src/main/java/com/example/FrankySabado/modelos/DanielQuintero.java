package com.example.FrankySabado.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name= "danielquintero")
public class DanielQuintero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", length = 50, nullable = false, unique = false)
    private String nombre;
    @Column(name = "fecha", nullable = false, unique = false)
    private LocalDate fecha;
    @Column(name = "correo", length = 50, nullable = false, unique = true)
    private String correo;

    public DanielQuintero() {
    }

    public DanielQuintero(Integer id, String nombre, LocalDate fecha, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.correo = correo;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
