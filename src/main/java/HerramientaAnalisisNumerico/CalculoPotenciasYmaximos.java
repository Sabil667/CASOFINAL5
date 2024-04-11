package HerramientaAnalisisNumerico;

public class CalculoPotenciasYmaximos {

    public static int potencia(int base, int exponente) {
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