package org.cuatrovientos.ed;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.annotation.Repeatable;

import org.junit.Before;
import org.junit.Test;




class GeneradoIpTest1 {
	GenerarIp generador;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	void testGenerarIpFalse() {
String ultimasPosicionesSTR = "";
String primerasPosicionesSTR = "";
int ultimasPosiciones = 0;
int primerasPosiciones = 0;
for( int i =generador.generarIp().length(); i < (generador.generarIp().length() -3); i++  ) {
	ultimasPosicionesSTR += generador.generarIp().charAt(i);
}
for(int  j =0; j <2; j++  ) {
	primerasPosicionesSTR += generador.generarIp().charAt(j);
}
   primerasPosiciones =Integer.parseInt(primerasPosicionesSTR);
   ultimasPosiciones =Integer.parseInt(ultimasPosicionesSTR);
		assertFalse(primerasPosiciones <= 0 || primerasPosiciones >= 255 || ultimasPosiciones >= 255 || ultimasPosiciones <= 0  );
	}
	
	@Test
	void testGenerarIptTrue() {
String ultimasPosicionesSTR = "";
String primerasPosicionesSTR = "";
int ultimasPosiciones = 0;
int primerasPosiciones = 0;
for( int i =generador.generarIp().length(); i < (generador.generarIp().length() -3); i++  ) {
	ultimasPosicionesSTR += generador.generarIp().charAt(i);
}
for(int  j =0; j <2; j++  ) {
	primerasPosicionesSTR += generador.generarIp().charAt(j);
}
   primerasPosiciones =Integer.parseInt(primerasPosicionesSTR);
   ultimasPosiciones =Integer.parseInt(ultimasPosicionesSTR);
		assertTrue(primerasPosiciones > 0 && primerasPosiciones < 255 && ultimasPosiciones < 255 && ultimasPosiciones > 0  );
	}
	@Repeatable(1000)
	void testGenerarNumeroTrue() {
		int numero = generador.GenerarNumero(0, 255);
		
		assertTrue( numero > 0 && numero < 255 );
	}
	
	@Repeatable(1000)
	void testGenerarNumeroFalse() {
		int numero = generador.GenerarNumero(-4, 270);
		
		assertFalse( numero <= 0 || numero >= 255 );
	}
	
	
	
	
	

}
