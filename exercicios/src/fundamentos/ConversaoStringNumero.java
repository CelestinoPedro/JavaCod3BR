package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
		public static void main(String[] args) {
			
			String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
			String valor2 = JOptionPane.showInputDialog("Digite o segundo numero:");
			
			// Neste caso como o valor e do tipo texto a condi??o abaixo ira concatenar.
			System.out.println("Somando valores String: " + valor1 + valor2);
			
			//Convertendo um String em um n?mero.
			double numero1 = Double.parseDouble(valor1);
			double numero2 = Double.parseDouble(valor2);
			
			double soma = numero1 + numero2;
			
			System.out.println("Soma ? " + soma);
			System.out.println("M?dia ? " + soma/2);
		}

}
