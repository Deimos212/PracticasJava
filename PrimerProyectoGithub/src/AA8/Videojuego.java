package AA8;

import java.util.ArrayList;

public class Videojuego implements Calculos{
	
	private String titulo;
	private int registros;
	private double precio;
	private static ArrayList<Videojuego> inventario = new ArrayList<Videojuego>();
	
	public Videojuego(String titulo, int registros, double precio) {
		this.titulo = titulo;
		this.registros = registros;
		this.precio = precio;
		inventario.add(this);
	}
	@Override
	public int totalRegistros() {
		int total = 0;
		for (Videojuego videojuego : inventario) {
			total+= videojuego.registros;
		}
		return total;
	}
	@Override
	public double totalRecaudo() {
		double total = 0d;
		for (Videojuego videojuego : inventario) {
			total+= videojuego.registros * videojuego.precio;
		}
		return total;
	}
	
	// ToString
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", descargas=" + registros + ", precio=" + precio + "]";
	}

	
	// Getters & Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getRegistros() {
		return registros;
	}
	public void setRegistros(int registros) {
		this.registros = registros;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public static ArrayList<Videojuego> getInventario() {
		return inventario;
	}
	public static void setInventario(ArrayList<Videojuego> inventario) {
		Videojuego.inventario = inventario;
	}
	
}
