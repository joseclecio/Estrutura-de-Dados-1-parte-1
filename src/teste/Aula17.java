package teste;

import com.estruturadados.pilha.Pilha;
//Estrutura de Dados e Algoritmos com Java #17: Pilhas: Desempilhar elemento (pop)
public class Aula17 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        System.out.println(pilha);

        System.out.println("Desempilhando elemento "+pilha.desempilha());

        System.out.println(pilha);

    }
}
