public class Main {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Concierto de Leire", 2000.00);
        Entrada entrada2 = new Entrada("Concierto de Placebo", 4000.00);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        //Reto adicional
        Entrada_Record entrada3=  new Entrada_Record( "Concierto de Blackpink",  30000.00);
        entrada3.mostrarInformacion();

    }
}