package teste;

import java.util.ArrayList;
//Estrutura de Dados e Algoritmos com Java #12: Vetores e Arrays: API Java: ArrayList
public class Aula12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1,"B");

        System.out.println(arrayList);

        boolean existe= arrayList.contains("A");
        if (existe){
            System.out.println("Existe no aray");
        }else {
            System.out.println("Não existe");
        }

        int pos= arrayList.indexOf("B");
        if (pos >-1){
            System.out.println("Existe no aray na pos "+pos);
        }else {
            System.out.println("Não existe na pos "+pos);
        }

        System.out.println(arrayList.get(2));

        arrayList.remove(0);
        arrayList.remove("B");

        System.out.println(arrayList);

        System.out.println(arrayList.size());




    }
}
