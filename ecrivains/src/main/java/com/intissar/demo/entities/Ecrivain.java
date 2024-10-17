package com.intissar.demo.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Ecrivain { 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEcrivain;
	private String nomEcrivain;
	private Double prixLivre;
	private Date dateCreation;
	
	@ManyToOne
	private Genre genre;
	 
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Ecrivain() {super();}
	
	public Ecrivain(String nomEcrivain, Double prixLivre, Date dateCreation) {
		super();
		this.nomEcrivain = nomEcrivain;
		this.prixLivre = prixLivre;
		this.dateCreation = dateCreation;
	}
	

	public Long getIdEcrivain() {
		return idEcrivain;
	}

	public void setIdEcrivain(Long idEcrivain) {
		this.idEcrivain = idEcrivain;
	}
   
	public String getNomEcrivain() {
		return nomEcrivain;
	}

	public void setNomEcrivain(String nomEcrivain) {
		this.nomEcrivain = nomEcrivain;
	}

	public Double getPrixLivre() {
		return prixLivre;
	}

	public void setPrixLivre(Double prixLivre) {
		this.prixLivre = prixLivre;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Ecrivain [idEcrivain=" + idEcrivain + ", nomEcrivain=" + nomEcrivain + ", prixLivre=" + prixLivre
				+ ", dateCreation=" + dateCreation + "]";
	}
	
	
}
