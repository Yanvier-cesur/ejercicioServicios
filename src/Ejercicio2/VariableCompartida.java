package Ejercicio2;

public class VariableCompartida {
    private int v;

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public synchronized void inc(){
        v++;
    }
}
