package com.corenetworks.demo3SpringCapasEne18.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Pedido {
    @Value("1")
    private int idPedido;
    @Value("2024-01-18")
    private LocalDate fPedido;
   @Value("Correos")
    private String fEnvio;
   @Value("Credito")
    private String fPago;
   @Value("300")
    private double importe;
}
