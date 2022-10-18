package interfaz;

import javax.swing.JOptionPane;

import logica.Colectivo;
import logica.Motor;
import logica.Pasajero;
import logica.Sube;

public class Main {

	public static void main(String[] args) {
		//public Sube(int num, double credito)
		Sube tarjeta = new Sube(2686, 1000);
		//public Pasajero(int dni, String nombre, Sube tarjeta)
		Pasajero pasajero = new Pasajero(123456,"carlitos",tarjeta);
		Motor motor = new Motor(777,"XLR8",90);
		Colectivo autobus = new Colectivo (123,29.50,0);
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Opociones\n1-Arrancar\n2-Ingresar pasajero\n3-Ver cantidad de pasajeros"));
		switch (a) {
		case 1:
			
			switch (autobus.arrancar(motor)) {
			case 1:
				JOptionPane.showMessageDialog(null, "el colectivo puede arrancar");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "el colectivo tiene muchos pasajeros pero puede arrancar");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "el colectivo tiene excedente de pasajeros, no puede arrancar");
				break;
			}
			break;

		case 2:
			int b =Integer.parseInt(JOptionPane.showInputDialog("cuantos pasajeros van a subir?"));
			JOptionPane.showMessageDialog(null, "ahora hay "+ autobus.agregarPasajeros(b) +" pasajeros en el colectivo");
			
			String res;
			do {
				if (pasajero.cobrar(tarjeta, autobus)) {
					JOptionPane.showMessageDialog(null, "cobrando pasaje");
				} else {
					JOptionPane.showMessageDialog(null, "saldo insuficiente");
				}				
				JOptionPane.showMessageDialog(null, "saldo restante: "+tarjeta.getCredito());
				res = JOptionPane.showInputDialog("quiere cobrar la tarifa?");
			} while (res.equalsIgnoreCase("si"));
			
			break;
		case 3:
			break;
		}

	}

}
