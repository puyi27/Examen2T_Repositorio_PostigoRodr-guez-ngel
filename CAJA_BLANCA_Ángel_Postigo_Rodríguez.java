package Examen_APR;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CAJA_BLANCA_Ángel_Postigo_Rodríguez {
	
	
	//Para estos métodos se van a ir comprobando la creación de los departamentos y del instituto,
	
	@Test
	void crearInstituto() {
		int capacidad=505;
		Instituto insti=new Instituto(capacidad);
		assertEquals(insti, "Instituto con: "+capacidad+" plazas");
	}
	
	@Test
	void crearDepartamento() {
		int presupuestoDepartamento=1000;
		String nombreDepartamento="Programación";
		Instituto departamentoInformática=new Instituto(100 );
		departamentoInformática.agregarDepartamento(nombreDepartamento, presupuestoDepartamento);
		assertEquals(departamentoInformática, "El departamento de "+nombreDepartamento+" con un presupuesto de "+presupuestoDepartamento+" ha sido creado");
	}
	
	@Test
	void crearPedido() {
		Instituto insti=new Instituto(100);
		int monton=20;
		insti.realizarPedido("Entorno de Desarrollo", monton);
		
		
	}
	
}
