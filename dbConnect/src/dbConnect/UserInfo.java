package dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        // Informations de connexion à la base de données
        String url = "jdbc:mysql://localhost:3306/tp_java";
        String username = "root"; // Remplacez par votre utilisateur MySQL
        String password = "";     // Remplacez par votre mot de passe MySQL

        // Création d'un scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        try {
            // Demander les données utilisateur
            System.out.print("Entrez votre nom : ");
            String nom = scanner.nextLine();

            System.out.print("Entrez votre sexe (M/F) : ");
            char sexe = scanner.next().charAt(0);

            // Consommer le caractère de nouvelle ligne restant
            scanner.nextLine();

            System.out.print("Entrez votre numéro de téléphone : ");
            String tel = scanner.nextLine();

            // Connexion à la base de données
            Connection connection = DriverManager.getConnection(url, username, password);

            // Requête SQL d'insertion
            String query = "INSERT INTO utilisateurs (nom, sexe, tel) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Remplir les paramètres
            preparedStatement.setString(1, nom);
            preparedStatement.setString(2, String.valueOf(sexe));
            preparedStatement.setString(3, tel);
            
            System.out.println("Insertion...");
            
            // Exécuter la requête
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Données insérés dans la table...");
            }

            // Fermer la connexion
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fermer le scanner
            scanner.close();
        }
    }
}
