package exercicios;

import java.util.Scanner;


public class Main { 

	public static void main(String[] args) {
	
		int op;
		
		float num1, num2, resultado;
		 
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Escolha uma op��o: ");
						
			System.out.println("1 - Somar ");
			System.out.println("2 - Subtrair ");
			System.out.println("3 - Multiplicar ");
			System.out.println("4 - Dividir ");
			System.out.println("5 - Sair ");
			
			op = sc.nextInt();
			
			switch(op) {
				case 1: System.out.println("Digite um n�mero: ");
						num1 = sc.nextFloat();
						System.out.println("Digite um n�mero: ");
						num2 = sc.nextFloat();	
						resultado = num1+num2;
						System.out.println("O resultado da opera��o �: "+ resultado);
						break;
				case 2: System.out.println("Digite um n�mero: ");
						num1 = sc.nextFloat();
						System.out.println("Digite um n�mero: ");
						num2 = sc.nextFloat();						
						System.out.println("O resultado da opera��o �: "+ (num1-num2));
						break;
				case 3: System.out.println("Digite um n�mero: ");
						num1 = sc.nextFloat();
						System.out.println("Digite um n�mero: ");
						num2 = sc.nextFloat();						
						System.out.println("O resultado da opera��o �: "+ (num1*num2));
						break;
				case 4: System.out.println("Digite um n�mero: ");
						num1 = sc.nextFloat();
						System.out.println("Digite um n�mero: ");
						num2 = sc.nextFloat();						
						System.out.println("O resultado da opera��o �: "+ (num1/num2));
						break;
				case 5: System.out.println("Obrigado! Volte sempre!");
						break;
				default: System.out.println("Op��o inv�lida!");
			}
			
		}while(op != 5);

	}

}


/*
 * package exercicios;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		int idade = 19;
		String nome = "Rafael";
		
		// >, <, >=, <=, ==, !=
		// &&, ||, !
//		if( (idade >= 16) && (idade < 18) ) {
//			System.out.println(nome+" pode votar mas n�o � obrigat�rio!");
//		}else {
//			System.out.println(nome+" � menor de idade!");
//		}	
		
//		for(int i = 0; i <= 10; i++) {
//			System.out.println("8 x " + i + " = " + (8*i));	
//		}
		
//		int i = 0;
//		while(i < 10) {
//			i++;
//			System.out.println("8 x " + i + " = " + (8 * i));			
//		}
		int op;
		Scanner sc = new Scanner(System.in);
		float num1 = 0, num2 = 0;
		do {
			
			System.out.println("Escolha uma op��o: ");
						
			System.out.println("1 - Somar ");
			System.out.println("2 - Subtrair ");
			System.out.println("3 - Multiplicar ");
			System.out.println("4 - Dividir ");
			System.out.println("5 - Sair ");
			
			op = sc.nextInt();
			
			if(op != 5) {
				System.out.println("Digite um n�mero: ");
				num1 = sc.nextFloat();
				System.out.println("Digite um n�mero: ");
				num2 = sc.nextFloat();	
			}
						
			switch(op) {
				case 1: somar(num1, num2);
						break;
				case 2: subtrair(num1, num2);
						break;
				case 3: multiplicar(num1, num2);
						break;
				case 4: dividir(num1, num2);
						break;
				case 5: System.out.println("Obrigado! Volte sempre!");
						break;
				default: System.out.println("Op��o inv�lida!");
			}
			
		}while(op != 5);
	
	}
	
	public static void dividir(float num1, float num2) {
		System.out.println("O resultado da opera��o �: "+ (num1/num2));		
	}
	public static void somar(float num1, float num2) {
		
		System.out.println("O resultado da opera��o �: "+ (num1 + num2));
		
	}
	
	public static void subtrair(float num1, float num2) {
		
		System.out.println("O resultado da opera��o �: "+ (num1 - num2));
		
	}
	public static void multiplicar(float num1, float num2) {
						
		System.out.println("O resultado da opera��o �: "+ (num1*num2));
		
	}
}












 */

