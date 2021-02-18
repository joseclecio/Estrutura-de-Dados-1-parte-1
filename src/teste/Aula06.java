package teste;

import com.estruturadados.vetor.Vetor;
//Estrutura de Dados e Algoritmos com Java #06: Vetores e Arrays: Verificar se elemento existe
public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");//0
        vetor.adiciona("elemento 2");//1
        vetor.adiciona("elemento 3");//2

        System.out.println(vetor.busca("elemento 1"));
    }
}
