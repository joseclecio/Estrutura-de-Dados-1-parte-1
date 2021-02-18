package teste;

import com.estruturadados.vetor.Lista;
//Estrutura de Dados e Algoritmos com Java #11: Vetores e Arrays: Configurar tipo dinamicamente
public class Aula11 {
    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<>(1);//é só mudar o valor para String, contato, int, etc

        Contato c1 = new Contato("Contato 1", "00000-0000", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "11111-1111", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "33333-3333", "contato3@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println(vetor);
    }
}
