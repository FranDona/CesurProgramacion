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



        //MENU ARRAYLIST
    
}
