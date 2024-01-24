package com.corenetworks.RelacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autobuses")
public class Autobus {
    @Id
    @Column(length = 7)
    private String matricula;
    @Column(nullable = false)
    private int fFabricacion;
    @OneToMany(mappedBy = "autobus",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    List<Visita> visitas;

    public Autobus(String matricula, int fFabricacion) {
        this.matricula = matricula;
        this.fFabricacion = fFabricacion;
    }
}
