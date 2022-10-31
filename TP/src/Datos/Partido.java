package Datos;

public class Partido {
	private int id;
	private Equipo equipo1;
	private Equipo equipo2;
	private int duracion;
	
	public Partido(int id, Equipo equipo1, Equipo equipo2, int duracion) {
		super();
		this.id = id;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.duracion = duracion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Partido [id=" + id + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", duracion=" + duracion + "]";
	}
	
	
}
