package teste;

import com.estruturadados.vetor.Vetor;
//Estrutura de Dados e Algoritmos com Java #04: Vetores e Arrays: tamanho e imprimir elementos
public class Aula04 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.tamanho());

        System.out.println(vetor);
    }
}
