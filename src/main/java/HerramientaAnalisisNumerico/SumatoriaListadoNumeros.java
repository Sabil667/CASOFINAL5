package HerramientaAnalisisNumerico;

public class SumatoriaListadoNumeros {

    public static int sumatoria(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumatoria(n - 1);
        }
    }

    public static void listarNumeros(int inicio, int fin) {
        if (inicio > fin) {
            return;
        } else {
            System.out.println(inicio);
            listarNumeros(inicio + 1, fin);
        }
    }
}