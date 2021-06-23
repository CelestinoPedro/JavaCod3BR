package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		// Scanner processo de mapeia a entrada System in, ou seja o teclaso.
		Scanner entrada = new Scanner(System.in);

			System.out.print("Digite seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Digite o seu sobrenome: ");
			String sobrenome = entrada.nextLine();
	
			System.out.print("Digite a sua idade: ");
			Integer idade = entrada.nextInt();
	
			System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

		entrada.close();
	}

}
