package dbConnect;
import java.sql.*;
import java.awt.EventQueue;

public class TestConnectionDB {

	public static void main(String[] args) throws SQLException {
		String BDD = "tp_java";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String password = "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			//System.out.println("Connecter");
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("select * from utilisateurs");
			while (rset.next()) {
				System.out.println(rset.getInt(1));
				System.out.println(rset.getString("nom"));
				System.out.println(rset.getString("sexe"));
				System.out.println(rset.getInt("tel"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Erreur de connexion");
			System.exit(0);
		}
		

	}

}
