package com.corenetworks.demoHibernate.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="zoos")
public class Zoos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idZoo;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(length = 30,nullable = false)
    private String pais;
    @Column(length = 30,nullable = false)
    private String ciudad;
    @Column(nullable = false)
    private double tamano;
    @Column(nullable = false)
    private double presupuesto;

}
