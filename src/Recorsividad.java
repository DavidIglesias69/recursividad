
public class Recorsividad {
	
	public static void main(String[] args) {
		System.out.println(esPalindromo("radakr"));
		System.out.println(ordenarPalabra ("abcdp"));
		
		
		String nu1 = invertir(32456);
		System.out.println(nu1);
		
		int num2= potencia(2,3);
		System.out.println(num2);
		System.out.println("");
		System.out.println("-----------------------");
		int num1=fibonacci(7);
		System.out.println(num1);
		System.out.println("");
		System.out.println("-----------------------");
		int num =devolverNumeroDigitos (37559);
		System.out.println(num);
		System.out.println("");
		System.out.println("-----------------------");
		imprimirNPrimerosNumeros1 (9);
		System.out.println("");
		System.out.println("-----------------------");
		imprimirNPrimerosNumeros (9);
		System.out.println("");
		System.out.println("-----------------------");
		int suma=sumarNPrimerosNumeros(5);
		System.out.println("la suma es: " + suma);
		System.out.println("-----------------------");
		int multiplicacion=multiplicarNPrimerosNumeros(5);
		System.out.println("la multiplicacion es: "+ multiplicacion);
	}
	
	
public static int sumarNPrimerosNumeros (int n) {
	if (n==1) {
		return 1;
	}
	System.out.println("suma de "+ n + " suma los "+(n-1)+" primeros");
	return n + sumarNPrimerosNumeros(n-1);
}
	
public static int multiplicarNPrimerosNumeros (int n) {
	if (n==0) {
		return 1;
	}
	System.out.println("multiplicacion de "+ n + " por los "+(n-1)+" primeros");
	return n * multiplicarNPrimerosNumeros(n-1);
}
	
public static void imprimirNPrimerosNumeros (int n) {
	if (n>1) {
		imprimirNPrimerosNumeros(n-1); 
	}
		System.out.print(n);
	
}

public static void imprimirNPrimerosNumeros1 (int n) {
	
		System.out.print(n);
		if (n>1) {
			imprimirNPrimerosNumeros1(n-1); 
		}
	
}

public static int devolverNumeroDigitos (int n) {
	if (n<1) {
		return 0;
	}
	
	return 1+ devolverNumeroDigitos (n/10);
	
}


public static int fibonacci (int n) {
	if (n==1 || n==0) {
		return n;
	}
	return  fibonacci (n-1)+fibonacci(n-2);
}

public static int potencia(int base, int exponente) {
	if (exponente==0) {
		return 1;
	}

	return base*potencia(base,exponente-1);
	
}
public static String invertir (int n) {
	if(n<10) {
		return ""+ n;
	}
	return n%10 +invertir(n/10);
	
}
public static boolean ordenarPalabra (String cadena1) {
	if (cadena1.length()==1) {
		return true;
	}
	boolean ordenado=cadena1.charAt(0) <= cadena1.charAt(1);
		return ordenado && ordenarPalabra (cadena1.substring(1,cadena1.length()-1));
	
	
	
}

public static boolean esPalindromo (String cadena2) {
	if(cadena2.length()==1 || cadena2.length()==0) {
		return true;
	}
		boolean primeraUltima = cadena2.charAt(0)==cadena2.charAt(cadena2.length()-1);
		return primeraUltima && esPalindromo(cadena2.substring(1,cadena2.length()-1));
	}
	


}
