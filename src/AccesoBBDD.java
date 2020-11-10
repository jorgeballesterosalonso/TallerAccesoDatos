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

			String insert = "INSERT INTO coche VALUES('" + coche.getMarca() + "','" + coche.getModelo() + "','"
					+ coche.getPotencia() + "','" + coche.getMatricula() + "','" + coche.getAveria() + "')";
			stmt.executeUpdate(insert);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Coche> consultarCoches() {
		ArrayList<Coche> coches = new ArrayList<Coche>();

		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Taller", "root", "");
			Statement stmt = c.createStatement();
			String query = "SELECT * FROM coche";
			ResultSet resul = stmt.executeQuery(query);

			while (resul.next()) {

				String Marca = resul.getString("Marca");
				String Modelo = resul.getString("Modelo");
				int potencia = resul.getInt("Potencia");
				String Matricula = resul.getString("matricula");
				String Averia = resul.getString("averia");

				Coche co = new Coche(Modelo, potencia, Marca, Matricula, Averia);

				coches.add(co);
			}

//FALTA ESTO POR HACER

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return coches;

	}

	public static Coche consultarMatricula(String matricula) {

		Coche coche = null;

		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Taller", "root", "");
			Statement stmt = c.createStatement();
			String query = "SELECT * FROM coche WHERE matricula = '" + matricula + "'";
			ResultSet resul = stmt.executeQuery(query);

			resul.next();

			coche = new Coche(resul.getString("Modelo"), resul.getInt("Potencia"), resul.getString("Marca"),
					resul.getString("matricula"), resul.getString("averia"));

		} catch (SQLException e) {
			
		}

		return coche;

	}
}
