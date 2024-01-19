package com.corenetworks.demoHibernate.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="animales")
public class Animales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idAnimal;
    private char sexo;
    @Column(length = 60,nullable = false)
    private String fNacimiento;
    @Column(length = 60,nullable = false)
    private String paisOrigen;
    @Column(length = 30,nullable = false)
    private String continente;
    @ManyToOne
    @JoinColumn(name="id_especie",nullable = false,foreignKey = @ForeignKey(name = "FK_animales_especies"))
    private Especies e1;
    @ManyToOne
    @JoinColumn(name="id_zoo",nullable = false,foreignKey = @ForeignKey(name = "FK_animales_zoos"))
    private Zoos z1 ;

}
