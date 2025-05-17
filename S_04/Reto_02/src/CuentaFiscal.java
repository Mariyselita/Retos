import java.util.Objects;

/**
 * Clase que representa una cuenta fiscal vinculada a un RFC con un saldo disponible.
 */
public class CuentaFiscal {

    private final String rfc; // El RFC no cambia después de la creación de la cuenta
    private double saldoDisponible; // Saldo actual en la cuenta fiscal

    /**
     * Constructor que inicializa una cuenta fiscal con su RFC y saldo disponible.
     * Si el saldo ingresado es negativo, se asigna 0 por defecto.
     *
     * @param rfc             Clave del Registro Federal de Contribuyentes
     * @param saldoDisponible Monto inicial del saldo disponible
     */
    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;

        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("El saldo no puede ser negativo. Se asigna 0.");
            this.saldoDisponible = 0;
        }
    }

    /**
     * Obtiene el RFC de la cuenta fiscal.
     *
     * @return RFC como cadena de texto
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Obtiene el saldo disponible de la cuenta fiscal.
     *
     * @return saldo actual
     */
    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    /**
     * Valida si el RFC de una declaración de impuestos coincide con el RFC de esta cuenta.
     *
     * @param d Declaración de impuestos a comparar
     * @return true si los RFC coinciden, false en caso contrario
     */
    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    /**
     * Imprime en consola la información básica de la cuenta fiscal.
     */
    public void mostrarCuenta() {
        System.out.printf("Cuenta fiscal registrada con RFC: %s, saldo disponible: $%.2f%n", rfc, saldoDisponible);
    }

    /**
     * Método opcional para debitar saldo (por si se necesita en un flujo real).
     * Valida que haya fondos suficientes.
     *
     * @param monto Monto a debitar
     * @return true si se realizó el débito, false si no fue posible
     */
    public boolean debitar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto debe ser mayor a 0.");
            return false;
        }

        if (monto > saldoDisponible) {
            System.out.println("Saldo insuficiente.");
            return false;
        }

        saldoDisponible -= monto;
        return true;
    }

    /**
     * Método opcional para acreditar saldo (por si se desea incrementar el saldo).
     *
     * @param monto Monto a acreditar
     * @return true si fue exitoso
     */
    public boolean acreditar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto debe ser mayor a 0.");
            return false;
        }

        saldoDisponible += monto;
        return true;
    }
}
