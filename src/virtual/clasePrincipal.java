package virtual;
import java.util.*;


public class clasePrincipal {
	static listaProductos lista = new listaProductos();
	static Scanner entrada = new Scanner(System.in);
	static Usuario usuario1 = new Usuario();
	static Producto p;
	static ticket tick = new ticket();
	
	public static void main(String[] args) {
		//lista.mostrarTelefonos();
		mostrarMenu();
	}
	public static void mostrarMenu() {
		int opcion;
		boolean continuar = false;
		
		do {
		System.out.println("1.-Registrar");
		System.out.println("2.-Iniciar sesión");
		System.out.println("3.-Salir");
		opcion=entrada.nextInt();
		
		switch (opcion) {
		case 1:
			
			int cont = 0;		// Cntidad de Usuarios
			while(1 > cont) {
				// Crear Cuenta
				System.out.println("nombre");
				String nombre = entrada.nextLine();
				if(nombre.isEmpty()) {
					nombre = entrada.nextLine();
				}
				
				System.out.println("contra");
				String contra = entrada.nextLine();
				
				System.out.println("tel");
				int tel = entrada.nextInt();
				
				System.out.println("Correo");
				String correo = entrada.nextLine();
				if(correo.isEmpty()) {
					correo = entrada.nextLine();
				}
				
				usuario1.meterUsuario(nombre, contra, tel, correo);
				cont ++;
			}
			
			usuario1.mostrarUsu();
			
			break;
		case 2:
			System.out.println("Verificar nombre");
			String nombreV = entrada.nextLine();
			if(nombreV.isEmpty()) {
				nombreV = entrada.nextLine();
			}
			System.out.println("Verificar contra");
			String contraV = entrada.nextLine();	
			
			boolean comprobar = usuario1.verificar(nombreV, contraV);
			if(comprobar == true) {
				System.out.println("Constraseña correcta");
				
				lista.mostrarTelefonos();
				
				System.out.println("¿Cuantos Productos quieres comprar?");
				int numProductos = entrada.nextInt();
				
				while (numProductos > 0) {
					
					System.out.println("Selecciona el id del producto");
					int idProducto = entrada.nextInt();
					p = lista.sellecionarCompra(idProducto); 
					
					tick.anyadirproducto(p);
					
					
					numProductos--;
				}
				
				
				
			}
			else {
				System.out.println("ERROR vuelva a introducir la contraseña");
			}
			tick.mostrarTelefonoComprado();

			break;
			
		case 3:
			
			System.exit(0);
			
			break;
			
			
		default: System.out.println("Introduce 1, 2 o 3");
			break;
			

			
			}
	
//		System.out.println("¿Quieres realizar otra operacion?: si-no");
//		String respuesta = entrada.nextLine();
//		if(respuesta.equalsIgnoreCase("si")) {
//			continuar = true;
//		}
		
		} while(opcion >=1 || opcion <=3 || continuar == true);
		
	}

}
