package domaine;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Etudiant {
	
	private static int lastId = 0;
	private int id;
	private String nom;
	private String prenom;
	private String login;
	private String mdp;
	
	public Etudiant () {
		this.id = ++lastId;
	}
	
	public Etudiant(String nom, String prenom, String login, String mdp) {
		this.id = ++lastId;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
	}
	
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	

}
