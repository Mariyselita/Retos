// Clase que representa una factura con un folio, un cliente y un total
public class Factura {

    // Atributos privados de la clase: identificador único (folio), nombre del cliente y el total de la factura
    private String folio;
    private String cliente;
    private double total;

    /**
     * Constructor que inicializa una nueva instancia de Factura
     * @param folio Identificador único de la factura
     * @param cliente Nombre del cliente asociado a la factura
     * @param total Monto total de la factura
     */
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    /**
     * Método toString sobrescrito que devuelve una representación legible de la factura,
     * útil para imprimir su contenido directamente.
     */
    @Override
    public String toString() {
        return "Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    /**
     * Método equals sobrescrito para comparar si dos objetos Factura son iguales.
     * Se considera que dos facturas son iguales si tienen el mismo folio,
     * sin importar el cliente o el total.
     *
     * @param obj El objeto a comparar con la instancia actual
     * @return true si los folios son iguales; false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Son el mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false; // Diferente tipo u objeto nulo

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio); // Comparación basada únicamente en el folio
    }

    /**
     * Método hashCode sobrescrito para que sea consistente con equals.
     * Se genera el hash code únicamente a partir del folio,
     * ya que equals también compara por folio.
     *
     * @return Código hash basado en el folio
     */
    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}
