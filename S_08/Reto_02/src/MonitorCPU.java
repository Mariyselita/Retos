import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MonitorCPU {

    public static void main(String[] args) {
        Scanner scanner = null;
        HashSet<Integer> registrosCPU = new HashSet<>();
        final int UMBRAL_CRITICO = 95;

        try {
            scanner = new Scanner(System.in);
            System.out.print("¿Cuántos servidores quieres monitorear? ");
            int numServidores = scanner.nextInt();

            for (int i = 1; i <= numServidores; i++) {
                try {
                    System.out.print("Ingresa el consumo de CPU del servidor #" + i + " (0-100): ");
                    String entrada = scanner.next();

                    // Validación numérica
                    int consumo = Integer.parseInt(entrada);

                    // Validación de rango
                    if (consumo < 0 || consumo > 100) {
                        System.out.println("Error: El valor debe estar entre 0 y 100.");
                        i--; // repetir este ciclo
                        continue;
                    }

                    // Validación de duplicados
                    if (!registrosCPU.add(consumo)) {
                        System.out.println("Duplicado detectado. Este valor ya fue ingresado.");
                        i--; // repetir este ciclo
                        continue;
                    }

                    // Validación de umbral crítico
                    if (consumo > UMBRAL_CRITICO) {
                        throw new ConsumoCriticoException("Consumo crítico detectado en el servidor #" + i + ": " + consumo + "%");
                    }

                    System.out.println("Registro exitoso: " + consumo + "%");

                } catch (NumberFormatException e) {
                    System.out.println("Error: Solo se permiten valores numéricos enteros.");
                    i--; // repetir este ciclo
                } catch (ConsumoCriticoException e) {
                    System.out.println("EXCEPCIÓN: " + e.getMessage());
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero.");
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("Recurso cerrado correctamente.");
            }
        }

        System.out.println("Registros finales de consumo CPU: " + registrosCPU);
    }
}
