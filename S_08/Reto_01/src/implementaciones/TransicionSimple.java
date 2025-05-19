package implementaciones;

import interfaces.TransicionHistoria;

public class TransicionSimple implements TransicionHistoria {
    @Override
    public void avanzarEscena(boolean decision) {
        if (decision) {
            System.out.println("Transición: Ayudaste al anciano y descubriste un mapa secreto.");
        } else {
            System.out.println("Transición: Ignoraste al anciano y continuaste solo por el bosque oscuro.");
        }
    }
}