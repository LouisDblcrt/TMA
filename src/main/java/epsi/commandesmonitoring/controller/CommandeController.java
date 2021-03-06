package epsi.commandesmonitoring.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import epsi.commandesmonitoring.model.Commande;
import epsi.commandesmonitoring.repository.CommandeRepository;

@Controller
@RequestMapping("")
public class CommandeController {

	@Autowired
	CommandeRepository commandeRepository;

	@GetMapping({ "/", "/commandes" })
	public String getCommandeEtatDemande(Model model) {
		/*
		 * model.addAttribute("listCommandesDemande",
		 * commandeRepository.selectCommandeDemande());
		 * model.addAttribute("listCommandesEnPrep",
		 * commandeRepository.selectCommandeEnPrep());
		 * model.addAttribute("listCommandesFini",
		 * commandeRepository.selectCommandeFini());
		 * model.addAttribute("listCommandesHistorisee",
		 * commandeRepository.selectCommandeHistorisee());
		 * model.addAttribute("getLastUpdatedCommande",
		 * commandeRepository.selectLastUpdatedCommande());
		 */
		return "commandes";
	}

	/*
	 * @GetMapping({"/monitoring"}) public void getLastUpdatedCommandes(Model
	 * model){ model.addAttribute("getLastUpdatedCommande",
	 * commandeRepository.selectLastUpdatedCommande());
	 * model.addAttribute("numberOfCommandesInStateZero",
	 * commandeRepository.countCommandeOfStateZero());
	 * model.addAttribute("numberOfCommandesInStateOne",
	 * commandeRepository.countCommandeOfStateOne());
	 * model.addAttribute("numberOfCommandesInStateTwo",
	 * commandeRepository.countCommandeOfStateTwo());
	 * model.addAttribute("numberOfCommandesInStateThree",
	 * commandeRepository.countCommandeOfStateThree()); }
	 */

	@PostMapping("commandes")
	public void insertCommande(@RequestParam(name = "magasin") String magasin,
			@RequestParam(name = "acheteur") String acheteur, @RequestParam(name = "produit") String produit) {
		System.out.println("magasin " + magasin);
		Date date = new Date();
		Commande commande = new Commande();
		commande.setAcheteur(acheteur);
		commande.setMagasin(magasin);
		commande.setProduit(produit);
		commande.setQuantite(1);
		commande.setPrix(9);
		commande.setDate_creation_commande(new Date());
		commandeRepository.save(commande);
	}

	@GetMapping("commandes/{id}")
	public Commande getCommande(@PathVariable(name = "id") Long id) {
		System.out.println("ID : " + id);
		Optional<Commande> commande = commandeRepository.findById(id);
		return commande.get();
	}
	
}
