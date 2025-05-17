package hospital;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Paciente p1 = new Paciente();
        System.out.print("Nombre del paciente: ");
        p1.Nombre_paciente  = input.nextLine();

        System.out.print("Ingresa edad del paciente: ");
        p1.Edad_paciente = input.nextInt();
        input.nextLine();

        System.out.print("Ingresar número del expediente del paciente: ");
        p1.Numero_Expediente = input.nextLine();

        input.close();

        p1.mostrarInformación();
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Paciente paciente1 = new Paciente();
//        paciente1.Nombre_paciente = "Lena Marie";
//        paciente1.Edad_paciente = 25;
//        paciente1.Numero_Expediente = "EXP202409";
//    }
//}


