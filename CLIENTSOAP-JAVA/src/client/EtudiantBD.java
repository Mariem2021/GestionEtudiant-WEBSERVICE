package client;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import service.GestionEtudiant;
import service.GestionEtudiantService;

public class EtudiantBD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String dbURL = "jdbc:mysql://10.7.226.180:3306/gestionusers";
		String username = "ad";
		String password = "";
		String sql;
		
		String nom;
		String prenom;
		String login;
		String mdp;
		
		
		GestionEtudiant stub = new GestionEtudiantService().getGestionEtudiantPort();
		
		System.out.println("Bienvenu");
		System.out.println("Menu");
		System.out.println("1: Ajout d'un etudiant");
		System.out.println("2: Modifier un etudiant");
		System.out.println("3: Supprimer un etudiant");
		System.out.println("4: Liste des etudiants");
		System.out.println("Choix");
		int choice = scan.nextInt();
		scan.nextLine();
		
		try {
			Connection connect = DriverManager.getConnection(dbURL, username,password);
			PreparedStatement statement;
			
			switch(choice) {
			
			    case 1 : // ajout des users
			    	System.out.println("Veuilez renseigner le nom de l'utilisateur");
			    	nom = scan.nextLine();
			    	System.out.println();
			    	System.out.println("Veuilez renseigner le prenom de l'utilisateur");
			    	prenom = scan.nextLine();
			    	System.out.println();
			    	System.out.println("Veuilez renseigner le login de l'utilisateur");
			    	login = scan.nextLine();
			    	System.out.println();
			    	System.out.println("Veuilez renseigner le mdp de l'utilisateur");
			    	mdp = scan.nextLine();
			    	System.out.println();
			    	
			    	sql = "insert into users (nom, prenom, login, mdp) values (?, ?, ? ,?)";
			    	
			    	statement = (PreparedStatement) connect.prepareStatement(sql);
			    	statement.setString(1, nom);
			    	statement.setString(2, prenom);
			    	statement.setString(3, login);
			    	statement.setString(4, mdp);
			    	
			    	int rowsInsered = statement.executeUpdate();
			    	if (rowsInsered > 0 ) {
			    		System.out.println("Ajout d'un nouveau user reussi");
			    	}
			    	break;	
			    	
			    case 2 : //modifier user
			    	System.out.println("Veuilez renseigner le nom de l'utilisateur");
			    	nom = scan.nextLine();
			    	System.out.println();
			    	System.out.println("Veuilez renseigner le prenom de l'utilisateur");
			    	prenom = scan.nextLine();
			    	System.out.println();
			    	System.out.println("Veuilez renseigner le login de l'utilisateur");
			    	login = scan.nextLine();
			    	System.out.println();
			    	System.out.println("Veuilez renseigner le mdp de l'utilisateur");
			    	mdp = scan.nextLine();
			    	System.out.println();
			    	
			    	sql = "update users SET nom=?, prenom=?, login=?, mdp=? where id=?";
			    	
			    	statement = (PreparedStatement) connect.prepareStatement(sql);
			    	statement.setString(1, nom);
			    	statement.setString(2, prenom);
			    	statement.setString(3, login);
			    	statement.setString(4, mdp);
			    	
			    	int rowsUpdate = statement.executeUpdate();
			    	if (rowsUpdate > 0 ) {
			    		System.out.println("Modification reussie");
			    	}
			    	break;
			    	
			    case 3 : //Suppression de l'user
			    	
			    	sql = "delete from users where id=?";
			    	
			    	statement = (PreparedStatement) connect.prepareStatement(sql);
			    	statement .setString(1, "aidara");
			    	
			    	int rowsDeleted = statement.executeUpdate();
			    	if (rowsDeleted > 0 ) {
			    		System.out.println("Suppression reussie");
			    	}
			    	
			    	
			    case 4 : // Lister
			    	
                    sql = "select * from users";
			    	
			    	Statement create = (Statement) connect.createStatement();
			    	ResultSet result = create.executeQuery(sql);
			    	
			    	int count = 0;
			    	
			    	while(result.next()) {
			    		nom = result.getString(2);
			    		prenom = result.getString(3);
			    		login = result.getString(4);
			    		mdp = result.getString(5);
			    		
			    		String output = "users #%d: %s - %s - %s - %s";
			    		System.out.println(String.format(output, ++count, nom, prenom, login, mdp));
			    		
			    		
			    	}
			    	
			}	
			connect.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
