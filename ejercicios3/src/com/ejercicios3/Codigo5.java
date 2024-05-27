package com.ejercicios3;

import java.util.Scanner;

public class Codigo5 {
	
	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        String ni = s.nextLine();

        int c;
        try {
            c = Integer.parseInt(ni);
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Introduce un número entero.");
            return;
        }

        int afo = 0;
        int noAfo = 0;
        int numero = c;

        while (numero > 0) {
            int digito = numero % 10;
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
            numero /= 10;
        }

        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado.");
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }
    }
	
}