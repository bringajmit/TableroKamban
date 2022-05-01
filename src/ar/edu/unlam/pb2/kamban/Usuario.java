package ar.edu.unlam.pb2.kamban;

public class Usuario {

	private String nombre;
	private Integer dni;
	private Creador creador;

	public Creador getCreador() {
		return creador;
	}

	public void setCreador(Creador creador) {
		this.creador = creador;
	}

	public Usuario(String nombre, Integer dni) {
		this.nombre=nombre;
		this.dni=dni;
		creador = Creador.NO;
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

}
