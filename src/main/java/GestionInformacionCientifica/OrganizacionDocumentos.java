package GestionInformacionCientifica;

import java.io.*;
import java.util.*;

public class OrganizacionDocumentos {
    public static void ordenarDocumentos(String rutaArchivo) {
        List<String> lineas = new ArrayList<>();
        try {
            File archivo = new File(rutaArchivo);
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                lineas.add(lector.nextLine());
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }

        Collections.sort(lineas);

        try {
            FileWriter escritor = new FileWriter("ruta_del_archivo_ordenado.txt"); // Reemplaza con la ruta donde quieres guardar el archivo ordenado
            for (String linea : lineas) {
                escritor.write(linea + "\n");
            }
            escritor.close();
            System.out.println("El archivo ha sido ordenado alfabéticamente y guardado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}