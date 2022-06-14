package com.loiane.cursojava.aula11;

public class Curiosidadeint {

	public static void main(String[] args) {
		
		int var1 = 2147483647;
		
		int var2 = 100;
		
		System.out.println(var1 + var2); //irá funcionar como uma roleta
		
		
		
		// Não podemos colocar underscore perto de ponto
		//float pi1 = 3_.1415F;
		//float pi2 = 3._1415F;
		
		//Não podemos colocar underscore perto de sufixos (L)
		//long cpf = 101_134_156_68_L;
		
		//identificar, não é literal
		//int x1 = _52;
		
		//Ok (decimal literal)
		//int x2 = 5_2;
		
		// Não pode colocar underscore no final de um literal
		//int x3 = 52_;
		
		//OK (decimal literal)
		//int x4 = 5___________2;
		
		// Não pode colocar underscore perto de prefixos (0x)
		//int x5 = 0_x52;
		
		// Não pode colocar underscore no começo de números
		//int x6 = 0x_52;
		
		//OK (hexadecimal literal)
		//int x7 = 0x5_2;
		
		//Não pode colocar underscore no final de números
		//int x8 = 0x52_;
		
	}

}
