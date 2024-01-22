package com.corenetworks.repasoentidadeshibernat22ene;

import com.corenetworks.repasoentidadeshibernat22ene.servicio.ISocioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Repasoentidadeshibernat22eneApplication implements CommandLineRunner {
@Autowired
private ISocioServicio servicio;
	public static void main(String[] args) {
		SpringApplication.run(Repasoentidadeshibernat22eneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(servicio.mostrarUno("12345678A"));
	}
}
