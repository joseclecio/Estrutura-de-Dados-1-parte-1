package com.estruturadados.fila.labs;

import com.estruturadados.fila.FilaComPrioridade;

public class PSAtendimento implements Runnable{

    private FilaComPrioridade<Pessoa> fila;

    public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {

        while (!fila.estaVazia()){

            try {
                System.out.println(fila.desenfileira()+ " atendida!");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Atendimento concluido!");

    }
}
