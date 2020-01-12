package it.davidenastri.healthcheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HealthCheckApplication {

	public static void main(String[] args) {
	    Check check = new Check(80, Check.Protocol.HTTP);
        List<Check> checks = new ArrayList<Check>();
        checks.add(check);
	    ConfigurationItem ci = new ConfigurationItem("davidenastri.it", "webserver", checks);
		SpringApplication.run(HealthCheckApplication.class, args);
	}

}
