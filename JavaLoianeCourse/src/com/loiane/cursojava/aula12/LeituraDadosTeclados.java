package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclados {

	public static void main(String[] args) {
		
		try (Scanner scankb = new Scanner(System.in)) {
			System.out.println("Digite seu primeiro nome, idade, quatidade de filhos, altura e se tem bichinho de estima��o: ");
			String primeiroNome = scankb.next();
			int idade = scankb.nextInt();
			byte qtdFilhos = scankb.nextByte();
			float altura = scankb.nextFloat();
			boolean temPet = scankb.nextBoolean();
			
			System.out.println("Voc� difitou os seguintes valores:");
			System.out.println("Primeiro nome: " + primeiroNome);
			System.out.println("Idade: "+ idade);
			System.out.println("Quantidade de filhos: " + qtdFilhos);
			System.out.println("Altura: " + altura);
			System.out.println("Tem bichinho de estima��o? " + temPet);
		}
		
		/* System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scankb.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);

		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scankb.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Digite a sua idade:");
		int idade = scankb.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		System.out.println("Digite sua altura:");
		double altura = scankb.nextDouble(); // por padr�o o double retira o �ltimo zero
		System.out.println("A sua altura � " + altura); */
				
	}

}
