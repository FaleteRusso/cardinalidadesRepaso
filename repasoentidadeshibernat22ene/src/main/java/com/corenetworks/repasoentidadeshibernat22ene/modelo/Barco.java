package com.corenetworks.repasoentidadeshibernat22ene.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "barcos")
public class Barco {
    @Id
    @Column(length = 7)
    private String matricula;
    @Column(nullable = false)
    private int amarre;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(nullable = false)
    private double cuota;
    @ManyToOne
    @JoinColumn(name = "dni",nullable = false,foreignKey = @ForeignKey(name = "FK_barcos_socios"))
    private Socio socio;
}
