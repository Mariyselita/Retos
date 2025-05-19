package implementaciones;

import interfaces.GestorDialogo;

public class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(String texto) {
        System.out.println("Diálogo: " + texto);
    }
}