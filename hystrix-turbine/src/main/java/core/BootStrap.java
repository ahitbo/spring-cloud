package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class BootStrap {

	public static void main(String[] args) {
		SpringApplication.run(BootStrap.class, args);
	}

}
