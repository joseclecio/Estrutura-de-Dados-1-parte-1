package teste;

import com.estruturadados.pilha.Pilha;
//Estrutura de Dados e Algoritmos com Java #16: Pilhas: Espiar/Verificar elemento do topo (peek)
public class Aula16 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.topo());

        System.out.println(pilha);

        pilha.empilha(1);
        pilha.empilha(2);

        System.out.println(pilha.topo()); //verificar o topo da pilha

        System.out.println(pilha);

    }
}
