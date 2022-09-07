package AA8;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Videojuego ds3 = new Videojuego("Dark Souls 3", 1000, 5d);
		Videojuego tlof = new Videojuego("The Last Of Us", 5000, 10d);
		Videojuego fifa22 = new Videojuego("FIFA 2022", 6000, 15d);
		Videojuego mario = new Videojuego("Mario Bros", 4500, 1d);
		Videojuego doom2 = new Videojuego("DOOM 2", 10000, 1d);
		Videojuego horizon3 = new Videojuego("Horizon 3", 5000, 5d);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Videojuegos:\t\tCantidad de registros\t\t\tPrecio Unitario\n");
		for (Videojuego videojuego : Videojuego.getInventario()) {
			// Format fixes
			String tituloFix = videojuego.getTitulo();
			String registrosFix = Integer.toString(videojuego.getRegistros());
			if (tituloFix.length()<12) {
				tituloFix+="\t";
			}
			if (tituloFix.length()<8) {
				tituloFix+="\t";
				registrosFix+="\t";
			}
			if (registrosFix.length()<5) {
				registrosFix+="\t";
			}
			sb.append(tituloFix+"\t\t\t"+registrosFix+"\t\t\t\t\t"+videojuego.getPrecio()+"\n");
		}
		sb.append("Totales:\t\t\t\t"+ds3.totalRegistros()+"\t\t\t\t\t"+ds3.totalRecaudo()+"\n");
		System.out.println(sb);
		
		System.out.println("Generando archivo txt");
		List<String> lines = Arrays.asList(sb.toString());
		try {
			Files.write(Paths.get("Videojuegos.txt"), lines, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Archivo de salida generado");
	}

}
