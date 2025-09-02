package com.example.FrankySabado.modelos;

@Entity
@Table (name= "grupo")
public class Grupo {
    @id
    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private Integer id;
    @Column(name="nombre", nullable = false, unique = false)
    private String nombre;
    @Column(nombre= "semestre", nullable = false, unique = false)
    private String semestre;



    public Grupo() {
    }

    public Grupo(Integer id, String nombre, String semestre) {
        this.id = id;
        this.nombre = nombre;
        this.semestre = semestre;
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

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
