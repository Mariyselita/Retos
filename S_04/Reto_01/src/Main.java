public class Main {
    public static void main(String[] args) {

        Factura f1 = new Factura("FAC001", "Andy", 10450.00);
        Factura f2 = new Factura("FAC001", "Restaurante La Perla", 450.00);

        System.out.println(f1);
        System.out.println(f2);

        // ¿Son iguales? equals()
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}
