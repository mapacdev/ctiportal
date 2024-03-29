package cti.ctiportal.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="naves")
public class Nave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Clave foranea de la explotacion
    private Long idExplotacion;

    private String nombre;

    private int tipoAnimal;

    //@OneToMany
    //private List<Modulo> modulos;
}
