package epsi.commandesmonitoring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import epsi.commandesmonitoring.repository.CommandeRepository;

@RestController
@RequestMapping("/api")
public class RestCommandes {

	@Autowired
	CommandeRepository commandeRepository;
}
