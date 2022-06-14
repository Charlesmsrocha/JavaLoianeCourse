package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		//5
		System.out.println(resultado++); // Soma depois que o resultado já está na tela
		System.out.println(resultado);
		System.out.println(++resultado); //Soma antes de mostrar o resultado
		System.out.println(resultado);
		
		resultado --; //6
		System.out.println(resultado);
		
		System.out.println(resultado--); //mostra 6 mas já vale 5
		System.out.println(--resultado); //5 subtraindo 1 mostrando 4
	}

}
