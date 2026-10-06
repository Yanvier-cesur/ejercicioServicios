package Ejercicio1;

import java.util.concurrent.atomic.AtomicInteger;

public class hilo implements Runnable {
    private char caracter;
    private int veces;
    private AtomicInteger contadorHilo;

    public hilo(char caracter, int veces, AtomicInteger contadorHilo) {
        this.caracter = caracter;
        this.veces = veces;
        this.contadorHilo = contadorHilo;
    }

    @Override
    public void run() {
        for (int i = 0; i < veces;i++) {
            System.out.println(caracter);
        }
        contadorHilo.incrementAndGet();
    }
}