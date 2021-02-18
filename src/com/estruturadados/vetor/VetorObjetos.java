package com.estruturadados.vetor;

public class VetorObjetos {

        private Object[] elementos;
        private int tamanho;

        public VetorObjetos(int capacidade) {
            this.elementos = new Object[capacidade];
            tamanho = 0;
        }

        public boolean adiciona(Object elemento) {
            this.aumentaCapacidade();
            if (this.tamanho < this.elementos.length) {
                this.elementos[this.tamanho] = elemento;
                this.tamanho++;
            }

            return false;
        }

        public boolean adicionaQualquerPosicao(int posicao, Object elemento){//caso quiser retornar void é só trocar o boolean e remover retorno true
            if (!(posicao>=0 && posicao<tamanho)){
                throw new IllegalArgumentException("Posição invalida");
            }

            this.aumentaCapacidade();

            //mover todos os elementos
            for (int i=this.tamanho-1;i>=posicao;i--){
                this.elementos[i+1]=this.elementos[i];
            }

            this.elementos[posicao] = elemento;
            this.tamanho++;

            return true;
        }

        private void aumentaCapacidade(){
            if (this.tamanho==this.elementos.length){
                Object[] elementosNovos= new String[this.elementos.length*2];
                for (int i=0;i<this.elementos.length;i++){
                    elementosNovos[i]=this.elementos[i];
                }
                this.elementos=elementosNovos;
            }
        }

        public Object busca(int posicao){
            if (!(posicao>=0 && posicao<tamanho)){
                throw new IllegalArgumentException("Posição invalida");
            }
            return this.elementos[posicao];
        }

        public int busca(Object elemento){
            for (int i=0;i<this.tamanho;i++){
                if (this.elementos[i].equals(elemento)){
                    return i;
                }
            }
            return -1;
        }

        public void remove(int posicao){
            if (!(posicao>=0 && posicao<tamanho)){
                throw new IllegalArgumentException("Posição invalida");
            }
            for (int i=posicao;i<this.tamanho-1;i++){
                this.elementos[i] = this.elementos[i+1];
            }
            this.tamanho--;
        }

        public int tamanho() {
            return this.tamanho;
        }

        @Override
        public String toString() {

            StringBuilder s = new StringBuilder();
            s.append("[");

            for (int i = 0; i < this.tamanho - 1; i++) {
                s.append(this.elementos[i]);
                s.append(",");
            }

            if (this.tamanho > 0) {
                s.append(this.elementos[this.tamanho - 1]);
            }

            s.append("]");

            return s.toString();
        }
    }


