import java.io.File;
import java.io.IOException;

public class Uno {
    
    public static void main(String[] args) {

        String ruta = "C:/EjerciciosStreams";
        File directorio = new File(ruta);

        // Codigo para crear el directorio
        if (!directorio.exists()) {
            if (directorio.mkdir()) {
                System.out.println("Directorio creado correctamente.");
            } else {   
                System.out.println("Error al crear el directorio.");
                return;
            }
        } else {
            System.out.println("El directorio ya existe.");
        }

        try {
            // Crear archivos
            File archivoA = new File(ruta + "/docuA.txt");
            File archivoB = new File(ruta + "/docuB.txt");
            File archivoC = new File(ruta + "/docuC.txt");

            archivoA.createNewFile();
            archivoB.createNewFile();
            archivoC.createNewFile();

            System.out.println("Archivos creados correctamente (si no existían).");

        } catch (IOException e) {
            System.out.println("Error al crear los archivos.");
            e.printStackTrace();
        }
    }
}