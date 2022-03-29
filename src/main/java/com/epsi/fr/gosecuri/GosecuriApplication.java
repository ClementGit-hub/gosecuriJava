package com.epsi.fr.gosecuri;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.epsi.fr.gosecuri.commun.Commun;
import com.epsi.fr.gosecuri.fonctions.Recuperation;

@SpringBootApplication
public class GosecuriApplication {

	public static void main(String[] args) {
		
//		new Commun().recup();
		
		new Recuperation();
	}
}
