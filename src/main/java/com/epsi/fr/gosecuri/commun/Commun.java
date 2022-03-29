package com.epsi.fr.gosecuri.commun;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Commun {
	
	public String cheminDossierRessource = "../gosecuriJava/src/main/resources";
	public String cheminDossierGit = cheminDossierRessource + "/static/fichiersTest/git";
	public String cheminDossierGitGoSecuri = cheminDossierGit + "/GoSecuri-master";
	public String cheminDossierGitIdentities = cheminDossierGit + "/Identities";
	public String cheminDossierHtml = cheminDossierRessource + "/static/fichiersTest/html";
	public String cheminDossierMdp = cheminDossierRessource + "/static/fichiersTest/mdp";
	
	public void recup(){
		
//		String b  = this.getClass().getCanonicalName();
		String b  = this.getClass().getPackageName();
		System.out.println("b : " + b);
		
		b  = b.replace(".", "/");
		System.out.println("b : " + b);
		
		PrintWriter writer;
		try {
			writer = new PrintWriter(b, "UTF-8");
			writer.println("La première ligne");
			writer.println("La deuxième ligne");
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		b = b.replace(".", "\\") + "\\truc.txt";
//		
//		System.out.println("b : " + b);
		
		String c = cheminDossierRessource + "/commun.txt";
		
		System.out.println("c : "+ c);
		
		try {
			writer = new PrintWriter(c, "UTF-8");
			writer.println("La première ligne");
			writer.println("La deuxième ligne");
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				
	}
}
