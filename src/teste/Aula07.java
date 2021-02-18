package teste;

import com.estruturadados.vetor.Vetor;
//Estrutura de Dados e Algoritmos com Java #07: Vetores e Arrays: Add elemento em qualquer posição
public class Aula07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

        vetor.adicionaQualquerPosicao(0,"A");
        System.out.println(vetor);
        vetor.adicionaQualquerPosicao(3,"D");
        System.out.println(vetor);

    }
}
