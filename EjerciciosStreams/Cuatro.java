import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cuatro {

    public static void main(String[] args) {

        String ruta = "C:/EjerciciosStreams/datos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;

            System.out.println("Contenido del directorio telefónico:\n");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo datos.txt");
            e.printStackTrace();
        }
    }
}