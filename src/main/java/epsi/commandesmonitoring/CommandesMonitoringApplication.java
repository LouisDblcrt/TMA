package epsi.commandesmonitoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("epsi.commandesmonitoring")
@EnableScheduling
public class CommandesMonitoringApplication implements CommandLineRunner{

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(CommandesMonitoringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	}

}
