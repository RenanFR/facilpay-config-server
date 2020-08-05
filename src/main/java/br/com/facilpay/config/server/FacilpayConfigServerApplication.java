package br.com.facilpay.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FacilpayConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacilpayConfigServerApplication.class, args);
	}

}
