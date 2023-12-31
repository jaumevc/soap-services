package com.soap.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.soap.ws.*;

public class WsClient extends WebServiceGatewaySupport {

	// metode implementació de la SUMA
	public AddResponse getAddResponse(int a, int b) {

		Add suma = new Add();

		suma.setIntA(a);
		suma.setIntB(b);

		SoapActionCallback soapActCbk = new SoapActionCallback("http://tempuri.org/Add");

		AddResponse resposta = (AddResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", suma, soapActCbk);
		return resposta;
	}

	// metode implementació de la RESTA
	public SubtractResponse getSubtractResponse(int a, int b) {

		Subtract resta = new Subtract();

		resta.setIntA(a);
		resta.setIntB(b);

		SoapActionCallback soapActCbk = new SoapActionCallback("http://tempuri.org/Subtract");

		SubtractResponse resposta = (SubtractResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", resta, soapActCbk);
		return resposta;
	}

	// metode implementació de la DIVISIÖ
	public DivideResponse getDivideResponse(int a, int b) {

		Divide divisio = new Divide();

		divisio.setIntA(a);
		divisio.setIntB(b);

		SoapActionCallback soapActCbk = new SoapActionCallback("http://tempuri.org/Divide");

		DivideResponse resposta = (DivideResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", divisio, soapActCbk);
		return resposta;
	}

	// metode implementació de la MULTIPLICACIÓ
	public MultiplyResponse getMultiplyResponse(int a, int b) {

		Multiply producte = new Multiply();

		producte.setIntA(a);
		producte.setIntB(b);

		SoapActionCallback soapActCbk = new SoapActionCallback("http://tempuri.org/Multiply");

		MultiplyResponse resposta = (MultiplyResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", producte, soapActCbk);
		
		return resposta;
	}
}
