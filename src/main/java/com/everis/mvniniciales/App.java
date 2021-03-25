package com.everis.mvniniciales;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * Esta clase es la clase principal
 * 
 * @author fferrera
 *
 */
public class App {

	/**
	 * Es el método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String cadena;

		/**
		 * Bucle que pide que introduzcas una cadena y para cuando esta es igual a fin
		 */
		do {

			System.out.println("Introduzca una cadena");
			cadena = scanner.nextLine();

			if (!cadena.equals("fin")) {

				/**
				 * Condición que indica si la cadena contiene o no palabras o caracteres.
				 */
				if (NumberUtils.isCreatable(cadena)) {
					System.out.println("Si es numérico, es el número" + cadena);
				} else {
					System.out.println("No es numérico.");
				}
				/**
				 * Condicón que indica si la cadena es nula o vacía o contiene información
				 */
				if (StringUtils.isBlank(cadena)) {
					System.out.println("La cadena es nula o vacía.");
				} else {
					System.out.println("La cadena contiene información.");
				}

			}

		} while (!cadena.equals("fin"));

	}
}
