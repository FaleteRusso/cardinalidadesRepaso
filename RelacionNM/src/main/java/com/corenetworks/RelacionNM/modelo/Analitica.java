package com.corenetworks.RelacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "analiticas")
public class Analitica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnalitica;
    @Column(length =60, nullable = false)
    private String descripcion;
    @Column(length =5, nullable = false)
    private String sala;






}