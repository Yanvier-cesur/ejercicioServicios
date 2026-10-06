package Ejercicio1;

import java.util.concurrent.atomic.AtomicInteger;

public class main {
    static void main() {
        AtomicInteger contadorGlobal = new AtomicInteger(0);

        Thread h1 = new Thread(new hilo('A',15,contadorGlobal));
        Thread h2 = new Thread(new hilo('B',15,contadorGlobal));
        Thread h3 = new Thread(new hilo('C',15,contadorGlobal));

        h1.start();
        h2.start();
        h3.start();

    }
}
