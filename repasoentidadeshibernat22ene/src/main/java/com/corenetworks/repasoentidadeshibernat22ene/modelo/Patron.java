package com.corenetworks.repasoentidadeshibernat22ene.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patrones")
public class Patron {
    @Id
    @Column(length = 9,nullable = false)
    private String dni;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(length = 120,nullable = false)
    private String direccion;
}
