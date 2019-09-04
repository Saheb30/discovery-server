package org.saheb.discoveryserversvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerSvcApplication.class, args);
	}

}
