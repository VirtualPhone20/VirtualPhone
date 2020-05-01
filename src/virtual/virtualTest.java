package virtual;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class virtualTest {
	static Usuario usuarioRegistrado;
	
	@BeforeClass
	
	public static void before() {
		System.out.println("Estoy en el metodo before");
		usuarioRegistrado = new Usuario();
		
	}

	@Test
	
	public void test1() {
			System.out.println("Estoy metodo verificar cuando existe un usuario Registrado.Por ejemplo "
					+ " nombre Pablo,contraseña syso1234");
			String esperadoNombre = "Pablo"+"syso1234";
			String esperadoConstrasenya = "syso1234";
//			usuarioRegistrado.meterUsuario("Pablo", "syso1234", 0, null);
			boolean resultado =  usuarioRegistrado.verificar("Pablo", "syso1234");
			assertEquals(esperadoNombre,resultado);
		}
	}


