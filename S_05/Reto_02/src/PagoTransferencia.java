/**
 * Clase que representa un pago mediante transferencia bancaria.
 * Extiende de {@link MetodoPago} e implementa el proceso de autenticación y pago.
 * Este tipo de pago requiere validación externa para autenticar correctamente.
 */
public class PagoTransferencia extends MetodoPago {

    /**
     * Indica si el pago ha sido validado externamente (por ejemplo, por una API bancaria).
     * Solo si es verdadero, la autenticación será exitosa.
     */
    private boolean validadoExternamente;

    /**
     * Constructor para inicializar el pago por transferencia.
     *
     * @param monto                 Monto del pago
     * @param validadoExternamente Valor booleano que indica si el pago ya fue validado por un sistema externo
     */
    public PagoTransferencia(double monto, boolean validadoExternamente) {
        super(monto); // Llama al constructor de MetodoPago
        this.validadoExternamente = validadoExternamente;
    }

    /**
     * Implementación del método de autenticación.
     * Retorna true si el pago ha sido validado externamente.
     *
     * @return true si el pago está validado, false si no
     */
    @Override
    public boolean autenticar() {
        return validadoExternamente;
    }

    /**
     * Procesa el pago por transferencia, imprimiendo un mensaje con el monto.
     */
    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia por $" + monto);
    }
}
