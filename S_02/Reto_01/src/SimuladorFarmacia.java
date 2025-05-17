import java.util.Arrays;
import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del medicamento");
        String medicamento = scanner.nextLine();

        System.out.println("Precio unitario");
        double precioUnitario = scanner.nextDouble();
        System.out.println("Cantidad");
        int cantidad = scanner.nextInt();

        //Calcular total
        double totalSinDescuento = precioUnitario * cantidad;
        var aplicaDescuento = totalSinDescuento > 500;
        double descuento = aplicaDescuento ? totalSinDescuento * .15 : 0;

        // Total a pagar
        double totalconDescuento = totalSinDescuento - descuento;

        System.out.println("\nResumen de compra");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: " + totalSinDescuento );
        System.out.println("¿Aplica descuento?" +  aplicaDescuento);
        System.out.println("Descuento" + descuento);
        System.out.println("Total a pagar" + totalconDescuento);

        scanner.close();

    }
}
