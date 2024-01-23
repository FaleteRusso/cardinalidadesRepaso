package com.corenetworks.Proyectocapas;

import com.corenetworks.Proyectocapas.modelo.Pedido;
import com.corenetworks.Proyectocapas.repository.IPedidoRepo;
import com.corenetworks.Proyectocapas.servicio.IPedidoServicio;
import com.corenetworks.Proyectocapas.servicio.PedidoServiciolmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class ProyectocapasApplication implements CommandLineRunner {
	@Autowired
	private IPedidoServicio servicio;

	public static void main(String[] args)
	{
		SpringApplication.run(ProyectocapasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pedido p1= new Pedido(0, LocalDate.now(),"EFEC",300);
		System.out.println(servicio.insertar(p1));
		p1.setIdPedido(1);
		p1.setImporte(500);
		//System.out.println(servicio.modificar(p1));
		//servicio.eliminar();
		Optional<Pedido>oP1=Optional.of(new Pedido(5,LocalDate.now(),"tarj",150));
		System.out.println("está vacio?->"+oP1.isEmpty());
		System.out.println("Existe un objeto? ->"+oP1.isPresent());
		System.out.println(servicio.obtenerUno(2));
		System.out.println("-------Obtener todos------");
		System.out.println(servicio.obtenerTodos());

	}
}

