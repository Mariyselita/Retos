package hospital;

public class Paciente {
    String Nombre_paciente;
    int Edad_paciente;
    String Numero_Expediente;

    public void mostrarInformación(){
        System.out.println(" Información del paciente: ");
        System.out.println(" Paciente: " + Nombre_paciente );
        System.out.println(" Edad: " + Edad_paciente);
        System.out.println(" Número expediente: " + Numero_Expediente );

    }
}
