package teste;

import com.estruturadados.vetor.Vetor;
//Estrutura de Dados e Algoritmos com Java #08: Vetores e Arrays: Aumentar capacidade do vetor
public class Aula08 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);



    }
}
