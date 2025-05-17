public class Main {
    public static void main(String[] args) {
        // Factura con RFC
        Factura facturaConRFC = new Factura(850.0, "Servicio de consultoría", "AOIUYZ00222");
        // Factura sin RFC
        Factura facturaSinRFC = new Factura(140000.0, "Reparación de equipo", null);

        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}