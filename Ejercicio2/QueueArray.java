package Ejercicio2;
import Actividad1.ExceptionIsEmpty;
import Actividad2.Queue;

public class QueueArray<E> implements Queue<E> {

    private E[] queue;         // Arreglo para almacenar los elementos
    private int front;         // Índice del frente de la cola
    private int back;          // Índice del final de la cola
    private int size;          // Número de elementos en la cola
    private int capacity;      // Capacidad máxima de la cola

    // Constructor: Inicializa la cola con una capacidad dada
    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.queue = (E[]) new Object[capacity]; // Crear el arreglo
        this.front = 0;
        this.back = -1;
        this.size = 0;
    }

    // Encolar un elemento (insertar en la parte trasera)
    @Override
    public void enqueue(E x) {
        if (size == capacity) {
            throw new RuntimeException("La cola está llena");
        }
        back = (back + 1) % capacity; // Movimiento circular
        queue[back] = x;             // Coloca el nuevo elemento en el final
        size++;
    }

    // Desencolar un elemento (eliminar del frente)
    @Override
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("No se puede desencolar de una cola vacía");
        }
        E dequeuedElement = queue[front]; // Obtener el elemento del frente
        front = (front + 1) % capacity;    // Movimiento circular
        size--;
        return dequeuedElement;
    }

    // Obtener el primer elemento (el frente de la cola)
    @Override
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("No se puede acceder al frente de una cola vacía");
        }
        return queue[front];
    }

    // Obtener el último elemento (el final de la cola)
    @Override
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("No se puede acceder al final de una cola vacía");
        }
        return queue[back];
    }

    // Verificar si la cola está vacía
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Representar la cola como una cadena (para mostrarla)
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(queue[(front + i) % capacity]).append(" "); // Movimiento circular para mostrar
        }
        return sb.toString();
    }
}

