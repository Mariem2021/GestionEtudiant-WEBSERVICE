package serveur;

import javax.xml.ws.Endpoint;
import service.GestionEtudiant;

public class Serveur {

	public static void main(String[] args) {
		String webserName = "GestionEtudiant";
		String url = "http://10.7.226.180:1010/";
		
		Endpoint.publish(url, new GestionEtudiant());
		System.out.printf("%s%s?wsdl", url, webserName);

	}
	

}
