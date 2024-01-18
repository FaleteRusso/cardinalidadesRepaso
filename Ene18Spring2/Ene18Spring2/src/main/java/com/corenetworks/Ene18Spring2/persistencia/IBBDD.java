package com.corenetworks.Ene18Spring2.persistencia;

import com.corenetworks.Ene18Spring2.modelo.Cliente;
// LAs interfaces no se pueden instanciar, por esto no lleva @
public interface IBBDD {
    String insertar(Cliente c);

    String eliminar(Cliente c);

   String modificar(Cliente c);

    String consultar(Cliente c);
}
