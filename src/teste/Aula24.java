package teste;

import com.estruturadados.fila.FilaComPrioridade;

//Estrutura de Dados e Algoritmos com Java #24: Filas com Prioridade
public class Aula24 {
    public static void main(String[] args) {

        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

        fila.enfileira(new Paciente("A",2));
        fila.enfileira(new Paciente("C",1));
        fila.enfileira(new Paciente("B",3));

        System.out.println(fila);
        System.out.println(fila.desenfileira());
        System.out.println(fila);
        System.out.println(fila.desenfileira());

        /*
        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(2);
        fila.enfileira(1);
        fila.enfileira(5);
        fila.enfileira(2);
        fila.enfileira(7);
        fila.enfileira(6);


        System.out.println(fila); //1 2 3 e não 1 3 2

         */
    }
}
