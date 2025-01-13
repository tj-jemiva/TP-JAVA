package dbConnect;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) throws SQLException {
		String base = "tp_java";
		String url = "jdbc:mysql://localhost:3306/" + base;
		String user = "root";
		String password = "";
		String nom, sexe, sql;
		int tel;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			Scanner input = new Scanner(System.in);
			System.out.println("Nom:");
			nom = input.next();
			System.out.println("Sexe: ");
			sexe = input.next();
			System.out.println("Tél: ");
			tel = input.nextInt();
			
			//insertion dans la base
			Statement stmt = conn.createStatement();
			System.out.println("Insertion...");
			sql = "INSERT INTO utilisateurs (nom, sexe, tel) VALUES (?, ?, ?)";
			stmt.executeUpdate(sql);
			
			System.out.println("Données insérés dans la table...");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("Erreur de connexion");
			System.exit(0);
		}

	}

}
