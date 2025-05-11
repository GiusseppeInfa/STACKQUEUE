package Ejercicio2;
import Actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        // Prueba con una cola de enteros
        QueueArray<Integer> intQueue = new QueueArray<>(5); // Tamaño máximo de la cola = 5
        System.out.println("Prueba con una cola de Enteros:");

        // Encolar elementos
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);
        intQueue.enqueue(40);
        intQueue.enqueue(50);
        
        System.out.println("Contenido de la cola: " + intQueue.toString());

        try {
            System.out.println("Frente de la cola: " + intQueue.front()); // Debería ser 10
            System.out.println("Último de la cola: " + intQueue.back());  // Debería ser 50
            
            // Desencolar elementos
            System.out.println("Desencolando: " + intQueue.dequeue()); // Debería ser 10
            System.out.println("Contenido de la cola después de desencolar: " + intQueue.toString());
            
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // Prueba con una cola de cadenas (Strings)
        QueueArray<String> stringQueue = new QueueArray<>(3); // Tamaño máximo de la cola = 3
        System.out.println("Prueba con una cola de Cadenas:");

        // Encolar elementos
        stringQueue.enqueue("Tarea urgente");
        stringQueue.enqueue("Tarea media");
        stringQueue.enqueue("Tarea baja");

        System.out.println("Contenido de la cola: " + stringQueue.toString());

        try {
            System.out.println("Frente de la cola: " + stringQueue.front()); // Debería ser "Tarea urgente"
            System.out.println("Último de la cola: " + stringQueue.back());  // Debería ser "Tarea baja"
            
            // Desencolar elementos
            System.out.println("Desencolando: " + stringQueue.dequeue()); // Debería ser "Tarea urgente"
            System.out.println("Contenido de la cola después de desencolar: " + stringQueue.toString());
            
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // Prueba con una cola de caracteres (Chars)
        QueueArray<Character> charQueue = new QueueArray<>(4); // Tamaño máximo de la cola = 4
        System.out.println("Prueba con una cola de Caracteres:");

        // Encolar elementos
        charQueue.enqueue('A');
        charQueue.enqueue('B');
        charQueue.enqueue('C');
        charQueue.enqueue('D');

        System.out.println("Contenido de la cola: " + charQueue.toString());

        try {
            System.out.println("Frente de la cola: " + charQueue.front()); // Debería ser 'A'
            System.out.println("Último de la cola: " + charQueue.back());  // Debería ser 'D'
            
            // Desencolar elementos
            System.out.println("Desencolando: " + charQueue.dequeue()); // Debería ser 'A'
            System.out.println("Contenido de la cola después de desencolar: " + charQueue.toString());
            
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}

