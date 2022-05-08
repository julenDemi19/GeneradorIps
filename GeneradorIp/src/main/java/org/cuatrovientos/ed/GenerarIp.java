package org.cuatrovientos.ed;
import java.util.*;
public class GenerarIp {
	
	public int GenerarNumero(int min, int max) {
		Random rnd = new Random();
		int numeroAleatorio = rnd.nextInt(max + min) + min;
		return numeroAleatorio;
		
	}
	
	public String generarIp() {
		String ip = "";
		for(int i = 0;i < 12; i++) {
			if(i == 3 || i == 6 || i == 10) {
		ip +=	".";
				
			} else {
				ip +=	GenerarNumero(0, 255);
			}
		}
		return ip;
	}

}
