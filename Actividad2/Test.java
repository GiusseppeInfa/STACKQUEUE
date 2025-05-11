package Actividad2;
import Actividad1.ExceptionIsEmpty;

public class Test  {
    public static void main(String[] args) throws ExceptionIsEmpty{
        // Prueba 1: Trabajando con una cola de Strings
        Queue<String> stringQueue = new QueueLink<>();
        System.out.println("Prueba con una cola de Strings:");

        // Encolar elementos
        stringQueue.enqueue("Elemento 1");
        stringQueue.enqueue("Elemento 2");
        stringQueue.enqueue("Elemento 3");
        
        System.out.println("Frente de la cola: " + stringQueue.front()); // "Elemento 1"
        System.out.println("Último de la cola: " + stringQueue.back());  // "Elemento 3"

        // Desencolar elementos
        System.out.println("Desencolando: " + stringQueue.dequeue()); // "Elemento 1"
        System.out.println("Nuevo frente de la cola: " + stringQueue.front()); // "Elemento 2"

        // Ver el estado actual de la cola
        System.out.println("Contenido de la cola: " + stringQueue.toString()); // "Elemento 2 Elemento 3"
        System.out.println();

        // Prueba 2: Trabajando con una cola de enteros
        Queue<Integer> integerQueue = new QueueLink<>();
        System.out.println("Prueba con una cola de Enteros:");

        // Encolar elementos
        integerQueue.enqueue(10);
        integerQueue.enqueue(20);
        integerQueue.enqueue(30);

        // Ver el primer y último elemento
        System.out.println("Frente de la cola: " + integerQueue.front()); // 10
        System.out.println("Último de la cola: " + integerQueue.back());  // 30

        // Desencolar elementos
        System.out.println("Desencolando: " + integerQueue.dequeue()); // 10
        System.out.println("Nuevo frente de la cola: " + integerQueue.front()); // 20

        // Ver el estado actual de la cola
        System.out.println("Contenido de la cola: " + integerQueue.toString()); // "20 30"
        System.out.println();

        // Prueba 3: Trabajando con una cola de caracteres
        Queue<Character> charQueue = new QueueLink<>();
        System.out.println("Prueba con una cola de Caracteres:");

        // Encolar elementos
        charQueue.enqueue('A');
        charQueue.enqueue('B');
        charQueue.enqueue('C');

        // Ver el primer y último elemento
        System.out.println("Frente de la cola: " + charQueue.front()); // 'A'
        System.out.println("Último de la cola: " + charQueue.back());  // 'C'

        // Desencolar elementos
        System.out.println("Desencolando: " + charQueue.dequeue()); // 'A'
        System.out.println("Nuevo frente de la cola: " + charQueue.front()); // 'B'

        // Ver el estado actual de la cola
        System.out.println("Contenido de la cola: " + charQueue.toString()); // "B C"
        System.out.println();

        // Prueba 4: Comprobando si la cola está vacía
        System.out.println("Prueba de cola vacía:");

        // Crear una nueva cola vacía
        Queue<String> emptyQueue = new QueueLink<>();
        System.out.println("¿Está la cola vacía? " + emptyQueue.isEmpty()); // true

        // Encolar un elemento y verificar si la cola está vacía
        emptyQueue.enqueue("Elemento único");
        System.out.println("¿Está la cola vacía después de encolar? " + emptyQueue.isEmpty()); // false

        // Desencolar el único elemento y verificar si la cola está vacía de nuevo
        emptyQueue.dequeue();
        System.out.println("¿Está la cola vacía después de desencolar? " + emptyQueue.isEmpty()); // true
        System.out.println();
    }
}
