package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
//		System.out.println(2+3);
		double raio = 3.4;
		
		/* final tornar a variavel em constante. Na conves�o nomes de constantes s�o declaradas de maneira maiuscula*/
		final double PI	= 3.14159;
		
		double area = PI* raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = area = PI* raio * raio;
		
		System.out.println("�rea = " + area + "m2");
	}
}
