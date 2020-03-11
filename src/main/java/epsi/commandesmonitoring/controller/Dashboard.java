package epsi.commandesmonitoring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class Dashboard {
	@GetMapping({ "/dashboard" })
	public String getDashboard(Model model) {
		return "dashboard";
	}

}
