package fundamentos;

public class Temperatura {
	public static void main(String[] args) {

		// (º F - 32) x 5/9 = º C
		// Final e declarar como constante.
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;

		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;

		System.out.println("O resultado é " + celsius + " ºC.");
	}
}
