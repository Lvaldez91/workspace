package basicJava.lvd.code;

public class variables {
	public static void main(String[] args) {
		
		System.out.println("Las variables en Java son un espacio de memoria en que se guarda un valor.");
		System.out.println("Estructura:");
		System.out.println("[privacidad] tipo_variable identificador;");
		System.out.println("Java es un lenguaje de tipado estático");
		System.out.println("Por lo que todas las variables tendrán un tipo de dato primitivo o clase");
		System.out.println("Tipos primitivos: int, short, long, double, float, boolean, byte, char");
		
		int numero = 2; 
		long decimal = (long) 2.4;
		short numShort = 23;
		float numFloat = 123.09F;
		double numDouble = 987.29D;
		char charT = 'a';
		String cadena = "Hola Mundo";
		boolean flag = true;
		final long PI = (long) 3.14159;
		byte bites = 1;
		
		System.out.println("Tipo int: " + numero);
		System.out.println("Tipo long: " + decimal);
		System.out.println("Tipo short: " + numShort);
		System.out.println("Tipo float: " + numFloat);
		System.out.println("Tipo double: " + numDouble);
		System.out.println("Tipo char: " + charT);
		System.out.println("Tipo String: " + cadena);
		System.out.println("Tipo boolean: " + flag);
		System.out.println("Tipo final long: " + PI);
		System.out.println("Tipo byte: " + bites);
	}
}
