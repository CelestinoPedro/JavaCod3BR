package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class DesafioConversao {
	
	public static void main(String[] args) {

		/*
		String holerite01 = JOptionPane.showInputDialog("Valor Holerite01:");
		holerite01 = holerite01.replace(",", ".");
		
		String holerite02 = JOptionPane.showInputDialog("Valor Holerite02:");
		holerite02 = holerite02.replace(",", ".");
		
		String holerite03 = JOptionPane.showInputDialog("Valor Holerite03:");
		holerite03 = holerite03.replace(",", ".");
		
		System.out.println("Valor Holerite01:" + holerite01 +
												"\n Valor Holerite02:" + holerite02 + 
												"\n Valor Holerite03:" + holerite03);

		System.out.println("Soma dos Valores String: " + holerite01 + holerite02 + holerite03);
		double valorHolerite01 = Double.parseDouble(holerite01);
		double valorHolerite02 = Double.parseDouble(holerite02);
		double valorHolerite03 = Double.parseDouble(holerite03);
		
		double soma = valorHolerite01 + valorHolerite02 + valorHolerite03;
		
		System.out.println("Soma dos Valores Interger: " +soma);
		*/
		
		Scanner teclado = new Scanner(System.in);
		
		//Nexline VS Next - Nextline pega o valor da linha inteira, Next somente a primeira palavara.
		System.out.print("Informe o primeiro salario:");
		String holerite01 = teclado.nextLine().replace(",",".");
		
		System.out.print("Informe o segundo salario:");
		String holerite02 = teclado.nextLine().replace(",",".");
		
		System.out.print("Informe o terceiro salario:");
		String holerite03 = teclado.nextLine().replace(",",".");
		
		double valorHolerite01 = Double.parseDouble(holerite01);
		double valorHolerite02 = Double.parseDouble(holerite02);
		double valorHolerite03 = Double.parseDouble(holerite03);
		
		double media = ((valorHolerite01 + valorHolerite02 + valorHolerite03)/3);
		
		System.out.println("A m?dia dos sal?rios ? " + media);
		
		teclado.close();
	}

}
