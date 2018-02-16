package com.operacoes.br;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean condicaoSaida = false;
		int opcao;
		int valorA;
		int valorB;
		Operacoes operacoes = new Operacoes();
		
		
		while(!condicaoSaida){
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Escolha uma opcão:\n" + "1 Somar\n" + "2 Subitrair\n" + "3 Multiplicar\n" +
					"4 Dividir\n" + "5 Fatorial (para valores entre 1 e 100)\n" + 
					"6 Sequencia de fibonaci (para valores entre 1 e 100)");
			opcao = scanner.nextInt();
			switch(opcao){
				case 1:
					operacoes.somar();
					break;
				case 2:
					operacoes.subtrair();
					break;
				case 3:
					operacoes.multiplicar();
					break;
				case 4:
					operacoes.dividir();
					break;
				case 5:
					operacoes.Calcularfatorial();
					break;
				case 6:
					operacoes.calcularSequenciaFibonacci();
					break;
			}
		}
		
	}

}
