package com.soap.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.soap.wsdl.AddResponse;
import com.soap.wsdl.SubtractResponse;
import com.soap.wsdl.DivideResponse;
import com.soap.wsdl.MultiplyResponse;
import com.soap.wsdl.Add;
import com.soap.wsdl.Subtract;

import com.soap.wsdl.Multiply;

import com.soap.wsdl.Divide;

//enlloc de marcar la anotacio @Component creo un package de configuracio
public class SoapClient extends WebServiceGatewaySupport{
	
	//Aqui definirem els nostres mètodes:suma, resta...
	
	//Suma
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
	
	//Resta:
	public SubtractResponse getSubtractResponse(int numA, int numB) {
		Subtract restaRequest = new Subtract();
		restaRequest.setIntA(numA);
		restaRequest.setIntB(numB);
		
		//li passem el targetNameSpace del wsdl
		SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");
		
		SubtractResponse restaResponse = (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", restaRequest,soapActionCallback);
		
		return restaResponse;
	}
	
	//Producte
	public MultiplyResponse getMultiplyResponse(int numA, int numB) {
		Multiply producteRequest = new Multiply();
		producteRequest.setIntA(numA);
		producteRequest.setIntB(numB);
		
		//li passem el targetNameSpace del wsdl
		SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");
		
		MultiplyResponse productResponse = (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", producteRequest, soapActionCallback);
		
		return productResponse;
	}
	
	public DivideResponse getDivideResponse(int numA, int numB) {
		Divide divideRequest = new Divide();
		divideRequest.setIntA(numA);
		divideRequest.setIntB(numB);
		
		//li passem el targetNameSpace del wsdl
		SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");
		
		DivideResponse divideResponse = (DivideResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", divideRequest, soapActionCallback);
		return divideResponse;
	}
}
