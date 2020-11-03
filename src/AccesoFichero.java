import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AccesoFichero {

	public static void copiaSeguridad() {
		File f = new File("/mnt/Cosas Linux/Acceso A Datos/Taller/copiaSeguridad.csv");

		try {
			FileWriter fw = new FileWriter(f);

			ArrayList<Coche> archivoCoches = AccesoBBDD.consultarCoches();
			String archivo = "Modelo;Marca;Potencia;atricula;Averia\n";

			for (Coche coche : archivoCoches) {
				archivo+=coche.getModelo();
				archivo+=";";
				archivo+=coche.getMarca();
				archivo+=";";
				archivo+=coche.getPotencia();
				archivo+=";";
				archivo+=coche.getMatricula();
				archivo+=";";
				archivo+=coche.getAveria();
				archivo+="\n";
				
			}

			fw.write(archivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
