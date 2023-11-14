package com.soap.controler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soap.client.SoapClient;
import com.soap.wsdl.AddResponse;
import com.soap.wsdl.DivideResponse;
import com.soap.wsdl.MultiplyResponse;
import com.soap.wsdl.SubtractResponse;

@RestController
public class SoapControler {
	
	@Autowired
	private SoapClient soapClient;

	@PostMapping("/sumar")
	public ResponseEntity<?> add(@RequestParam int numA, @RequestParam int numB){
		
		AddResponse addResponse = soapClient.getAddResponse(numA, numB);
		//Creem el mapa xq el Postman ens retorni un JSON
		Map<String, Integer> response =  new HashMap<>();
		response.put("resultat", addResponse.getAddResult());
		
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/restar")
	public ResponseEntity<?> subtract(@RequestParam int numA, @RequestParam int numB){
		
		SubtractResponse subtractResponse = soapClient.getSubtractResponse(numA, numB);
		//Creem el mapa xq el Postman ens retorni un JSON
		Map<String, Integer> response =  new HashMap<>();
		response.put("resultat", subtractResponse.getSubtractResult());

		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/multiplicar")
	public ResponseEntity<?> multiply(@RequestParam int numA, @RequestParam int numB){
		
		MultiplyResponse multiplyResponse = soapClient.getMultiplyResponse(numA, numB);
		
		//Creem el mapa xq el Postman ens retorni un JSON
		Map<String, Integer> response =  new HashMap<>();
		response.put("resultat", multiplyResponse.getMultiplyResult());

		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/dividir")
	public ResponseEntity<?> divide(@RequestParam int numA, @RequestParam int numB){
		
		DivideResponse divideResponse = soapClient.getDivideResponse(numA, numB);
		
		//Creem el mapa xq el Postman ens retorni un JSON
		Map<String, Integer> response =  new HashMap<>();
		response.put("resultat", divideResponse.getDivideResult());
				
		return ResponseEntity.ok(response);
	}
}
