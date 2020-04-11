package virtual;
import java.util.*;
public class ticket {
	private ArrayList<Producto> miticket ;
	public ticket() {
		this.miticket = new ArrayList<Producto>();
	}
	public void anyadirproducto(Producto p)
	{
		miticket.add(p);
	}
	public void mostrarTelefonoComprado() {
		System.out.println("-----------------------------------------------Teléfonos-----------------------------------------------");
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n\n", "Id", "VersionSistema", "Capacidad", "Marca", "Sistema", "Descripcion");
		System.out.println("-----------------------------------------------------------------------------------------------------------");
//		System.out.printf( "%-15s%-15s%-15s%-15s%-15s%-15s\\n\,id,versionSistema,Capacidad,marca,SistemaOperativo,Descripcion");
		Iterator it = miticket.iterator();
		while(it.hasNext()) {
			
			Producto p = (Producto)it.next();
			p.getDatos() ;
	
		}
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.printf("Precio Total: "+precioTotal()+" euros\n");

		
	}
	public int precioTotal() {
		int total = 0;
		for (int i = 0; i < miticket.size(); i++) {
			Producto p = miticket.get(i);
			total += p.getPrecio();
		}
		return total;
	}

}
