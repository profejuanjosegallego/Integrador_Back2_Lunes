import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Habilidad")

public class Habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Habilidad")
    private String nombre;

    @Column(name="Nivel")
    

    @Column(name="TipoBlanda")
    private String correo;




}
