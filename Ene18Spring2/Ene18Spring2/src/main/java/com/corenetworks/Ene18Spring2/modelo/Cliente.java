package com.corenetworks.Ene18Spring2.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Value("51234234B")
    private String dni;
    @Value("Sara Diaz")
    private String nombre;
}
