package Ejercicio3;
import Actividad1.ExceptionIsEmpty;
import Actividad3.PriorityQueue;
import Actividad2.QueueLink;


public class PriorityQueueLinked<E> implements PriorityQueue<E, Integer> {
    private QueueLink<E>[] priorityQueues; // Arreglo de colas
    private int levels; // Cantidad de prioridades

    @SuppressWarnings("unchecked")
    public PriorityQueueLinked(int levels) {
        this.levels = levels;
        this.priorityQueues = new QueueLink[levels];
        for (int i = 0; i < levels; i++) {
            priorityQueues[i] = new QueueLink<>();
        }
    }

    @Override
    public void enqueue(E x, Integer pr) {
        if (pr < 0 || pr >= levels) {
            System.out.println("Prioridad inválida: " + pr);
            return;
        }
        priorityQueues[pr].enqueue(x); // Encola en la cola de esa prioridad
    }

    @Override
    public E dequeue() throws ExceptionIsEmpty {
        for (int i = levels - 1; i >= 0; i--) {
            if (!priorityQueues[i].isEmpty()) {
                return priorityQueues[i].dequeue(); // Elimina desde la cola con más prioridad
            }
        }
        throw new ExceptionIsEmpty("La cola de prioridad está vacía.");
    }

    @Override
    public E front() throws ExceptionIsEmpty {
        for (int i = levels - 1; i >= 0; i--) {
            if (!priorityQueues[i].isEmpty()) {
                return priorityQueues[i].front(); // Devuelve el frente con más prioridad
            }
        }
        throw new ExceptionIsEmpty("La cola de prioridad está vacía.");
    }

    @Override
    public E back() throws ExceptionIsEmpty {
        for (int i = 0; i < levels; i++) {
            if (!priorityQueues[i].isEmpty()) {
                return priorityQueues[i].back(); // Devuelve el final de menor prioridad
            }
        }
        throw new ExceptionIsEmpty("La cola de prioridad está vacía.");
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < levels; i++) {
            if (!priorityQueues[i].isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Contenido de la cola de prioridad:\n");
        for (int i = levels - 1; i >= 0; i--) {
            sb.append("Prioridad ").append(i).append(": ").append(priorityQueues[i].toString()).append("\n");
        }
        return sb.toString();
    }
}

