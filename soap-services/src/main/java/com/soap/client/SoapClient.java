package com.soap.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.soap.wsdl.AddResponse;
import com.soap.wsdl.Add;

//enlloc de marcar la anotacio @Component creo un package de configuracio
public class SoapClient extends WebServiceGatewaySupport{
	
	//Aqui definirem els nostres mètodes:suma, resta...
	//Si mirem les classes que ens crea el pom, veiem que tenim una resposta de la suma: AddResponse
	public AddResponse getAddResponse(int numA, int numB) {
		
		Add sumaRequest = new Add();
		sumaRequest.setIntA(numA);
		sumaRequest.setIntB(numB);

		//li passem el targetNameSpace del wsdl
		SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");
		
		AddResponse addResponse = (AddResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", sumaRequest,soapActionCallback);
		return addResponse;
	}
	
	
	

}
