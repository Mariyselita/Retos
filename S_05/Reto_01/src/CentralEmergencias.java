public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Lisa");
        Patrulla patrulla = new Patrulla("Patrulla", "Jisoo");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Rosé");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}
