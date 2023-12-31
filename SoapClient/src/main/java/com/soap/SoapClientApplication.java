package com.soap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.soap.client.WsClient;
import com.soap.ws.AddResponse;

@SpringBootApplication
public class SoapClientApplication {

//	private static final Logger LOG = LoggerFactory.getLogger(SoapClientApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SoapClientApplication.class, args);
	}
	
	//El WsClient es un objecte que hem fet administrar per Spring en la clase SoapConfig. 
	//Amb lo que s'injecta sense instanciar
//	@Bean
//	CommandLineRunner init(WsClient soapClient) { 
//		return args ->{
//			AddResponse resposta = soapClient.getAddResponse(5, 5);
//			
//			LOG.info("El resultat de la suma dels numeros {} i {} és: {}", 5, 5, resposta.getAddResult());
//		};
//	}
}
