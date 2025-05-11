package Ejercicio3;
import Actividad1.ExceptionIsEmpty;
import Actividad3.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        try {
            // Prueba con Strings
            PriorityQueue<String, Integer> tareas = new PriorityQueueLinked<>(5); // Prioridades de 0 a 4
            System.out.println("Cola de prioridad con Strings:");
            tareas.enqueue("Tarea baja", 0);       // Prioridad baja
            tareas.enqueue("Tarea media", 2);      // Prioridad media
            tareas.enqueue("Tarea alta", 4);       // Prioridad alta

            System.out.println("Elemento al frente: " + tareas.front()); // Debe ser "Tarea alta"
            System.out.println("Elemento al final: " + tareas.back());   // Podría ser "Tarea media" o "Tarea baja" dependiendo del orden de inserción

            System.out.println("Desencolando: " + tareas.dequeue());     // Debe quitar "Tarea alta"
            System.out.println("Nuevo frente: " + tareas.front());

            System.out.println("Contenido restante:");
            while (!tareas.isEmpty()) {
                System.out.println("- " + tareas.dequeue());
            }

            // Prueba con Números
            PriorityQueue<Integer, Integer> numeros = new PriorityQueueLinked<>(3); // Prioridades 0, 1, 2
            System.out.println("\nCola de prioridad con Números:");
            numeros.enqueue(100, 0);
            numeros.enqueue(200, 2);
            numeros.enqueue(150, 1);

            while (!numeros.isEmpty()) {
                System.out.println("Número con prioridad: " + numeros.dequeue());
            }

        } catch (ExceptionIsEmpty e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

