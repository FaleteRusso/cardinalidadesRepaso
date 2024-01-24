package com.corenetworks.RelacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "visitas")
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVisita;

    @ManyToOne
    @JoinColumn(name = "matricula",
            nullable = false,
            foreignKey = @ForeignKey(name="FK_visitas_autobuses"))
    private Autobus autobus;

    @ManyToOne
    @JoinColumn(name = "dni",
            nullable = false,
            foreignKey = @ForeignKey(name="FK_visitas_conductores"))
    private Conductor conductores;

    @ManyToOne
    @JoinColumn(name = "id_lugar",
            nullable = false,
            foreignKey = @ForeignKey(name="FK_visitas_lugares"))
    private Lugar lugares;
    private LocalDate fVisita;

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public void setConductores(Conductor conductores) {
        this.conductores = conductores;
    }

    public void setLugares(Lugar lugares) {
        this.lugares = lugares;
    }

    @Override
    public String toString() {
        return "Visita{" +
                "idVisita=" + idVisita +
                ", fVisita=" + fVisita +
                '}';
    }

    public Visita(int idVisita, LocalDate fVisita) {
        this.idVisita = idVisita;
        this.fVisita = fVisita;
    }
}
