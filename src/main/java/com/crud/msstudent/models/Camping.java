package com.crud.msstudent.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;


@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "camping")
public class Camping implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_camping;

    public int getId_camping() {
		return id_camping;
	}

	public void setId_camping(int id_camping) {
		this.id_camping = id_camping;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNbr_etoile() {
		return nbr_etoile;
	}

	public void setNbr_etoile(String nbr_etoile) {
		this.nbr_etoile = nbr_etoile;
	}

	public int getNbr_etoille() {
		return nbr_etoille;
	}

	public void setNbr_etoille(int nbr_etoille) {
		this.nbr_etoille = nbr_etoille;
	}

	public int getNbr_place_dispo() {
		return nbr_place_dispo;
	}

	public void setNbr_place_dispo(int nbr_place_dispo) {
		this.nbr_place_dispo = nbr_place_dispo;
	}

	public int getNbr_place_reserve() {
		return nbr_place_reserve;
	}

	public void setNbr_place_reserve(int nbr_place_reserve) {
		this.nbr_place_reserve = nbr_place_reserve;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}

	public String getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public int getIdOrganisateur() {
		return idOrganisateur;
	}

	public void setIdOrganisateur(int idOrganisateur) {
		this.idOrganisateur = idOrganisateur;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String titre;
    private String description;
    private String nbr_etoile ;
    private int nbr_etoille;

    private int nbr_place_dispo;

    private int nbr_place_reserve;

    private String prix;

    private String date_debut;

    private String date_fin;

    private String localisation;

    private int idOrganisateur;

    private int etat;


}
