package teste;

import java.util.Stack;
//Estrutura de Dados e Algoritmos com Java #18: Pilhas: API Java: Stack
public class Aula18 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.push(1); //empilhar
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack);

        System.out.println(stack.peek());//espiar

        System.out.println(stack.pop());

        System.out.println(stack);

    }
}
