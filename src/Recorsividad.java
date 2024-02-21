
public class Recorsividad {
	
	public static void main(String[] args) {
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
	
}
