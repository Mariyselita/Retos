/**
 * Clase principal que simula el envío y validación de una declaración de impuestos
 * frente a una cuenta fiscal existente.
 */
public class Main {
    public static void main(String[] args) {

        // Crear una instancia de declaración de impuestos con RFC y monto declarado
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("PLACEB646464654", 7500.00);

        // Crear una instancia de cuenta fiscal con RFC y saldo disponible
        CuentaFiscal cuenta = new CuentaFiscal("LEIREM010101000", 7500.0);

        // Mostrar la información de la declaración
        System.out.printf("Declaración enviada por RFC: %s por $%.2f%n",
                declaracion.rfcContribuyente(), declaracion.montoDeclarado());

        // Mostrar la información de la cuenta fiscal
        cuenta.mostrarCuenta();

        // Validar si el RFC de la declaración coincide con el de la cuenta fiscal
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC válido para esta cuenta?: " + (rfcValido ? "Sí" : "No"));
    }
}
