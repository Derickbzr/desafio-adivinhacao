package desafioAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
	
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in); // recebe o valor do usuario
	int numeroGerado = new Random().nextInt(100); // gera um numero aleatorio
	int tentativas = 0;
	int numeroDigitado = 0;
	
	while (tentativas < 5) {
		System.out.println("Digite um valor entre 0 e 100: ");
		numeroDigitado = leitor.nextInt();
		tentativas++;
		
		if (numeroDigitado == numeroGerado) {
			System.out.println("Parabens, voce acertou o numero em " + tentativas + " tentativas!");
			break;
		} else if (numeroDigitado < numeroGerado) {
			System.out.println("O numero digitado e menor que o numero gerado!");
		}else {
			System.out.println("O numero digitado e maior que o numero gerado!");
			
		}
	}
	
	if (tentativas == 5 && numeroDigitado != numeroGerado) {
		System.out.println("Voce nao conseguiu acertar o numero em 05 tentativas. O numero era: " + numeroGerado);
	}
	
 }
}
