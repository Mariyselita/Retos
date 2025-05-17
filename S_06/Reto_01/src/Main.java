import java.util.*;

/**
 * 🐠 Sistema de registro y consulta de muestras de especies marinas recolectadas por biólogos marinos.
 * Utiliza ArrayList, HashSet y HashMap para organizar datos científicos de forma modular y clara.
 */

public class Main {

    public static void main(String[] args) {
        // Paso 1: Registrar especies marinas en orden de recolección
        List<String> especiesRecolectadas = registrarEspecies();

        // Paso 2: Mostrar especies en orden de llegada
        mostrarEspeciesOrden(especiesRecolectadas);

        // Paso 3: Mostrar especies únicas encontradas
        mostrarEspeciesUnicas(especiesRecolectadas);

        // Paso 4: Asociar cada muestra con un biólogo marino responsable
        Map<String, String> asignaciones = asignarMuestrasABiologos();

        // Paso 5: Mostrar las asignaciones ID → biólogo
        mostrarAsignaciones(asignaciones);

        // Paso 6: Buscar biólogo por ID de muestra
        buscarBiologo(asignaciones, "M-004"); // Puedes cambiar el ID si deseas
    }

    // Paso 1: Lista con el orden de recolección de especies marinas (pueden repetirse)
    private static List<String> registrarEspecies() {
        return new ArrayList<>(List.of(
                "Delphinus delphis",         // Delfín común
                "Octopus vulgaris",          // Pulpo común
                "Chelonia mydas",            // Tortuga verde
                "Delphinus delphis"          // Repetido
        ));
    }

    // Paso 2: Mostrar especies marinas recolectadas en orden
    private static void mostrarEspeciesOrden(List<String> especies) {
        System.out.println("📋 Especies marinas recolectadas en orden:");
        for (int i = 0; i < especies.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, especies.get(i));
        }
    }

    // Paso 3: Mostrar especies únicas (sin repeticiones)
    private static void mostrarEspeciesUnicas(List<String> especies) {
        Set<String> unicas = new HashSet<>(especies);
        System.out.println("\n🌊 Especies únicas registradas:");
        for (String especie : unicas) {
            System.out.println("- " + especie);
        }
    }

    // Paso 4: Asignar IDs de muestra a biólogos marinos responsables
    private static Map<String, String> asignarMuestrasABiologos() {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("M-001", "Dra. Sandra");
        mapa.put("M-002", "Dr. Fernanda");
        mapa.put("M-003", "Dra. María de la Luz");
        mapa.put("M-004", "Dra. Andybunny");
        mapa.put("M-005", "Dra. Aby");
        mapa.put("M-006", "Dra. Estela");
        mapa.put("M-007", "Dra. Nancy");
        mapa.put("M-008", "Dra. Aida");
        mapa.put("M-009", "Dra. Lety");
        mapa.put("M-010", "Dra. Paula Ushio");
        return mapa;
    }

    // Paso 5: Mostrar las asignaciones de ID → biólogo marino
    private static void mostrarAsignaciones(Map<String, String> asignaciones) {
        System.out.println("\n👩‍🔬 Asignación de muestras a biólogos marinos:");
        for (Map.Entry<String, String> entry : asignaciones.entrySet()) {
            System.out.printf("%s → %s%n", entry.getKey(), entry.getValue());
        }
    }

    // Paso 6: Buscar biólogo responsable de una muestra específica
    private static void buscarBiologo(Map<String, String> asignaciones, String idMuestra) {
        String responsable = asignaciones.get(idMuestra);
        if (responsable != null) {
            System.out.printf("%n🔍 Doctora responsable de la muestra %s: %s%n", idMuestra, responsable);
        } else {
            System.out.printf("%n⚠️ No se encontró responsable para la muestra %s.%n", idMuestra);
        }
    }
}
