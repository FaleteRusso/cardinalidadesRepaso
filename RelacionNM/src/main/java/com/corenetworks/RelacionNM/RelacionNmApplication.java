package com.corenetworks.RelacionNM;

import com.corenetworks.RelacionNM.modelo.Autobus;
import com.corenetworks.RelacionNM.modelo.Conductor;
import com.corenetworks.RelacionNM.modelo.Lugar;
import com.corenetworks.RelacionNM.modelo.Visita;
import com.corenetworks.RelacionNM.servicio.IAutobusServicio;
import com.corenetworks.RelacionNM.servicio.IConductorServicio;
import com.corenetworks.RelacionNM.servicio.ILugarServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RelacionNmApplication implements CommandLineRunner {
	@Autowired
private IAutobusServicio autobusServicio;
	@Autowired
	private IConductorServicio conductorServicio;

	@Autowired
	private ILugarServicio lugarServicio;


	public static void main(String[] args) {
		SpringApplication.run(RelacionNmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Autobus a1 = new Autobus("1234FRT",2020);
		Visita v1 = new Visita(0, LocalDate.now());
		Visita v2=new Visita(0,LocalDate.now());
		Lugar l1=new Lugar(0,"Asturias");
		Conductor c1=new Conductor("12345676K","Rigoberto Duran");
		v1.setAutobus(a1);
		v1.setConductores(c1);
		v1.setLugares(l1);
		v2.setConductores(c1);
		v2.setLugares(l1);
		v2.setAutobus(a1);
		List<Visita>visitas = new ArrayList<>();
		visitas.add(v1);
		visitas.add(v2);
		a1.setVisitas(visitas);
		System.out.println(conductorServicio.insert(c1));
		System.out.println(lugarServicio.insert(l1));

		System.out.println(autobusServicio.insert(a1));
		System.out.println("--------Consultar todos los autobuses---------");
		System.out.println(autobusServicio.obtenerTodos());


	}
}
