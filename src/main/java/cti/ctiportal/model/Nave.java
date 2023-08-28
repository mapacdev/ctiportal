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
@Table(name="naves")
public class Nave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Clave foranea de la explotacion
    private Long idExplotacion;

    private String nombre;

    private int tipoAnimal;

    //Si este campo es distinto de cero, esta con un lote activo. O indica que está sin lote
    private Long idLote;

    //Nave o modulo
    private int tipoNave;


}
