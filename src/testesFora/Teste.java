package testesFora;


import com.estruturadados.fila.Fila;
import com.estruturadados.fila.FilaComPrioridade;
import com.estruturadados.vetor.Lista;

public class Teste {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileira(14);
        fila.enfileira(2);
        fila.enfileira(31);
        System.out.println(fila);
        fila.desenfileira();

        System.out.println(fila);

    }
}
