package Ejercicio2;

public class hilo extends Thread {
    private VariableCompartida variable;

    public hilo(VariableCompartida variable) {
        this.variable = variable;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            variable.inc();
        }
    }
}