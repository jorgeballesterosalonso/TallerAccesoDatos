import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {

		int eleccion = EntradaSalida.mostrarMenu();

		do {
			switch (eleccion) {

			case EntradaSalida.NUEVO_VEHICULO:

				Coche nuevoCoche = EntradaSalida.pedirDatos();
				System.out.println("Has insertado un vehículo: ");
				EntradaSalida.mostrarVehiculo(nuevoCoche);
				AccesoBBDD.insertarCoche(nuevoCoche);

				break;

			case EntradaSalida.LISTAR_VEHICULOS:

				ArrayList<Coche> listaCoches = AccesoBBDD.consultarCoches();

				for (Coche coche : listaCoches) {
					EntradaSalida.mostrarVehiculo(coche);
				}

				break;

			case EntradaSalida.BUSCAR_VEHICULO:

				String matricula = EntradaSalida.pedirMatricula();
				Coche cocheBuscado = AccesoBBDD.consultarMatricula(matricula);

				if (cocheBuscado != null) {
					EntradaSalida.mostrarVehiculo(cocheBuscado);
				} else
					System.out.println("No hay ningún vehículo con esta matrícula");

				break;

			case EntradaSalida.COPIA_DE_SEGURIDAD:
				AccesoFichero.copiaSeguridad();
				break;

			case EntradaSalida.SALIR:
				break;
			}

			eleccion = EntradaSalida.mostrarMenu();

		} while (eleccion != EntradaSalida.SALIR);
	}

}
