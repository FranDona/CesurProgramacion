public class Estudiante {
    private String nombre;
    private int edad;
    private double nota;

    //Constructor
    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;   
        this.nota = nota;
    }

   //Getters
    public String getNombre() {
        return nombre;
    }    

    public int getEdad() {
        return edad;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Nota: " + nota;
    }
}
