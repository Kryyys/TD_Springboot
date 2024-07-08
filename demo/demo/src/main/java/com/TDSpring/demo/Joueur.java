package com.TDSpring.demo;

public class Joueur {
	public int id;
	public String pseudo;
	public Genre genre;
	public int niveau;
	public Pouvoir pouvoir;
	public Sante sante;

	public Joueur(int id, String pseudo, Genre genre, int niveau, Pouvoir pouvoir, Sante sante) {
		this.id = id;
		this.pseudo = pseudo;
		this.genre = genre;
		this.niveau = niveau;
		this.pouvoir = pouvoir;
		this.sante = sante;
	}

	public Joueur(){}
}
