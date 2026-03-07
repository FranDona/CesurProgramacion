import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Dos {

    public static void main(String[] args) {

        String rutaArchivo = "C:/EjerciciosStreams/docuA.txt";
        File archivo = new File(rutaArchivo);

        if (archivo.exists()) {

            try (FileWriter writer = new FileWriter(archivo)) {

                for (int i = 0; i <= 10; i++) {
                    writer.write(i + "\n");
                }

                System.out.println("Números escritos correctamente en docuA.txt");

            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo.");
                e.printStackTrace();
            }

        } else {
            System.out.println("El archivo docuA.txt no existe.");
        }
    }
}