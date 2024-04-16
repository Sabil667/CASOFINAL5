import GestionInformacionCientifica.GestionFechas;
import HerramientaAnalisisNumerico.CalculoPotenciasYmaximos;
import HerramientaAnalisisNumerico.SumatoriaListadoNumeros;
import AnalisisGenomico.ConteoGenes;
import AnalisisGenomico.CalculoCombinacionesGeneticas;
import GestionInformacionCientifica.OrganizacionDocumentos;
import GestionInformacionCientifica.BusquedaTexto;
import OptimizacionDeProcesos.QuickSortOptimizado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import java.util.Arrays;

public class MAIN {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menú");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Crear un JComboBox con todas las opciones
        String[] opciones = {"Agregar fecha", "Listar fechas", "Calcular sumatoria", "Listar números", "Calcular potencia", "Encontrar máximo", "Contar genes", "Calcular combinaciones genéticas", "Ordenar Documentos", "Buscar Palabra", "Ordenar con QuickSort Optimizado"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        comboBox.setBounds(10, 130, 200, 25);  // Colocar en el medio de la interfaz de usuario
        panel.add(comboBox);

        // Agregar un ActionListener al JComboBox
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcionSeleccionada = (String) comboBox.getSelectedItem();
                switch (opcionSeleccionada) {
                    case "Agregar fecha":
                        GestionFechas gestionFechas = new GestionFechas();
                        String fecha = JOptionPane.showInputDialog("Introduce una fecha en el formato dd/MM/yyyy:");
                        gestionFechas.agregarFecha(fecha);
                        break;
                    case "Listar fechas":
                        GestionFechas gestionFechasListar = new GestionFechas();
                        List<String> fechasOrdenadas = gestionFechasListar.obtenerFechasOrdenadas();
                        JOptionPane.showMessageDialog(null, "Fechas ordenadas: " + fechasOrdenadas);
                        break;
                    case "Calcular sumatoria":
                        String input = JOptionPane.showInputDialog("Introduce un número para calcular la sumatoria:");
                        int n = Integer.parseInt(input);
                        int resultadoSumatoria = SumatoriaListadoNumeros.sumatoria(n);
                        JOptionPane.showMessageDialog(null, "El resultado de la sumatoria es: " + resultadoSumatoria);
                        break;
                    case "Listar números":
                        String inputInicio = JOptionPane.showInputDialog("Introduce el número de inicio:");
                        int inicio = Integer.parseInt(inputInicio);
                        String inputFin = JOptionPane.showInputDialog("Introduce el número de fin:");
                        int fin = Integer.parseInt(inputFin);
                        SumatoriaListadoNumeros.listarNumeros(inicio, fin);
                        break;
                    case "Calcular potencia":
                        int resultadoPotencia = CalculoPotenciasYmaximos.potencia();
                        JOptionPane.showMessageDialog(null, "Resultado Potencia: " + resultadoPotencia);
                        break;
                    case "Encontrar máximo":
                        String inputMaximo = JOptionPane.showInputDialog("Introduce los números separados por comas:");
                        String[] numerosString = inputMaximo.split(",");
                        int[] datos = new int[numerosString.length];
                        for (int i = 0; i < numerosString.length; i++) {
                            datos[i] = Integer.parseInt(numerosString[i]);
                        }
                        int resultadoMaximo = CalculoPotenciasYmaximos.encontrarMaximo(datos);
                        JOptionPane.showMessageDialog(null, "Resultado Máximo: " + resultadoMaximo);
                        break;
                    case "Contar genes":
                        String adn = JOptionPane.showInputDialog("Introduce una cadena de ADN:");
                        int conteoGenes = ConteoGenes.contarGenes(adn);
                        JOptionPane.showMessageDialog(null, "La cadena de ADN '" + adn + "' tiene " + conteoGenes + " genes.");
                        break;
                    case "Calcular combinaciones genéticas":
                        String inputGeneraciones = JOptionPane.showInputDialog("Introduce el número de generaciones:");
                        int generaciones = Integer.parseInt(inputGeneraciones);
                        int resultadoCombinaciones = CalculoCombinacionesGeneticas.calcularCombinaciones(generaciones);
                        JOptionPane.showMessageDialog(null, "El número de combinaciones genéticas para " + generaciones + " generaciones es: " + resultadoCombinaciones);
                        break;
                    case "Ordenar Documentos":
                        JFileChooser fileChooser = new JFileChooser();
                        int returnValue = fileChooser.showOpenDialog(null);
                        if (returnValue == JFileChooser.APPROVE_OPTION) {
                            File selectedFile = fileChooser.getSelectedFile();
                            OrganizacionDocumentos.ordenarDocumentos(selectedFile.getPath());
                        }
                        break;
                    case "Buscar Palabra":
                        JFileChooser fileChooserBuscar = new JFileChooser();
                        int returnValueBuscar = fileChooserBuscar.showOpenDialog(null);
                        if (returnValueBuscar == JFileChooser.APPROVE_OPTION) {
                            File selectedFile = fileChooserBuscar.getSelectedFile();
                            String palabraBusqueda = JOptionPane.showInputDialog("Introduce la palabra a buscar:");
                            BusquedaTexto buscador = new BusquedaTexto(selectedFile.getPath());
                            boolean encontradoLineal = buscador.busquedaLineal(palabraBusqueda);
                            boolean encontradoBinario = buscador.busquedaBinaria(palabraBusqueda);
                            JOptionPane.showMessageDialog(null, "Resultado de la búsqueda lineal: " + encontradoLineal + "\nResultado de la búsqueda binaria: " + encontradoBinario);
                        }
                        break;
                    case "Ordenar con QuickSort Optimizado":
                        int[] datosQuickSort = QuickSortOptimizado.generarArrayAleatorio();
                        QuickSortOptimizado.quicksort(datosQuickSort);
                        break;
                }
            }
        });
    }
}