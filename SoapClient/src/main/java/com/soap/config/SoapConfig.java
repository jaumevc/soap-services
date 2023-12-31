package com.soap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.soap.client.WsClient;

@Configuration
public class SoapConfig {
	
	//Al declara com a Bean aquest metode vol dir que això es converteix amb un Objecte administrat per Spring
	@Bean
	public Jaxb2Marshaller marshaller() {
		//Declarem el traductor de classes java a xml
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		//li diem on estan les classes autogenerades que fan les traduccions de java a xml
		marshaller.setContextPath("com.soap.ws");
		return marshaller;
	}
	
	//Els parametres s'injecta automaticament el Bean que hem creat 
	@Bean
	public WsClient getSoapClient(Jaxb2Marshaller marshaller) {
		WsClient soapClient = new WsClient();
		//la ruta del location del wsdl
		soapClient.setDefaultUri("http://www.dneonline.com/calculator.asmx");
		//traduccions de java a xml
		soapClient.setMarshaller(marshaller);
		//traduccions de xml a java
		soapClient.setUnmarshaller(marshaller);
		return soapClient;
	}
}
