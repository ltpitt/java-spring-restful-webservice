package it.davidenastri.healthcheck;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HealthCheckApplication {

	public static void main(String[] args) {
	    SpringApplication.run(HealthCheckApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ConfigurationItemRepository repository) {
		return (args) -> {
			// save a few customers
//			Check check = new Check(80, Check.Protocol.HTTP);
//			List<Check> checks = new ArrayList<Check>();
//			checks.add(check);
//			ConfigurationItem ci = new ConfigurationItem("davidenastri.it", "webserver", checks);
//			ConfigurationItem ci2 = new ConfigurationItem("davidenastri2.it", "webserver", checks);
//			repository.save(ci);
//			repository.save(ci2);
//			List<ConfigurationItem> cis = repository.findAll();
//
//			cis.stream()
//					.forEach(x -> System.out.println(x));

//			// fetch all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (Customer customer : repository.findAll()) {
//				log.info(customer.toString());
//			}
//			log.info("");
//
//			// fetch an individual customer by ID
//			Customer customer = repository.findById(1L);
//			log.info("Customer found with findById(1L):");
//			log.info("--------------------------------");
//			log.info(customer.toString());
//			log.info("");
//
//			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			repository.findByLastName("Bauer").forEach(bauer -> {
//				log.info(bauer.toString());
//			});
//			// for (Customer bauer : repository.findByLastName("Bauer")) {
//			//  log.info(bauer.toString());
//			// }
//			log.info("");
		};
	}

}
