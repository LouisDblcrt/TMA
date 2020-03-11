package epsi.commandesmonitoring.repository;

import java.sql.Date;
import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import epsi.commandesmonitoring.model.Commande;
@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long>{
	
	/*

	@Modifying
	@Transactional
	@Query(value = "update commande c set c.etat = ?, c.date_modification= ? where c.id BETWEEN ? AND ? and c.etat = ?", 
	  nativeQuery = true)
	int updateEtat(Integer etat, Date date,Long min, Long max, Integer etatBase);
	
	@Query("SELECT c FROM Commande c WHERE c.etat = 0")
	Collection<Commande> selectCommandeDemande();

	@Query(value = "SELECT * FROM Commande c ORDER BY date_modification desc LIMIT 1", nativeQuery = true)
	Commande selectLastUpdatedCommande();
	
	@Query(value = "SELECT COUNT(*) FROM Commande c WHERE c.etat = 0", nativeQuery = true)
	String countCommandeOfStateZero();
	
	
	@Modifying
	@Transactional
	@Query(value="insert into Commande (id_magasin,etat,date_creation) values (:idMagasin,:etat,:dateCreation)",nativeQuery=true)
	void insertCommande(@Param("idMagasin") Integer idMagasin, @Param("etat") Integer etat, @Param("dateCreation") Date dateCreation); */
}
