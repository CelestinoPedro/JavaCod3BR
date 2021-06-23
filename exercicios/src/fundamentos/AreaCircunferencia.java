package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
//		System.out.println(2+3);
		double raio = 3.4;
		
		/* final tornar a variavel em constante. Na convesão nomes de constantes são declaradas de maneira maiuscula*/
		final double PI	= 3.14159;
		
		double area = PI* raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = area = PI* raio * raio;
		
		System.out.println("Área = " + area + "m2");
	}
}
