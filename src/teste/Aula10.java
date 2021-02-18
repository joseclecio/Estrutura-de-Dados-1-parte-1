package teste;

import com.estruturadados.vetor.VetorObjetos;
//Estrutura de Dados e Algoritmos com Java #10: Vetores e Arrays: Generalizar o tipo do vetor
public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "00000-0000", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "11111-1111", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "33333-3333", "contato3@email.com");

        Contato c4 = new Contato("Contato 3", "33333-3333", "contato3@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());
        int pos = vetor.busca(c4);
        if (pos>-1){
            System.out.println("Elemento existe no vetor");
        }else{
            System.out.println("Elemento não existe no vetor");
        }
        System.out.println(vetor);
    }
}
