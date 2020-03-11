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


}
