import HerramientaAnalisisNumerico.CalculoPotenciasYmaximos;
import HerramientaAnalisisNumerico.SumatoriaListadoNumeros;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // Prueba de la función sumatoria
        int resultadoSumatoria = SumatoriaListadoNumeros.sumatoria(5);
        System.out.println("El resultado de la sumatoria es: " + resultadoSumatoria);

        // Prueba de la función listarNumeros
        System.out.println("Listado de números:");
        SumatoriaListadoNumeros.listarNumeros(1, 5);

            // Ejemplo de uso de la función potencia
        System.out.println("Ingrese la base: ");
        int base = scanner.nextInt();
        System.out.println("Ingrese el exponente: ");
        int exponente = scanner.nextInt();


            int resultadoPotencia = CalculoPotenciasYmaximos.potencia(base, exponente);
            System.out.println("Resultado Potencia: " + resultadoPotencia);

            // Ejemplo de uso de la función encontrarMaximo
            int[] datos = {1, 2, 3, 4, 5};
            int resultadoMaximo = CalculoPotenciasYmaximos.encontrarMaximo(datos);
            System.out.println("Resultado Máximo: " + resultadoMaximo);
        }
    }
