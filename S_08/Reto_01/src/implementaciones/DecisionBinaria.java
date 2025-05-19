package implementaciones;

import interfaces.LogicaDecision;
import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public boolean tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Quieres ayudar al anciano? (sí/no): ");
        String input = scanner.nextLine().toLowerCase();
        return input.equals("sí");
    }
}