import implementaciones.DecisionBinaria;
import implementaciones.DialogoTexto;
import implementaciones.TransicionSimple;
import interfaces.*;

public class Main {

    private final GestorDialogo gestorDialogo;
    private final LogicaDecision logicaDecision;
    private final TransicionHistoria transicionHistoria;

    // Inyección de dependencias
    public Main(GestorDialogo gestorDialogo, LogicaDecision logicaDecision, TransicionHistoria transicionHistoria) {
        this.gestorDialogo = gestorDialogo;
        this.logicaDecision = logicaDecision;
        this.transicionHistoria = transicionHistoria;
    }

    public void iniciarEscena() {
        gestorDialogo.mostrarDialogo("Te encuentras con un anciano herido en el camino...");
        boolean decision = logicaDecision.tomarDecision();
        transicionHistoria.avanzarEscena(decision);
    }

    public static void main(String[] args) {
        // Inyectamos implementaciones concretas
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();
        TransicionHistoria transicion = new TransicionSimple();

        Main narrativa = new Main(dialogo, decision, transicion);
        narrativa.iniciarEscena();
    }
}
