package com.corenetworks.RelacionNM.modelo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "consulta2_analitica2")
public class ConsultaAnaliticaPK implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_consulta",
            nullable = false,
            foreignKey = @ForeignKey(name="FK_consulta2_analitica2_consultas2"))
    private Consulta2 consulta;
    @Id
  @ManyToOne
    @JoinColumn(name = "id_analitica",
            nullable = false,
            foreignKey = @ForeignKey(name="FK_consulta2_analitica2_analiticas2"))
    private Analitica2 analitica;
}

