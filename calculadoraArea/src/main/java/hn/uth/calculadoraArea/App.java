package hn.uth.calculadoraArea;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner teclado = new Scanner(System.in);
	public static void main( String[] args ){
	int opc = 0;
	do {
	 System.out.println("\tCalculadora");
	 System.out.println("1. Area del Circulo");
	 System.out.println("2. Area de un cuadrado");
	 System.out.println("3. Area de un rectangulo");
	 System.out.println("4. Area de un triangulo");
	 System.out.println("5. Salir");
	 System.out.println("************************");
	 System.out.println("Seleccione un numero: ");
	 System.out.println("");
	 opc= leerEntero("");
	 Double numeros = null;
	 switch(opc) {	
	 case 1:
		 numeros = areaCirculo(leerDecimal("Ingrese el radio del circulo: "));
		 break;
	 case 2:
		 numeros = areaCuadrado(leerDecimal("Ingrese el lado: "));
		 break;
	 case 3:
		 numeros = areaRectangulo(leerDecimal("ingrese el lado a: "),leerDecimal("ingrese el lado b: "));
		 break;
	 case 4:
		 numeros = areaTriangulo(leerDecimal("ingrese la base: "),leerDecimal("Ingrese la altura: "));
		 break;
	 case 5:
		 System.out.println("adios");
	 break;
	 default:
			System.out.println("Ingrese una de las opciones del menu.");
			break;
	 }
	 System.out.println("El resultado es: "+numeros);
		System.out.println("-------------------------------");
	}while(opc != 5);
	
	
	
	
	}
	private static int leerEntero(String mensaje) {
		teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextInt();
	}
	
	private static double leerDecimal(String mensaje) {
		teclado = new Scanner(System.in);
		double numero = -1;

	    System.out.println(mensaje);
	    numero = teclado.nextDouble();

	    while (numero < 0) {
	        System.out.println("No se permiten números negativos. Inténtalo nuevamente.");
	        System.out.println(mensaje);
	        numero = teclado.nextDouble();
	    }
	    return numero;
	}
	public static double areaCirculo(double r) {
		 double resultado=0;
		 
		 if(r<0) {
	      System.err.println("No se permiten numeros negativos");
		 }
		 else {
		 resultado=3.1416*(r*r);
		 	 }
		 
		 return resultado;
	}
	 public static double areaCuadrado(double lado) {
		 double resultado=0;
		 if(lado<0) {
	      System.err.println("No se permiten numeros negativos");
		 }
		 else {
		 resultado=lado*lado;
		
		 }
		 return resultado;
	 }
	 public static double areaRectangulo(double ladoa,double ladob) {
		 double resultado=0;
		 if(ladoa<0 || ladob<0) {
	      System.err.println("No se permiten numeros negativos");
	      
		 }
		 else {
		 resultado=ladoa*ladob;
		 }
		 return resultado;
	 }
	 public static double areaTriangulo(double base,double altura) {
		 double resultado=0;
		 if(base<0 || altura<0) {
	      System.err.println("No se permiten numeros negativos");
		 }
		 else {
		 resultado=(base*altura)/2;
		 }
		 return resultado;
	 }
}
