package cti.ctiportal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="lotes")
public class Lote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Foreing key de la nave a la cual pertence el lote

    private Long moduloId;

    private Date fechaInicio;

    private Date fechaFinal;

    //Podría ser 0 o nulo
    private Long idCrianza;
}
