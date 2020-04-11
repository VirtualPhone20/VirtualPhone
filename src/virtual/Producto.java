package virtual;

public class Producto {
	private int id,versionSistema,Capacidad,precio;
	private String marca,SistemaOperativo;
	public Producto(int id, int versionSistema, int capacidad, String marca, String sistemaOperativo,
			int precio) {
	
		this.id = id;
		this.versionSistema = versionSistema;
		this.Capacidad = capacidad;
		this.marca = marca;
		this.SistemaOperativo = sistemaOperativo;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}

	public int getVersionSistema() {
		return versionSistema;
	}

	public int getCapacidad() {
		return Capacidad;
	}

	public String getMarca() {
		return marca;
	}

	public String getSistemaOperativo() {
		return SistemaOperativo;
	}

	public int getPrecio() {
		return this.precio;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setVersionSistema(int versionSistema) {
		this.versionSistema = versionSistema;
	}
	public void setCapacidad(int capacidad) {
		Capacidad = capacidad;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		SistemaOperativo = sistemaOperativo;
	}
	
//	public String toString() {
//		return "Producto [id=" + id + ", versionSistema=" + versionSistema + ", Capacidad=" + Capacidad + ", marca="
//				+ marca + ", SistemaOperativo=" + SistemaOperativo + ", Descripcion=" + Descripcion + "]";
//	}
	public void  getDatos() {
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n",id,versionSistema,Capacidad,marca,SistemaOperativo,precio+" euros");
	}
	
	
}
