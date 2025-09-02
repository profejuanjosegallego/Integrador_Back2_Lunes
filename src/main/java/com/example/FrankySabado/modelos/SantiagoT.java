package com.example.FrankySabado.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "santiagoT")
public class SantiagoT {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "nombre", nullable = false,unique = false)
    private String nombre;
    @Column (name = "fecha", nullable = false, unique = false)
    private LocalDate fecha;
    @Column (name = "correo", nullable = false, unique = true)
    private String correo;

    public SantiagoT() {

    }

    public SantiagoT(String correo, LocalDate fecha, String nombre, Integer id) {
        this.correo = correo;
        this.fecha = fecha;
        this.nombre = nombre;
        this.id = id;
    }

    public int getId() {
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
}
