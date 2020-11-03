import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccesoBBDD {
	public static void insertarCoche(Coche coche) {

		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Taller", "root", "");
			Statement stmt = c.createStatement();

			String insert = "INSERT INTO coche VALUES(" + coche.getMarca() + "," + coche.getModelo() + ","
					+ coche.getPotencia() + "," + coche.getMatricula() + "," + coche.getAveria() + ")";
			stmt.executeUpdate(insert);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Coche> consultarCoches() {

		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Taller", "root", "");
			Statement stmt = c.createStatement();
			String query = "SELECT * FROM coche";
			ResultSet resul = stmt.executeQuery(query);
			ArrayList<Coche> coches = new ArrayList<Coche>();
			Array modelo = resul.getArray(2);
			Array marca = resul.getArray(1);
			Array matricula = resul.getArray(4);
			Array potencia = resul.getArray(3);
			Array averia = resul.getArray(5);
			
//FALTA ESTO POR HACER
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	public static Coche consultarMatricula(String matricula) {

		return null;

	}
}
