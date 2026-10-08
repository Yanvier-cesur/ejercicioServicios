package Ejercicio2;

public class main {
    public static void main(String[] args) {

        VariableCompartida compartido = new VariableCompartida();

        hilo h1 = new hilo(compartido);
        hilo h2 = new hilo(compartido);

        h1.start();
        h2.start();

        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El valor final de v es: " + compartido.getV());
    }
}