package com.estruturadados.fila.labs;

import com.estruturadados.fila.Fila;
import com.estruturadados.fila.FilaComPrioridade;

//Utilize a classe Fila para similar um sistema de senhas de um pronto Socorro.
//Cada pessoa pode ser classidficada com 3 códigos: vermelho - de prioridade maior,
//amarelo - prioridade media e verde - quando a situação não é grave e a pessoa
//pode esperar mais um tempo. O programa deve obedecer às seguines condições:
//Enfileire 6 pessoas na fila inicial
//Pessoas com prioridade vermelha devem ser atendidas primeiro;
//Cada consulta dura cerca de 5 segundos, e depois o próximo da fila é chamado.
//A cada 4 segundos, uma pessoa chega no pronto socorro com prioridade aleatória
//(crie um código java para criar a aleatoriedade).
public class Exer03 {

    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {

        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();
        fila.enfileira(new Pessoa("1",VERDE));
        fila.enfileira(new Pessoa("2",AMARELO));
        fila.enfileira(new Pessoa("3",VERMELHO));
        fila.enfileira(new Pessoa("4",VERDE));
        fila.enfileira(new Pessoa("5",VERDE));
        fila.enfileira(new Pessoa("6",VERMELHO));

        PSAtendimento atendimento = new PSAtendimento(fila);
        PSNovosPacientes pacientes = new PSNovosPacientes(fila);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);

        t1.start();
        t2.start();


    }
}
