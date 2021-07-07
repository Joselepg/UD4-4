/**
	 * 4 - Escribe un programa Java que declare una variable entera N y asígnale un valor.
	 * A continuación escribe las instrucciones que realicen los siguientes:
	 * Incrementar N en 77.
	 * Decrementarla en 3.
	 * Duplicar su valor.
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
public class Ejercicio4App {

	public static void main(String[] args) {
		int n=6;
		//VALOR INICIAL DE N
		System.out.println("Valor inicial de N = "+n);
		//INCREMENTAR N EN 77
		n=n+77;
		System.out.println("N = "+n);
		//DECREMENTARLA EN 3
		n=n-3;
		System.out.println("N = "+n);
		//DUPLICAR SU VALOR
		n=n*2;
		System.out.println("N = "+n);
	}

}
