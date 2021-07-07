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
		int result=0;
		//VALOR INICIAL DE N
		System.out.println("Valor inicial de N = "+n);
		//INCREMENTAR N EN 77
		result=n+77;
		System.out.println(n+" + 77 = "+result);
		//DECREMENTARLA EN 3
		result=n-3;
		System.out.println(n+" - 3 = "+result);
		//DUPLICAR SU VALOR
		result=n*2;
		System.out.println(n+" * 2 = "+result);
	}

}
