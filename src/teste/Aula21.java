package teste;

import com.estruturadados.fila.Fila;

//Estrutura de Dados e Algoritmos com Java #21:
// Filas: Espiar/Verificar elemento início da fila (peek)
public class Aula21 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(3);
        fila.enfileira(1);
        fila.enfileira(2);

        System.out.println(fila.espiar());
        System.out.println(fila.toString());

    }
}
