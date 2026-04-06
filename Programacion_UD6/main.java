import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);
    
    //Array con 3 estudiantes cargados (fijo)
    static Estudiante[] estudiantesArray = new Estudiante[3];

    //Array de estudiantes (dinamico)
    static ArrayList<Estudiante> estudiantesList = new ArrayList<>();

    public static void main(String[] args) {
        
        int opcion;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Array");
            System.out.println("2. ArrayList");
            System.out.println("0. Cerrar");
            System.out.print("Opcion:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    menuArray();    
                    break;
                case 2:
                    menuArrayList();    
                    break;
            }

        } while (opcion != 0);
            System.out.println("Cerrado");           
        }
    
        //MENU ARRAY
        public static void agregarArray() {
            for (int i = 0; i < estudiantesArray.length; i++) {
                if (estudiantesArray[i] == null) {

                    System.err.println("Nombre: ");
                    String nombre = sc.nextLine();

                    System.err.println("Edad: ");
                    int edad = sc.nextInt();

                    System.err.println("Nota: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();
                    
                    estudiantesArray[i] = new Estudiante(nombre, edad, nota);
                    System.out.println("Se ha añadido el estudiante.");
                    return;
                }
            }
            System.out.println("Array Completo");
        }

        


        //MENU ARRAYLIST
    
}
