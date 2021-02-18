package teste;

import com.estruturadados.pilha.Pilha;
//Estrutura de Dados e Algoritmos com Java #15: Pilhas: Verificar se pilha está vazia
public class Aula15 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.estaVazia());

        pilha.empilha(1);

        System.out.println(pilha.estaVazia());

    }
}
