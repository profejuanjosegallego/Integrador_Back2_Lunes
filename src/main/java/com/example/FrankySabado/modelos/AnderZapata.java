package com.example.FrankySabado.modelos;

import com.example.FrankySabado.ayudas.EstadosAsistencia;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="AnderZapata")

public class AnderZapata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name="fecha")
    private LocalDate fecha;
    @Column(name="correo")
    private String correo;


    }

    //id in
    //nombre string
    //fecha localdate
    //correo string


}
