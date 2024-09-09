package desafioAdivinhacao;

import java.util.Scanner;

public class CriandoProgramas {
 public static void main(String[] args) {
	 Scanner leitor = new Scanner(System.in);
	
	
		 
	 	System.out.println("Digite um valor1: ");
	 	int numero1 = leitor.nextInt();
	 	
	 	System.out.println("Digite um valor2: ");
	 	int numero2 = leitor.nextInt();
	 	
	 	if (numero1 == numero2) {
	 		System.out.println("O valor e igual");
	 	} else if (numero1 < numero2) {
	 		System.out.println("O primeiro valor e menor!");
	 	} else if (numero1 > numero2) {
	 		System.out.println("O primeiro valor e maior!");
	 	}
	 	
	 
	 	if (numero1 %2 == 0) {
	 		System.out.println("O valor1 e par!");
	 	} else {
    	System.out.println("O valor1 e impar!");
    }
	 	if (numero2 %2 == 0) {
	 		System.out.println("O valor2 e positivo");
	 	} else {
	 		System.out.println("O valor2 e negativo");
	 	}
 
 }
}
