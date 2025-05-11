package Ejercicio4;
import Actividad1.ExceptionIsEmpty;
import Ejercicio1.StackLink;

public class Aplication {

    public static boolean symbol_balancing(String s) {
        StackLink<Character> stack = new StackLink<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;

                char top;
                try {
                    top = stack.pop();
                } catch (ExceptionIsEmpty e) {
                    return false;
                }

                if (!matches(top, c)) return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}
