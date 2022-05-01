package ar.edu.unlam.pb2.kamban;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

	private String nombre;
	private List<Tarea> tareas;

	public Tablero(String nombre, Usuario Usuario, Integer dni) {
		this.nombre=nombre;
		tareas=new ArrayList<Tarea>();
		// TODO Auto-generated constructor stub
	}

	public boolean agregarTarea(Tarea tarea) {

		return tareas.add(tarea);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

}
