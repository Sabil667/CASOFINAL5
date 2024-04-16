package OptimizacionDeProcesos;

import java.util.Random;

public class QuickSortOptimizado {
    private static final int UMBRAL_INSERCION = 10;
    private static final Random RAND = new Random();

    public static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int inicio, int fin) {
        int longitud = fin - inicio + 1;

        if (longitud < UMBRAL_INSERCION) {
            insercion(array, inicio, fin);
        } else {
            int pivot = particion(array, inicio, fin);
            quicksort(array, inicio, pivot - 1);
            quicksort(array, pivot + 1, fin);
        }
    }

    private static int particion(int[] array, int inicio, int fin) {
        intercambiar(array, inicio, inicio + RAND.nextInt(fin - inicio + 1));
        int pivot = array[inicio];
        int i = inicio + 1;
        int j = fin;

        while (i <= j) {
            if (array[i] <= pivot) {
                i++;
            } else if (array[j] >= pivot) {
                j--;
            } else {
                intercambiar(array, i, j);
            }
        }

        intercambiar(array, inicio, j);
        return j;
    }

    private static void intercambiar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void insercion(int[] array, int inicio, int fin) {
        for (int i = inicio + 1; i <= fin; i++) {
            int valorActual = array[i];
            int j = i;

            while (j > inicio && array[j - 1] > valorActual) {
                array[j] = array[j - 1];
                j--;
            }

            array[j] = valorActual;
        }
    }
}