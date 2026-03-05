import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Cinco {

    public static void main(String[] args) {

        String rutaEntrada = "C:/EjerciciosStreams/datos.txt";
        String rutaSalida = "C:/EjerciciosStreams/datosAleatorio.dat";

        try (
            BufferedReader br = new BufferedReader(new FileReader(rutaEntrada));
            RandomAccessFile raf = new RandomAccessFile(rutaSalida, "rw")
        ) {

            String linea;

            while ((linea = br.readLine()) != null) {
                raf.writeUTF(linea);
            }

            System.out.println("Archivo de acceso aleatorio generado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al generar el archivo de acceso aleatorio.");
            e.printStackTrace();
        }
    }
}