package com.corenetworks.Ene18Spring2.persistencia;

import com.corenetworks.Ene18Spring2.modelo.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary@Component
public class PostgreSql implements IBBDD{


    @Override
    public String insertar(Cliente c) {
        return String.format("El cliente %s se ha insertado en la BBDD PostrgreSql",toString());
    }

    @Override
    public String eliminar(Cliente c) {
        return String.format("El cliente %s se ha eliminado en la BBDD PostrgreSql",toString());
    }

    @Override
    public String modificar(Cliente c) {
        return String.format("El cliente %s se ha modificado en la BBDD PostrgreSql",toString());
    }

    @Override
    public String consultar(Cliente c) {
        return String.format("El cliente %s se ha consultado en la BBDD PostrgreSql",toString());
    }
}
