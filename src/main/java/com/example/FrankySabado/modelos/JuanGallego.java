package com.example.FrankySabado.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "JuanGallego")
public class JuanGallego {
    // id int
    // nombre string
    // fecha localdate
    // correo string
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @Column (name="nombre")
    private  String nombre;

    @Column (name="fecha")
    private LocalDate fecha;

    @Column (name= "correo")
    private String correo;

    public JuanGallego() {
    }
}
