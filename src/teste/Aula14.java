package teste;

import com.estruturadados.pilha.Pilha;
//Estrutura de Dados e Algoritmos com Java #14: Pilhas: Empilhar elemento (push)
public class Aula14 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        for (int i=1;i<=11;i++){
            pilha.empilha(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
