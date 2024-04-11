import HerramientaAnalisisNumerico.SumatoriaListadoNumeros;

public class MAIN {
    public static void main(String[] args) {
        // Prueba de la función sumatoria
        int resultadoSumatoria = SumatoriaListadoNumeros.sumatoria(5);
        System.out.println("El resultado de la sumatoria es: " + resultadoSumatoria);

        // Prueba de la función listarNumeros
        System.out.println("Listado de números:");
        SumatoriaListadoNumeros.listarNumeros(1, 5);
    }

}