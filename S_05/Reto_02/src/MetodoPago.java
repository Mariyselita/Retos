/**
 * Clase abstracta que representa un método de pago genérico.
 * Implementa la interfaz {@code Autenticable}, lo cual implica
 * que todo método de pago debe poder autenticarse de alguna forma.
 */
public abstract class MetodoPago implements Autenticable {

    /**
     * Monto asociado al pago.
     */
    protected double monto;

    /**
     * Constructor que inicializa el método de pago con un monto dado.
     *
     * @param monto el monto a pagar
     */
    public MetodoPago(double monto) {
        this.monto = monto;
    }

    /**
     * Método abstracto que debe ser implementado por todas las subclases.
     * Su propósito es ejecutar el proceso específico del pago.
     */
    public abstract void procesarPago();

    /**
     * Método concreto que muestra un resumen básico del pago.
     * Imprime el tipo de clase (nombre del método de pago) y el monto.
     */
    public void mostrarResumen() {
        System.out.println("Tipo: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
    }
}
