package virtual;

import java.util.*;


public class Usuario {
	
		public class resgistro {
			
			private String nombre,constrasenya, correo;
			private int telefono;
			public resgistro(String nombre,String constrasenya,int telefono, String correo ) {
				
				this.nombre = nombre;
				this.constrasenya = constrasenya;
				this.telefono = telefono;
				this.correo = correo;
				
			}
			// Inicializar en 0 las variable y añadir set a las que queden
			public String getNombre() {
				return nombre;
			}
			public void setTelefono(int tel) {
				this.telefono = tel;
			}
			public String getConstrasenya() {
				return constrasenya;
			}
			public String getCorreo() {
				return this.correo;
			}
			public int getTelefono() {
				return this.telefono;
			}
//			public String getDatos() {
//				return "Usuario [nombre=" + nombre + ", constrasenya=" + constrasenya + "]";
//			}
			
			public String getDatos() {
				return "Datos registrados [nombre=" + nombre + ", constrasenya=" + constrasenya + ", correo=" + correo
						+ ", telefono=" + telefono + "]";
			}
			
		}
		
		private ArrayList<resgistro> listadoRegistro;
		
		public Usuario () {
			this.listadoRegistro = new ArrayList<resgistro>();
			
		}
		public void meterUsuario(String nombre, String contra, int tel,String correo ) {
			listadoRegistro.add(new resgistro(nombre, contra,tel,correo));
		}
		public void mostrarUsu () {
			
			Iterator it = listadoRegistro.iterator();
			
			while(it.hasNext()) {
				resgistro pp = (resgistro)it.next();
				System.out.println(pp.getDatos());
			}
		}
		// Podria ir a la clase Principal
		public boolean verificar(String nombre, String contra) {
			boolean verificado = false;
			resgistro n = null;
			
			for (int i = 0; i < listadoRegistro.size(); i++) {
				if(listadoRegistro.get(i).nombre.equals(nombre) && listadoRegistro.get(i).constrasenya.equals(contra) ) {
					n = listadoRegistro.get(i);
					verificado = true;
				}

			}
			return verificado;
			
		}
}

