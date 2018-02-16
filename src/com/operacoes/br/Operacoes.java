package com.operacoes.br;

import java.util.Scanner;

public class Operacoes {
	private Scanner scanner = new Scanner(System.in);
	public void somar(){
		System.out.println("Soma");
		float valorA = getValorA();
		float valorB = getValorB();
		float resposta = valorA+valorB;
		System.out.println("Resposta: " + resposta);
	}
	
	public void subtrair(){
		System.out.println("Subtração");
		float valorA = getValorA();
		float valorB = getValorB();
		float resposta = valorA-valorB;
		System.out.println("Resposta: " + resposta);
	}
	
	public void multiplicar(){
		System.out.println("Multiplicação");
		float valorA = getValorA();
		float valorB = getValorB();
		float resposta = valorA*valorB;
		System.out.println("Resposta: " + resposta);
	}
	
	public void dividir(){
		System.out.println("Divisão");
		float valorA = getValorA();
		float valorB = getValorB();
		if(valorB == 0){
			System.out.println("Valor invalido");
		}else{
			float resposta = valorA/valorB;
			System.out.println("Resposta: " + resposta);
		}
		
	}
	
	public void Calcularfatorial(){
		System.out.println("Fatorial!");
		int valorA = scanner.nextInt();
		int resposta = 1;
		
		if(valorA < 0){
			System.out.println("Valor invalido");
		}else if(valorA == 0){
			resposta = 1;
		}else{
			for(int i=1; i<=valorA; i++){
				resposta *= i;
			}
		}
		System.out.println("Resposta: " + resposta);
	}

	public void calcularSequenciaFibonacci(){
		System.out.println("Fibonacci");
		int valorA = scanner.nextInt();
		int resposta = 0;
		if(valorA < 0){
			System.out.println("Valor invalido");
		}else if(valorA < 2){
			resposta = valorA;
		}else{
			int valorAnterior=0;
			int valorAtual = 1;
			for(int i=0; i<(valorA-2); i++){
				resposta = valorAnterior + valorAtual;
				valorAnterior = valorAtual;
				valorAtual = resposta;
			}	
		}
		System.out.println("Resposta: " + resposta );
	}
	
	private float getValorA(){
		System.out.println("Entre com o primeiro número para a operação:");
		float valorA = scanner.nextInt();
		return valorA;
	}
	
	private float getValorB(){
		System.out.println("Entre com o primeiro número para a operação:");
		float valorA = scanner.nextFloat();
		return valorA;
	}
}
