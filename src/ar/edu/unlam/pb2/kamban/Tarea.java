package ar.edu.unlam.pb2.kamban;

import java.util.ArrayList;
import java.util.List;

public class Tarea {

	private String nombre;
	private Estado estadoTarea;
	private List<Estado> estados;
	private List<Usuario> usuarios;	

	public Tarea(String nombre, Usuario usuario, Integer dni) {
		this.nombre=nombre;
		estados=new ArrayList<Estado>();
		usuarios=new ArrayList<Usuario>();
		estadoTarea = Estado.PENDIENTE;
		usuario.setCreador(Creador.SI);
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estado getEstadoTarea() {
		return estadoTarea;
	}

	public void setEstadoTarea(Estado estadoTarea) {
		this.estadoTarea = estadoTarea;
	}

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public boolean cambiarEstado(Usuario usuario,Estado estado) {
		
		if(getEstadoTarea()==Estado.PENDIENTE || (getEstadoTarea()==Estado.EN_CURSO && usuario.getCreador()==Creador.SI)) {
			setEstadoTarea(estado);
		}

		return false;		
					
	}


	public void agregarColaborador(Usuario usuario) {
		usuarios.add(usuario);
	}
	

}
