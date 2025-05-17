/**
 * Clase principal que simula una caja registradora con múltiples métodos de pago.
 * Se aplica el uso de polimorfismo, composición y autenticación dinámica.
 */
public class CajaRegistradora {
    public static void main(String[] args) {

        // Arreglo de métodos de pago, usando polimorfismo (todos heredan de MetodoPago)
        MetodoPago[] pagos = {
                new PagoEfectivo(1200.0),                     // No requiere autenticación
                new PagoTarjeta(40.0, 600.0),                 // Autenticación depende del límite disponible
                new PagoTransferencia(20.0, false)            // Esta fallará porque no está autenticada
        };

        // Iteramos sobre cada método de pago
        for (MetodoPago pago : pagos) {

            // Validamos si el método de pago pasa la autenticación
            if (pago.autenticar()) {
                System.out.println("Autenticación exitosa.");

                // Procesamos el pago
                pago.procesarPago();

                // Mostramos un resumen del pago realizado
                pago.mostrarResumen();
            } else {
                // Si falla la autenticación, mostramos un mensaje específico
                System.out.println("Fallo de autenticación. " +
                        pago.getClass().getSimpleName() + " no válido.");
            }

            // Línea en blanco para separar pagos visualmente
            System.out.println();
        }
    }
}
