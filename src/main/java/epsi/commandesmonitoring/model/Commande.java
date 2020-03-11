package epsi.commandesmonitoring.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="commande")
public class Commande {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String magasin;
	
	@NotNull
	private String produit;
	
	@NotNull
	private String acheteur;
	
	@NotNull
	private Integer quantite;
	
	@NotNull
	private Date date_creation_commande;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMagasin() {
		return magasin;
	}

	public void setMagasin(String magasin) {
		this.magasin = magasin;
	}

	public String getProduit() {
		return produit;
	}

	public void setProduit(String produit) {
		this.produit = produit;
	}

	public String getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(String acheteur) {
		this.acheteur = acheteur;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public Date getDate_creation_commande() {
		return date_creation_commande;
	}

	public void setDate_creation_commande(Date date_creation_commande) {
		this.date_creation_commande = date_creation_commande;
	}


}
