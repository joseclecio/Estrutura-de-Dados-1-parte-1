package teste;

import com.estruturadados.fila.Fila;

//Estrutura de Dados e Algoritmos com Java #20: Filas:
// Enfileirar (adicionar) elemento (enqueue)
public class Aula20 {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());

        System.out.println(fila.toString());
    }
}
