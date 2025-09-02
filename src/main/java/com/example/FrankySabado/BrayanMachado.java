package com.example.FrankySabado;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "BrayanMachado")
public class BrayanMachado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombres", length = 50, nullable = false, unique = true)
    private String nombre;

    @Column(name = "fechas", length = 50, nullable = false, unique = true)
    private Date fecha;

    @Column(name = "correos", length = 50, nullable = false, unique = true)
    private String correo;

    //Relaciones


    public BrayanMachado() {}

    public BrayanMachado(Integer id, String nombre, Date fecha, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.correo = correo;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
