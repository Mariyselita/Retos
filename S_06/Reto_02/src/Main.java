import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Representa un tema educativo con un título y una prioridad (1 = urgente).
 */
class Tema implements Comparable<Tema> {
    private final String titulo;
    private final int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo); // Orden alfabético
    }

    @Override
    public String toString() {
        return "📘 Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}

/**
 * Clase principal que gestiona la planeación educativa.
 */
public class Main {

    public static void main(String[] args) {

        // Lista concurrente de temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>(List.of(
                new Tema("Lectura comprensiva", 2),
                new Tema("Matemáticas básicas", 1),
                new Tema("Cuidado del medio ambiente", 3)
        ));

        // Mostrar en orden alfabético
        Collections.sort(temas);
        System.out.println(" Temas ordenados alfabéticamente:");
        mostrarTemas(temas);

        // Ordenar por prioridad ascendente (más urgente primero)
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        System.out.println("\n Temas ordenados por prioridad (1 = urgente):");
        mostrarTemas(temas);

        // Repositorio de recursos compartidos concurrente
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

        System.out.println("\n Repositorio de recursos digitales:");
        mostrarRecursos(recursos);
    }

    /**
     * Muestra una lista de temas por consola.
     */
    private static void mostrarTemas(List<Tema> temas) {
        for (Tema tema : temas) {
            System.out.println(tema);
        }
    }

    /**
     * Muestra el repositorio de recursos compartidos.
     */
    private static void mostrarRecursos(ConcurrentHashMap<String, String> recursos) {
        recursos.forEach((tema, enlace) -> System.out.printf("🔗 %s → %s%n", tema, enlace));
    }
}
