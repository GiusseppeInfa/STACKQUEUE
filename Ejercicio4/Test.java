package Ejercicio4;

public class Test {
    public static void main(String[] args) {
        System.out.println(Aplication.symbol_balancing("()()()[(())]()")); // true
        System.out.println(Aplication.symbol_balancing("((()))[]"));       // true
        System.out.println(Aplication.symbol_balancing("([)[]]("));        // false
        System.out.println(Aplication.symbol_balancing("([{])}"));         // false
        System.out.println(Aplication.symbol_balancing("["));              // false
        System.out.println(Aplication.symbol_balancing("[[[]][{{}}]]"));   // true
        
    }
}
