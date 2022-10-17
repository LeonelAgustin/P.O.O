package ejNuevo;

import javax.swing.JOptionPane;

public class Sube {
	private int num;
	private double credito;
	public Sube(int num, double credito) {
		super();
		this.num = num;
		this.credito = credito;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getCredito() {
		return credito;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}
	@Override
	public String toString() {
		return "Sube [num=" + num + ", credito=" + credito + "]";
	}
	
	public void cobrar(Colectivo bus) {
		
		if (this.credito < bus.getTarifa()) {
			JOptionPane.showMessageDialog(null, "saldo insuficiente");
		} else {
			this.credito = getCredito() - bus.getTarifa();
			JOptionPane.showMessageDialog(null, "nuevo saldo: "+this.credito);
		}
		
	}
}
