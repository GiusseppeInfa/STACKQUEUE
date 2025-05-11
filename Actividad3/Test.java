package Actividad3;
import Actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) throws ExceptionIsEmpty {
        
        // Prueba 1: Cola de prioridad con Strings
        PriorityQueue<String, Integer> pqString = new PriorityQueueLinkSort<>();
        System.out.println("Cola de prioridad con Strings:");
        pqString.enqueue("Tarea urgente", 1);
        pqString.enqueue("Tarea media", 5);
        pqString.enqueue("Tarea baja", 10);

        System.out.println("Elemento al frente: " + pqString.front());
        System.out.println("Elemento al final: " + pqString.back());
        System.out.println("Desencolando: " + pqString.dequeue());
        System.out.println("Contenido de la cola: " + pqString.toString());
        System.out.println();

        // Prueba 2: Cola de prioridad con enteros
        PriorityQueue<Integer, Integer> pqInt = new PriorityQueueLinkSort<>();
        System.out.println("Cola de prioridad con Enteros:");
        pqInt.enqueue(100, 2);
        pqInt.enqueue(200, 8);
        pqInt.enqueue(300, 4);

        System.out.println("Elemento al frente: " + pqInt.front());
        System.out.println("Elemento al final: " + pqInt.back());
        System.out.println("Desencolando: " + pqInt.dequeue());
        System.out.println("Contenido de la cola: " + pqInt.toString());
        System.out.println();

        // Prueba 3: Cola de prioridad con caracteres
        PriorityQueue<Character, Integer> pqChar = new PriorityQueueLinkSort<>();
        System.out.println("Cola de prioridad con Caracteres:");
        pqChar.enqueue('A', 3);
        pqChar.enqueue('B', 1);
        pqChar.enqueue('C', 5);

        System.out.println("Elemento al frente: " + pqChar.front());
        System.out.println("Elemento al final: " + pqChar.back());
        System.out.println("Desencolando: " + pqChar.dequeue());
        System.out.println("Contenido de la cola: " + pqChar.toString());
        System.out.println();

        // Prueba 4: Verificar cola vacía
        PriorityQueue<String, Integer> pqEmpty = new PriorityQueueLinkSort<>();
        System.out.println("Prueba con cola vacía:");
        System.out.println("¿Está vacía?: " + pqEmpty.isEmpty());
        pqEmpty.enqueue("Solo uno", 1);
        System.out.println("¿Está vacía después de encolar?: " + pqEmpty.isEmpty());
        pqEmpty.dequeue();
        System.out.println("¿Está vacía después de desencolar?: " + pqEmpty.isEmpty());
    }
}