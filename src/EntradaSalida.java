import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EntradaSalida {

	static final int NUEVO_VEHICULO = 1;
	static final int LISTAR_VEHICULOS = 2;
	static final int BUSCAR_VEHICULO = 3;
	static final int COPIA_DE_SEGURIDAD = 4;
	static final int SALIR = 5;

	public static int mostrarMenu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escoja una opción:");
		System.out.println("1 - Nuevo vehículo");
		System.out.println("2 - Listar vehículos");
		System.out.println("3 - Buscar Vehículo");
		System.out.println("4 - Crear copia de seguridad en formato CSV");
		System.out.println("5 - Salir");

		int eleccion = sc.nextInt();

		return eleccion;
	}

	public static Coche pedirDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Ingrese los datos del nuevo vehículo en este orden: modelo, potencia, marca, matricula y la avería ");
		Coche coche = new Coche(sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.next());
		return coche;

	}

	public static String pedirMatricula() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la matrícula deseada: ");
		String m = sc.next();
		return m;
	}

	public static void mostrarVehiculo(Coche coche) {
		System.out.println(coche.toString());
	}

}
