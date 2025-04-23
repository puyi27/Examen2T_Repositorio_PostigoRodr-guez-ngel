package Examen_APR;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
En este archivo se realiarán las pruebas de caja negra,
las cuales consisten en pruebas que solo se valora el resultado que se espera del código,
sin necesidad de indagar dentro de él.
*/


public class CAJA_NEGRA_ÁngelPostigoRodríguez {
	
//--------------------------------MÉTODOS-DE-EQUIVALENCIA-------------------------------------------------------------------
	
	//Este método se trata de la comprobación de que la cantidad de alumnos que se introduce es correcta.
	
	@Test
	void comprobarCapacidad() {
		int capacidad=9;
		Instituto insti=new Instituto(capacidad);
		assertEquals(9,insti,"La capacidad del instituto no es correcta");
	}
		
	//Para este método comprobamos que el presupuesto del departamento que se va a crear no tiene un saldo que no corresponde.
	
	@Test
	void comprobarPresupuesto(String nombre, int presupuesto) {
		int presupuestoCorrecto=presupuesto;
		
		Departamento departamento=new Departamento("Lengua", presupuestoCorrecto);	
		
		assertEquals(presupuestoCorrecto, departamento, "El presupuesto del departamento no es el indicado");
	}
	
//-------------------------------------------------------------------------------------------------------------------------
	
	
//------------------------------MÉTODOS-DE-LÍMITE--------------------------------------------------------------------------
	
	
	//Para este método se comprueba los límites de la capacidad del instituto, las cuales no pueden ser ni menor a 0 no máxivo al valor que permite Java.
	
	
	@Test
	void testLímitesCapacidad() {
		
		int capacidad=0;
		Instituto institutoCapacidad=new Instituto(capacidad);
		
		if(capacidad<0) {
			capacidad=-1;
			assertEquals(-1,capacidad, "La capacidad no puede ser negativa");
		}else if(capacidad>=Integer.MAX_VALUE) {
			capacidad=Integer.MAX_VALUE;
			assertEquals(Integer.MAX_VALUE,capacidad, "La capacidad no puede ser tan grande");
		}else{
			assertEquals(0,capacidad, "No puede haber un instituto sin alumnos");
		}
	}
	
	//En el siguiente método se comprueba los límites del presupuesto de cada departamento.
	
	@Test
	void testLímitesPresupuesto() {
		int presupuesto=1;
		
		Departamento departamento=new Departamento("FOL", presupuesto);
		if(presupuesto<0) {
			presupuesto=-1;
			assertEquals(-1,presupuesto, "El presupuesto no puede ser negativa");
		}else if(presupuesto>=Integer.MAX_VALUE) {
			presupuesto=Integer.MAX_VALUE;
			assertEquals(Integer.MAX_VALUE,presupuesto, "El presupuesto es demasiado alto");
		}else{
			assertEquals(0,presupuesto, "Sin dinero para el departamento no haces nada");
		}
		
		
	}
	
}
