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
@Table(name = "especies")
public class Especies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecie;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(length = 120, nullable = false)
    private String nomVulgar;
    @Column(length = 30,nullable = false)
    private String familia;
    @Column(nullable = false)
    private boolean peligroExtincion;

}
