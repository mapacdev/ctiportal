package cti.ctiportal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="modulos")
public class Modulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Clave foranea de la nave donde pertenece
    //@ManyToOne
    private Long naveId;

    private String nombre;

    //Si este campo es distinto de cero, esta con un lote activo. O indica que está sin lote
    private Long idLoteActual;


}
