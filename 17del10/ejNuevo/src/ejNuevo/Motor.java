package ejNuevo;

public class Motor {
	private int parte;
	private String modelo;
	private String estado;
	
	public Motor(int parte, String modelo, String estado) {
		super();
		this.parte = parte;
		this.modelo = modelo;
		this.estado = estado;
	}
	public int getParte() {
		return parte;
	}
	public void setParte(int parte) {
		this.parte = parte;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Motor [parte=" + parte + ", modelo=" + modelo + ", estado=" + estado + "]";
	}
	
	
}
