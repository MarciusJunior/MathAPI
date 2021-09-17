package com.mathapi.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mathapi.service.ContaService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/contas")
public class ContasController {
	
	private ContaService contaService;
	
	@GetMapping("/fibonacci/{numero}")
	public int calcularFibo(@PathVariable int numero) {
		return contaService.contaFibo(numero);
	}
	
	@GetMapping("/fatorial/{numero}")
	public int calcularFat(@PathVariable int numero) {
		return contaService.contaFat(numero);
	}
	
	@GetMapping(value = "/PA/PrimeiroTermo/{PrimeiroTermo}/NumeroTermos/{NumeroTermos}/Razao/{Razao}")
	public Object[] calcularPa(@PathVariable int PrimeiroTermo, @PathVariable int NumeroTermos, @PathVariable int Razao) {
		return contaService.contaPa(PrimeiroTermo, NumeroTermos,Razao );
	}
	
	@GetMapping(value = "/PG")
	public Object[] calcularPg(@RequestParam int PrimeiroTermo, @RequestParam int Razao, @RequestParam int QuantidadeTermo) {
		return contaService.contaPg(PrimeiroTermo, Razao, QuantidadeTermo);
	}
	

}
