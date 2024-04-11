import HerramientaAnalisisNumerico.CalculoPotenciasYmaximos;
import HerramientaAnalisisNumerico.SumatoriaListadoNumeros;
import AnalisisGenomico.ConteoGenes;
import AnalisisGenomico.CalculoCombinacionesGeneticas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        JButton sumatoriaButton = new JButton("Calcular sumatoria");
        sumatoriaButton.setBounds(10, 10, 160, 25);
        sumatoriaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Introduce un número para calcular la sumatoria:");
                int n = Integer.parseInt(input);
                int resultadoSumatoria = SumatoriaListadoNumeros.sumatoria(n);
                JOptionPane.showMessageDialog(null, "El resultado de la sumatoria es: " + resultadoSumatoria);
            }
        });
        panel.add(sumatoriaButton);

        JButton listarNumerosButton = new JButton("Listar números");
        listarNumerosButton.setBounds(10, 50, 160, 25);
        listarNumerosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputInicio = JOptionPane.showInputDialog("Introduce el número de inicio:");
                int inicio = Integer.parseInt(inputInicio);
                String inputFin = JOptionPane.showInputDialog("Introduce el número de fin:");
                int fin = Integer.parseInt(inputFin);
                SumatoriaListadoNumeros.listarNumeros(inicio, fin);
            }
        });
        panel.add(listarNumerosButton);

        JButton potenciaButton = new JButton("Calcular potencia");
        potenciaButton.setBounds(10, 90, 160, 25);
        potenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resultadoPotencia = CalculoPotenciasYmaximos.potencia();
                JOptionPane.showMessageDialog(null, "Resultado Potencia: " + resultadoPotencia);
            }
        });
        panel.add(potenciaButton);

        JButton maximoButton = new JButton("Encontrar máximo");
        maximoButton.setBounds(10, 130, 160, 25);
        maximoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] datos = {1, 2, 3, 4, 5}; // Aquí puedes cambiar los datos según tus necesidades
                int resultadoMaximo = CalculoPotenciasYmaximos.encontrarMaximo(datos);
                JOptionPane.showMessageDialog(null, "Resultado Máximo: " + resultadoMaximo);
            }
        });
        panel.add(maximoButton);

        JButton genesButton = new JButton("Contar genes");
        genesButton.setBounds(10, 170, 160, 25);
        genesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String adn = JOptionPane.showInputDialog("Introduce una cadena de ADN:");
                int conteoGenes = ConteoGenes.contarGenes(adn);
                JOptionPane.showMessageDialog(null, "La cadena de ADN '" + adn + "' tiene " + conteoGenes + " genes.");
            }
        });
        panel.add(genesButton);

        JButton combinacionesButton = new JButton("Calcular combinaciones genéticas");
        combinacionesButton.setBounds(10, 210, 250, 25);
        combinacionesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Introduce el número de generaciones:");
                int generaciones = Integer.parseInt(input);
                int resultadoCombinaciones = CalculoCombinacionesGeneticas.calcularCombinaciones(generaciones);
                JOptionPane.showMessageDialog(null, "El número de combinaciones genéticas para " + generaciones + " generaciones es: " + resultadoCombinaciones);
            }
        });
        panel.add(combinacionesButton);
    }
}