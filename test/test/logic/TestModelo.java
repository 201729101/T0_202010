package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		// TODO
		setUp2();
		assertTrue(modelo.darTamano()==CAPACIDAD);
	}

	@Test
	public void testAgregar() {
		// TODO Completar la prueba
		setUp2();
		modelo.agregar(101);
		assertTrue(modelo.darTamano()==101);
		assertTrue(modelo.buscar(101)==101);
	}

	@Test
	public void testBuscar() {
		setUp2();
		// TODO Completar la prueba
		assertTrue(modelo.buscar(27)==27);
		assertTrue(modelo.buscar(120)==-1);
	}

	@Test
	public void testEliminar() {
		setUp2();
		// TODO Completar la prueba
		int ret = modelo.eliminar(11);
		assertTrue(ret == 11);
		assertTrue(modelo.buscar(11)==-1);
		assertTrue(modelo.darTamano()==99);
		
	}

}
