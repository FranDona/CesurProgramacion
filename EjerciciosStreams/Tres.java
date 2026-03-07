import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base del triángulo: ");
        double base = sc.nextDouble();

        System.out.print("Introduce la altura del triángulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        try (FileWriter writer = new FileWriter("C:/EjerciciosStreams/docuB.txt")) {

            writer.write("Base: " + base + "\n");
            writer.write("Altura: " + altura + "\n");
            writer.write("Área del triángulo: " + area);

            System.out.println("Área guardada correctamente en docuB.txt");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }

        sc.close();
    }
}