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

		System.out.println("Ingrese la marca del nuevo vehículo ");
		String Marca = sc.nextLine();

		System.out.println("Ingrese el modelo");
		String Modelo = sc.nextLine();

		System.out.println("Ingrese la potencia");
		int Potencia = Integer.parseInt(sc.nextLine());

		System.out.println("Ingrese la Matrícula");
		String Matricula = sc.nextLine();

		System.out.println("Ingrese la Avería");
		String Averia = sc.nextLine();

		Coche coche = new Coche(Modelo, Potencia, Marca, Matricula, Averia);
		return coche;

	}

	public static String pedirMatricula() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la matrícula deseada: ");
		String m = sc.next();
		return m;
	}

	public static void mostrarVehiculo(Coche coche) {
		System.out.println("Marca: " + coche.getMarca() + ", Modelo: " + coche.getModelo() + ", Potencia: "
				+ coche.getPotencia() + ", Matrícula: " + coche.getMatricula() + ", Avería: " + coche.getAveria());
	}

}
