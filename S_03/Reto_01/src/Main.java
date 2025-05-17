public class Main {
    public static void main(String[] args) {
        Pasajero pasajero = new Pasajero("Ana Martínez", "P123456");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("Reserva realizada con éxito");
        } else {
            System.out.println("No se pudo realizar la reserva");
        }

        System.out.println(vuelo.obtenerItinerario());
        System.out.println("Cancelando...........");
        vuelo.cancelarReserva();
        System.out.println(vuelo.obtenerItinerario());
        vuelo.reservarAsiento("Mario Gonzalez", "P987654");
        System.out.println(vuelo.obtenerItinerario());
    }
}