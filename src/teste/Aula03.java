package teste;

import com.estruturadados.vetor.Vetor;
//Estrutura de Dados e Algoritmos com Java #03: Vetores e Arrays: Adicionar elemento no final do vetor
public class Aula03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");


        System.out.println(vetor);
    }
}
