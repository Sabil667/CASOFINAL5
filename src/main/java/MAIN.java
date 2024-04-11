import HerramientaAnalisisNumerico.CalculoPotenciasYmaximos;
import HerramientaAnalisisNumerico.SumatoriaListadoNumeros;

public class MAIN {
    public static void main(String[] args) {
        // Prueba de la función sumatoria
        int resultadoSumatoria = SumatoriaListadoNumeros.sumatoria(5);
        System.out.println("El resultado de la sumatoria es: " + resultadoSumatoria);

        // Prueba de la función listarNumeros
        System.out.println("Listado de números:");
        SumatoriaListadoNumeros.listarNumeros(1, 5);

            int resultadoPotencia = CalculoPotenciasYmaximos.potencia();
            System.out.println("Resultado Potencia: " + resultadoPotencia);

            // Ejemplo de uso de la función encontrarMaximo
            int[] datos = {1, 2, 3, 4, 5};
            int resultadoMaximo = CalculoPotenciasYmaximos.encontrarMaximo(datos);

            System.out.println("\nDatos:1, 2, 3, 4, 5");
            System.out.println("Resultado Máximo: " + resultadoMaximo);


    }
    }
