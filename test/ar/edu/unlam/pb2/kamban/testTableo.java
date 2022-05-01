package ar.edu.unlam.pb2.kamban;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTableo {

	@Test
	public void testQueSePuedarearUnTablero() {
	
		Usuario juan=new Usuario("Juan",31981186);
		Tablero tablero=new Tablero("Kamban",juan,juan.getDni());
		Tarea editor=new Tarea("Editor",juan,juan.getDni());
		
		tablero.agregarTarea(editor);
		
		assertEquals(tablero.getTareas().size(),1);
	
	}
	
	@Test
	public void testQueSePuedaCambiarElEstadoDeUnaTarea() {
	
		Usuario juan=new Usuario("Juan",31981186);
		Usuario pedro=new Usuario("Juan",31983446);
		Tablero tablero=new Tablero("Kamban",juan,juan.getDni());
		Tarea editor=new Tarea("Editor",juan,juan.getDni());
		
		tablero.agregarTarea(editor);
		
		assertEquals(editor.getEstadoTarea(),Estado.PENDIENTE);
		editor.cambiarEstado(juan, Estado.EN_CURSO);
		
		assertEquals(editor.getEstadoTarea(),Estado.EN_CURSO);
		
	}
	
	@Test
	public void testQueNoSePuedaCambiarElEstadoDeUnaTarea() {
	
		Usuario juan=new Usuario("Juan",31981186);
		Usuario pedro=new Usuario("Juan",31983446);
		Tablero tablero=new Tablero("Kamban",juan,juan.getDni());
		Tarea editor=new Tarea("Editor",juan,juan.getDni());
		
		tablero.agregarTarea(editor);
		//editor.agregarColaborador(pedro);
		assertEquals(editor.getEstadoTarea(),Estado.PENDIENTE);
		
		//editor.cambiarEstado(juan, Estado.EN_CURSO);
		assertFalse(editor.cambiarEstado(pedro, Estado.EN_CURSO));
		//assertEquals(editor.getEstadoTarea(),Estado.EN_CURSO);
		
		
		
	}

}
