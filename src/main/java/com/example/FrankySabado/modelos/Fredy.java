package com.example.FrankySabado.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "fredy")
public class Fredy {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", nullable = false, unique = false)
    private String nombre;
    @Column(name = "fecha", nullable = false, unique = false)
    private LocalDate fecha;

    @Column(name= "correo", nullable = false, unique = true)
    private String correo;

}




