package com.mathapi.service;

import org.springframework.stereotype.Service;



@Service
public class ContaService {
	
	public ContaService() {}
	
	public int contaFibo(int n) {
		int numFib1 = 0;
		int numFib2 = 1;
		
		if (n == numFib1) {
			return 0;
		} else if (n == numFib2) {
			return 1;
		} else {
			return contaFibo(n - 1) + contaFibo(n - 2);
		}
	}
	
	public int contaFat(int n) {
		int numFat = 1;
		for(int i = 1; i <= n; i++) {
			numFat *= i;
		}
		return numFat;
	}
	
	public Object[] contaPa(int PrimeiroTermo, int NumeroTermos, int Razao) {
		int Resultado = 0;
		int ResultadoSoma = 0;
		
		for (int i = 1; i <= NumeroTermos; i++) {
			Resultado = PrimeiroTermo + (i-1)*Razao;
			ResultadoSoma += PrimeiroTermo + (i-1)*Razao;
		}
		Object[] ResultadoFinal = {Resultado, ResultadoSoma};
		return ResultadoFinal;
		
	}
	
	public Object[] contaPg(int PrimeiroTermo,  int Razao, int QuantidadeTermo) {
		double Resultado = 0;
		double ResultadoSoma = 0;
		for(int i = 0; i < QuantidadeTermo; i++) {
			
			Resultado = PrimeiroTermo*(Math.pow(Razao, i));
			ResultadoSoma += PrimeiroTermo*(Math.pow(Razao, i));
		}
		Object[] ResultadoFinal = {Resultado, ResultadoSoma};
		return ResultadoFinal;
	}
	
	
	
	

}
