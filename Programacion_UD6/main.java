import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);

    // Array fijo para 3 estudiantes
    static Estudiante[] estudiantesArray = new Estudiante[3];

    // ArrayList dinámico
    static ArrayList<Estudiante> estudiantesList = new ArrayList<>();

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("1. Usar Array");
            System.out.println("2. Usar ArrayList");
            System.out.println("0. Cerrar");
            System.out.print("Opción: ");
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

        System.out.println("Programa cerrado.");
    }

    // MENÚ ARRAY
    public static void menuArray() {
        int opcion;

        do {
            System.out.println("\nSUBMENÚ ARRAY");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agregarArray();
                    break;
                case 2:
                    mostrarArray();
                    break;
            }

        } while (opcion != 0);
    }

    public static void agregarArray() {
        for (int i = 0; i < estudiantesArray.length; i++) {
            if (estudiantesArray[i] == null) {

                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Edad: ");
                int edad = sc.nextInt();

                System.out.print("Nota: ");
                double nota = sc.nextDouble();
                sc.nextLine();

                estudiantesArray[i] = new Estudiante(nombre, edad, nota);
                System.out.println("Estudiante añadido.");
                return;
            }
        }
        System.out.println("Array lleno.");
    }

    public static void mostrarArray() {
        for (Estudiante e : estudiantesArray) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    // MENÚ ARRAYLIST
    public static void menuArrayList() {
        int opcion;

        do {
            System.out.println("\nSUBMENÚ ARRAYLIST");
            System.out.println("1. Añadir estudiante");
            System.out.println("2. Ver estudiantes");
            System.out.println("3. Borrar estudiante");
            System.out.println("4. Buscar estudiante");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agregarList();
                    break;
                case 2:
                    mostrarList();
                    break;
                case 3:
                    eliminarList();
                    break;
                case 4:
                    buscarList();
                    break;
            }

        } while (opcion != 0);
    }

    public static void agregarList() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Nota: ");
        double nota = sc.nextDouble();
        sc.nextLine();

        estudiantesList.add(new Estudiante(nombre, edad, nota));
        System.out.println("Estudiante añadido.");
    }

    public static void mostrarList() {
        for (Estudiante e : estudiantesList) {
            System.out.println(e);
        }
    }

    public static void eliminarList() {
        System.out.print("Nombre a eliminar: ");
        String nombre = sc.nextLine();

        for (Estudiante e : estudiantesList) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                estudiantesList.remove(e);
                System.out.println("Estudiante borrado.");
                return;
            }
        }
        System.out.println("No se encuentra.");
    }

    public static void buscarList() {
        System.out.print("Nombre a buscar: ");
        String nombre = sc.nextLine();

        for (Estudiante e : estudiantesList) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Encontrado: " + e);
                return;
            }
        }
        System.out.println("No se encuentra.");
    }
}