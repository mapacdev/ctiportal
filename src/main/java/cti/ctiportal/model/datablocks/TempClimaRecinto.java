package cti.ctiportal.model.datablocks;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="temp_clima_recinto")
public class TempClimaRecinto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Foreing key
    private Long idNave;

    //Lote al que pernetce la informacion
    private Long lote;

    private Date fecha;

    //Hay que estudiar como representamos los valores decimales
    private Float Valor;


}
