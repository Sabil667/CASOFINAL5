package HerramientaAnalisisNumerico;

import java.util.Scanner;

public class CalculoPotenciasYmaximos {

    public static int potencia() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la base:");
        int base = scanner.nextInt();

        System.out.println("Introduce el exponente:");
        int exponente = scanner.nextInt();

        int resultado = 1;
        for(int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static int encontrarMaximo(int[] datos) {
        int maximo = datos[0];
        for(int i = 1; i < datos.length; i++) {
            if(datos[i] > maximo) {
                maximo = datos[i];
            }
        }
        return maximo;
    }
}