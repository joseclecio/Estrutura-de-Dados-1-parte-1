package com.estruturadados.vetor.labs;

import teste.Contato;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer07 extends Exer06{
    //Estrutura de Dados e Algoritmos com Java: Vetores e Arrays: Exer 07 Contatos - ArrayList

    //Utilize a classe ArrayList e desenvolva os seguintes items:
    //1. Crie uma ArrayList utilizando a classe ArrayList da API do Java;
    //2. Passe todos os contatos do vetor para o ArrayList;
    //3. Crie um exemplo para utilizar cada método da classe
    // ArrayList(somente os métodos que implementamos de forma similar
    // na classe ArrayList);
    public static void main(String[] args) {

        //criação das variaveis
        Scanner scan = new Scanner(System.in);

        //criar vetor com 20 de capacidade
        ArrayList<Contato> ArrayList = new ArrayList(20);

        //criar e adicionar 30 contatos
        criarContatosDinamicamente(5, ArrayList);

        //criar um menu para que o usuario escolha a opção
        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaomenu(scan);

            switch (opcao) {
                case 1:
                    adicionarContatoFinal(scan, ArrayList);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, ArrayList);
                    break;
                case 3:
                    obtemContatoPosicao(scan, ArrayList);
                    break;
                case 4:
                    obtemContato(scan, ArrayList);
                    break;
                case 5:
                    pesquisarUltimoIndice(scan, ArrayList);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, ArrayList);
                    break;
                case 7:
                    excluirPosicao(scan, ArrayList);
                    break;
                case 8:
                    excluirContato(scan, ArrayList);
                    break;
                case 9:
                    imprimeTamanhoVetor(ArrayList);
                    break;
                case 10:
                    limparVetor(ArrayList);
                    break;
                case 11:
                    imprimeVetor(ArrayList);
                    break;

                default:
                    break;
            }
        }

        System.out.println("Usuário digitou 0, programa terminado!");
    }

    private static void imprimeVetor(ArrayList<Contato> ArrayList) {
        System.out.println(ArrayList);
    }

    private static void limparVetor(ArrayList<Contato> ArrayList) {
        ArrayList.clear();
        System.out.println("Todos os contatos do vetor foram excluídos!");
    }

    private static void imprimeTamanhoVetor(ArrayList<Contato> ArrayList) {
        System.out.println("Tamanho do vetor é de: " + ArrayList.size());
    }

    private static void excluirContato(Scanner scan, ArrayList<Contato> ArrayList) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisara", scan);

        try {
            Contato contato = ArrayList.get(pos);
            ArrayList.remove(contato);
            System.out.println("Contato Excluido!");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPosicao(Scanner scan, ArrayList<Contato> ArrayList) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisara", scan);

        try {
            ArrayList.remove(pos);
            System.out.println("Contato Excluido!");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> ArrayList) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisara", scan);

        try {
            Contato contato = ArrayList.get(pos);
            boolean existe = ArrayList.contains(contato);

            if (existe) {
                System.out.println("Contato eciste, seguem dados: ");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe!");
            }

        } catch (Exception e) {
            System.out.println("Posição inváçida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> ArrayList) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisara", scan);

        try {
            Contato contato = ArrayList.get(pos);

            System.out.println("Contato eciste, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do ultimo indice do contato encontrado: ");
            pos = ArrayList.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posição inváçida!");
        }
    }

    private static void obtemContato(Scanner scan, ArrayList<Contato> ArrayList) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisara", scan);

        try {
            Contato contato = ArrayList.get(pos);

            System.out.println("Contato eciste, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado: ");
            pos = ArrayList.indexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posição inváçida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> ArrayList) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisara", scan);

        try {
            Contato contato = ArrayList.get(pos);

            System.out.println("Contato eciste, seguem dados: ");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inváçida!");
        }
    }

    private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> ArrayList) {
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = lerInformacao("Entre com o nome", scan);
        String telefone = lerInformacao("Entre com o telefone", scan);
        String email = lerInformacao("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        ArrayList.add(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);

    }

    private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> ArrayList) {
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = lerInformacao("Entre com o nome", scan);
        String telefone = lerInformacao("Entre com o telefone", scan);
        String email = lerInformacao("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);
        int pos = lerInformacaoInt("Entre com a posição a adicionar o contato", scan);

        try {
            ArrayList.add(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado!");
        }


        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);

    }

    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> ArrayList) {
        Contato contato;

        for (int i = 1; i <= quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("11111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            ArrayList.add(contato);
        }
    }
}
