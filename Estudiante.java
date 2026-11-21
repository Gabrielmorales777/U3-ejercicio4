import java.util.Arrays;

public class Estudiante {


    private static final double NOTA_MINIMA = 0.0;
    private static final double NOTA_MAXIMA = 10.0;
    private static final int CAPACIDAD_NOTAS = 10;


    private final String legajo;
    private final String nombre;
    private final double[] notas;
    private int cantidadNotas;

    public Estudiante(String legajo, String nombre) {
        if (legajo == null || legajo.trim().isEmpty()) {
            throw new IllegalArgumentException("El legajo no puede estar vacío.");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.legajo = legajo;
        this.nombre = nombre;
        this.notas = new double[CAPACIDAD_NOTAS];
        this.cantidadNotas = 0;
    }

    // ---------- Getters ----------
    public String getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadNotas() {
        return cantidadNotas;
    }


    public double[] getNotas() {
        return Arrays.copyOf(notas, cantidadNotas);
    }

    public boolean agregarNota(double nota) {
        if (nota < NOTA_MINIMA || nota > NOTA_MAXIMA) {
            System.out.println("Error: la nota " + nota + " es inválida. Debe estar entre "
                    + NOTA_MINIMA + " y " + NOTA_MAXIMA + ".");
            return false;
        }
        if (cantidadNotas == CAPACIDAD_NOTAS) {
            System.out.println("Error: no se pueden registrar más de " + CAPACIDAD_NOTAS + " notas.");
            return false;
        }
        notas[cantidadNotas] = nota;
        cantidadNotas++;
        System.out.println("Nota " + nota + " registrada correctamente.");
        return true;
    }

    public double calcularPromedio() {
        if (cantidadNotas == 0) {
            return 0.0;
        }
        double suma = 0;
        for (int i = 0; i < cantidadNotas; i++) {
            suma += notas[i];
        }
        return suma / cantidadNotas;
    }

    public String obtenerInformacion() {
        return "Legajo: " + legajo + " | Alumno: " + nombre
                + " | Notas cargadas: " + cantidadNotas
                + " | Promedio: " + String.format("%.2f", calcularPromedio());
    }
}