package com.example.FrankySabado.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="matricula")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "matricula_id", nullable = false)
    private int matricula_id;
    @Column(name = "semestre", nullable = false)
    private int semestre;
    @Column (name="id_grupo",nullable = false)
    private String grupo_id;
    @Column (name="periodo",nullable = false)
    private int periodo;

    public Matricula() {
    }

    public Matricula(Integer id, String nombre, int matricula_id, int semestre, String grupo_id, int periodo) {
        this.id = id;
        this.nombre = nombre;
        this.matricula_id = matricula_id;
        this.semestre = semestre;
        this.grupo_id = grupo_id;
        this.periodo = periodo;
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

    public int getMatricula_id() {
        return matricula_id;
    }

    public void setMatricula_id(int matricula_id) {
        this.matricula_id = matricula_id;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getGrupo_id() {
        return grupo_id;
    }

    public void setGrupo_id(String grupo_id) {
        this.grupo_id = grupo_id;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
}