package epsi.commandesmonitoring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import epsi.commandesmonitoring.model.Commande;
import epsi.commandesmonitoring.repository.CommandeRepository;

@RestController
@RequestMapping("/api/commandes")
public class RestCommandes {

	@Autowired
	CommandeRepository commandeRepository;
	
	@GetMapping("{id}")
	public float getCommandeByMagasin(@PathVariable(name = "magasin") String magasin) {
		return commandeRepository.getCAByMagasin(magasin);
	}
}
