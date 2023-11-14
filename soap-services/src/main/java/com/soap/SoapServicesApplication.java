package com.soap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.soap.client.SoapClient;
import com.soap.wsdl.AddResponse;

@SpringBootApplication
public class SoapServicesApplication {

//	private static final Logger LOG = LoggerFactory.getLogger(SoapServicesApplication.class); 
			
	public static void main(String[] args) {
		SpringApplication.run(SoapServicesApplication.class, args);
	}

	//	@Bean
//	CommandLineRunner init(SoapClient soapClient) {
//		
//		return args ->{
//			AddResponse resultatSuma = soapClient.getAddResponse(10, 5);
//			
//			LOG.info("El resultat de la suma de {} i {} és: {}", 10, 5, resultatSuma.getAddResult());
//		};
//	}
}
