package com.corenetworks.demoHibernate.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="concertados")
public class Concertado {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCentro;
 @Column(length = 60,nullable = false)
    private String agrupacion;
 @Column(nullable = false)
    private double comision;
    @OneToOne
    @JoinColumn(name="id_centro",nullable = false, foreignKey = @ForeignKey(name="FK_concertados_centros_educativos"))
    private CentrosEducativos ce;

}
