package service;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import domaine.Etudiant;

@WebService
public class GestionEtudiant {
	private static ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
	
	public String ajouter(
			@WebParam(name = "nom") String nom, 
			@WebParam(name = "prenom") String prenom, 
			@WebParam(name = "login") String login, 
			@WebParam(name = "mdp") String mdp
			) {
		Etudiant e = new Etudiant (nom, prenom, login, mdp);
		etudiants.add(e);
		return "Ajout reussi";
	}
	public String modifier (
			@WebParam(name = "id") int id, 
			@WebParam(name = "nom") String nom, 
			@WebParam(name = "prenom") String prenom, 
			@WebParam(name = "login") String login, 
			@WebParam(name = "mdp") String mdp) {
		
		String message = "non mis a jour";
		for (Etudiant etudiant : etudiants) {
			if (etudiant.getId() == id) {
				etudiant.setLogin(login);
				etudiant.setNom(nom);
				etudiant.setPrenom(prenom);
				etudiant.setMdp(mdp);
				message = "mise a jour reussi";
				break;
			}
			
		}
		return message;
	}
	
	public String supprimer (
			@WebParam(name = "id") int id)
			 {
		String message = "non echec de suppression";
		for (Etudiant etudiant : etudiants) {
			if (etudiant.getId() == id) {
				etudiants.remove(etudiant);
				message = "suppression reussie";
				break;
			}	
		}
		return message;
	}
	
	public ArrayList<Etudiant> Lister() {
		return this.etudiants;
	}

}
