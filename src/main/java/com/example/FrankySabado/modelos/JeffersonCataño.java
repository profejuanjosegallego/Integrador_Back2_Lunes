package com.example.FrankySabado.modelos;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "jeffersoncastano")
public class JeffersonCastaño {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "correo", nullable = false, unique = true, length = 100)
    private String correo;

    // Constructor vacío (requerido por JPA)
    public JeffersonCastaño() {
    }

    // Constructor con parámetros
    public JeffersonCastaño(Integer id, String nombre, LocalDate fechaNacimiento, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
    }

    // Getters y Setters
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

