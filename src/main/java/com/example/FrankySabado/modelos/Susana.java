package com.example.FrankySabado.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "susana")
public class Susana {

    //id int
    //nombre String
    //fecha localdate
    //correo string
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "correo")
    private String correo;

    public Susana() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Susana(Integer id, String nombre, LocalDate fecha, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.correo = correo;
    }
}
