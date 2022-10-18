package logica;

import javax.swing.JOptionPane;

public class Pasajero {
	private int dni;
	private String nombre;
	private Sube tarjeta;
	public Pasajero(int dni, String nombre, Sube tarjeta) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.tarjeta = tarjeta;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Sube getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Sube tarjeta) {
		this.tarjeta = tarjeta;
	}
	@Override
	public String toString() {
		return "Pasajero [dni=" + dni + ", nombre=" + nombre + ", tarjeta=" + tarjeta + "]";
	}
	public boolean cobrar(Sube tarjeta, Colectivo bus) {
		
		if (tarjeta.getCredito() < bus.getTarifa()) {
			return false;
			
		} else {
			tarjeta.setCredito(tarjeta.getCredito() - bus.getTarifa());
			return true;
			
		}
		
	}
}
