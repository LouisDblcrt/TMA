package epsi.commandesmonitoring.controller;

import java.sql.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import epsi.commandesmonitoring.model.Commande;
import epsi.commandesmonitoring.repository.CommandeRepository;



@Controller
public class CommandeController{
	
	@Autowired
	CommandeRepository commandeRepository;
	
	
    @GetMapping({"/", "/commandes"})
	public String getCommandeEtatDemande(Model model){
    	/*
		model.addAttribute("listCommandesDemande", commandeRepository.selectCommandeDemande());
   		model.addAttribute("listCommandesEnPrep", commandeRepository.selectCommandeEnPrep());
   		model.addAttribute("listCommandesFini", commandeRepository.selectCommandeFini());
   		model.addAttribute("listCommandesHistorisee", commandeRepository.selectCommandeHistorisee());
   		model.addAttribute("getLastUpdatedCommande", commandeRepository.selectLastUpdatedCommande());*/
		return "commandes";
	}

    /*
    @GetMapping({"/monitoring"})
    public void getLastUpdatedCommandes(Model model){
    	model.addAttribute("getLastUpdatedCommande", commandeRepository.selectLastUpdatedCommande());
    	model.addAttribute("numberOfCommandesInStateZero", commandeRepository.countCommandeOfStateZero());
    	model.addAttribute("numberOfCommandesInStateOne", commandeRepository.countCommandeOfStateOne());
    	model.addAttribute("numberOfCommandesInStateTwo", commandeRepository.countCommandeOfStateTwo());
    	model.addAttribute("numberOfCommandesInStateThree", commandeRepository.countCommandeOfStateThree());
    }*/
}
