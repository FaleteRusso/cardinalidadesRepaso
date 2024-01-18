package com.corenetworks.demo3SpringCapasEne18.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inmueble {
    private String referencia;
    private String rutaFotoPeque;
    private String rutaFotoGrande;
    private String descripcion;
}
