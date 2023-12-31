package com.soap.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soap.client.WsClient;
import com.soap.ws.AddResponse;
import com.soap.ws.DivideResponse;
import com.soap.ws.MultiplyResponse;
import com.soap.ws.SubtractResponse;

@RestController
public class WsClientController {
	
	@Autowired
	private WsClient wsClient;
	
	@PostMapping("/sumar")
	public ResponseEntity<?> add(@RequestParam int a, @RequestParam int b){
		
		AddResponse respostaSuma = wsClient.getAddResponse(a, b);
		
		Map<String, Integer> respostaJoson = new HashMap<>();
		respostaJoson.put("Resultat de la suma", respostaSuma.getAddResult());
		
//		return ResponseEntity.ok(respostaSuma.getAddResult());
		
//		return ResponseEntity.ok(respostaJoson);
		return ResponseEntity.ok().body(respostaJoson);
	}
	
	@PostMapping("/restar")
	public ResponseEntity<?> subtract(@RequestParam int a, @RequestParam int b){
		
		SubtractResponse resposta = wsClient.getSubtractResponse(a, b);
		return ResponseEntity.ok(resposta.getSubtractResult());
	}
	
	@PostMapping("/dividir")
	public ResponseEntity<?> divide(@RequestParam int a, @RequestParam int b){
		
		DivideResponse resposta = wsClient.getDivideResponse(a, b);
		return ResponseEntity.ok(resposta.getDivideResult());
	}
	
	@PostMapping("/multiplicar")
	public ResponseEntity<?> multiply(@RequestParam int a, @RequestParam int b){
		
		MultiplyResponse resposta = wsClient.getMultiplyResponse(a, b);
		return ResponseEntity.ok(resposta.getMultiplyResult());
	}

}
