package testesFora;

import com.estruturadados.vetor.Lista;
import com.estruturadados.vetor.Lista02;

public class TesteLista {
    public static void main(String[] args) {
        Lista<Integer> l = new Lista<Integer>(10);

        l.adiciona(1);
        l.adiciona(2);
        l.adiciona(3);
        l.adiciona(4);

        System.out.println(l);

        l.adicionaQualquerPosicao(4,9);

        System.out.println(l);







    }
}
