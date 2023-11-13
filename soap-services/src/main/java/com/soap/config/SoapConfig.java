package com.soap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.soap.client.SoapClient;

@Configuration
public class SoapConfig {

    @Bean
    Jaxb2Marshaller marshaller() {
		
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//		el mateix que hem posat en el pom en el generatePackage
		marshaller.setContextPath("com.soap.wsdl");
		return marshaller;
	}

    @Bean
    SoapClient getSoapClient(Jaxb2Marshaller marshaller) {
		SoapClient soapClient = new SoapClient();
		
		//lo mateix del location del webservice
		soapClient.setDefaultUri("http://www.dneonline.com/calculator.asmx");
		soapClient.setMarshaller(marshaller);
		soapClient.setUnmarshaller(marshaller);
		
		return soapClient;
	}

}
