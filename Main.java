import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Estudiante estudiante = new Estudiante("A-1024", "Lucía Fernández");

        System.out.println("=== Estado inicial ===");
        System.out.println(estudiante.obtenerInformacion());

        System.out.println("\n=== Notas válidas ===");
        estudiante.agregarNota(8);
        estudiante.agregarNota(6.5);
        estudiante.agregarNota(10);
        estudiante.agregarNota(0);   // límite inferior
        estudiante.agregarNota(7);

        System.out.println("\n=== Notas inválidas ===");
        estudiante.agregarNota(11);   // mayor a 10
        estudiante.agregarNota(-3);   // negativa
        estudiante.agregarNota(10.5); // fuera de rango

        System.out.println("\n=== Consulta de notas y promedio ===");
        System.out.println("Notas registradas: " + Arrays.toString(estudiante.getNotas()));
        System.out.println("Promedio final: " + String.format("%.2f", estudiante.calcularPromedio()));

        System.out.println("\n=== Intento de alterar las notas desde afuera ===");
        double[] copia = estudiante.getNotas();
        copia[0] = 10; // modifica solo la copia, no las notas reales
        System.out.println("Notas reales intactas: " + Arrays.toString(estudiante.getNotas()));

        System.out.println("\n=== Resultado final ===");
        System.out.println(estudiante.obtenerInformacion());


    }
}