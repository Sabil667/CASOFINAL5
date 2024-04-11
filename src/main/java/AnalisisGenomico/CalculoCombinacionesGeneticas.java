package AnalisisGenomico;

public class CalculoCombinacionesGeneticas {

    public static int calcularCombinaciones(int generaciones) {
        if (generaciones == 0) {
            return 1;
        } else {
            return 3 * calcularCombinaciones(generaciones - 1);
        }
    }
}