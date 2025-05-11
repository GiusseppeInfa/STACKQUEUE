package Actividad1;

public class Test {

	public static void main(String[] args) {
		try {
			
            Stack<Integer> pilaEnteros = new StackArray<>(5);
            System.out.println("Pila de enteros:");
            pilaEnteros.push(10);
            pilaEnteros.push(20);
            pilaEnteros.push(30);
            System.out.println(pilaEnteros); // [10, 20, 30]
            System.out.println("Tope: " + pilaEnteros.top()); // 30
            System.out.println("Elemento eliminado: " + pilaEnteros.pop()); // 30
            System.out.println("Está vacía? " + pilaEnteros.isEmpty()); // false
            System.out.println(pilaEnteros);

            // Pila de cadenas
            Stack<String> pilaCadenas = new StackArray<>(3);
            System.out.println("\nPila de cadenas:");
            pilaCadenas.push("Hola");
            pilaCadenas.push("Mundo");
            System.out.println(pilaCadenas); // [Hola, Mundo]
            System.out.println("Tope: " + pilaCadenas.top()); // Mundo
            pilaCadenas.pop();
            pilaCadenas.pop();
            System.out.println("Está vacía? " + pilaCadenas.isEmpty()); // true

            // Intento de hacer pop en pila vacía
            try {
                pilaCadenas.pop();
            } catch (ExceptionIsEmpty e) {
                System.out.println("Excepción esperada: " + e.getMessage());
            }

            StackArray<Double> pilaDecimales = new StackArray<>(2);
            System.out.println("\nPila de decimales:");
            pilaDecimales.push(3.14);
            pilaDecimales.push(2.71);
            System.out.println("Pila llena? " + pilaDecimales.isFull()); // true
            System.out.println(pilaDecimales);

            // Intento de hacer push en pila llena
            try {
                pilaDecimales.push(1.61);
            } catch (IllegalStateException e) {
                System.out.println("Excepción esperada: " + e.getMessage());
            }

        } catch (ExceptionIsEmpty e) {
            System.out.println("Excepción no esperada: " + e.getMessage());
        }
	}
}
