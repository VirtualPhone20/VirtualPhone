package virtual;

import java.util.*;

import virtual.Usuario.resgistro;

public class listaProductos {
	private  ArrayList<Producto> listaMovil;

	public listaProductos() {
		
		this.listaMovil = new ArrayList<Producto>();
		listaMovil.add(new Producto(1, 11, 120, "xiaomi", "Android",150));
		listaMovil.add(new Producto(2, 10, 64, "LG", "Android", 222));
		listaMovil.add(new Producto(3, 9, 16, "Samsung", "Android", 400));
		listaMovil.add(new Producto(4, 11, 64, "Huawei", "Android", 350));
	}
	
	public void mostrarTelefonos() {
		System.out.println("------Teléfonos-------");
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n\n", "Id", "VersionSistema", "Capacidad", "Marca", "Sistema", "Precio");
//		System.out.printf( "%-15s%-15s%-15s%-15s%-15s%-15s\\n\,id,versionSistema,Capacidad,marca,SistemaOperativo,Descripcion");
		Iterator it = listaMovil.iterator();
		while(it.hasNext()) {
			Producto p = (Producto)it.next();
			p.getDatos();
			
		
		}
		
	}
	
	// creando clase para añadir producto

	public Producto sellecionarCompra(int id) {
		//boolean sellecionarCompra = false;
		Producto n = null;
		
		for (int i = 0; i < listaMovil.size(); i++) {
			n= listaMovil.get(i);
			if(n.getId() == id) {
				return n;
				
			}

		}
		return n;
		
	}


	
}
