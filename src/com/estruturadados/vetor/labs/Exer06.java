package com.estruturadados.vetor.labs;

import com.estruturadados.vetor.Lista;
import teste.Contato;

import java.util.Scanner;

public class Exer06 {
    //Estrutura de Dados e Algoritmos com Java: Vetores e Arrays: Exer 06 Contatos - Lista

    //Utilize a classe Lista ou Vetor e classe Contato(criada durante as aulas)
    // e desenvolva os seguintes itens:
    //1. Crie um vetor com capacidade para 20 contatos
    //2. Insira 30 contatos no vetor(isso é possível ser feito através de um loop);
    //Crie um exemplo para utilizar cada método da classe Lista.
    public static void main(String[] args) {

        //criação das variaveis
        Scanner scan = new Scanner(System.in);

        //criar vetor com 20 de capacidade
        Lista<Contato> lista = new Lista(20);

        //criar e adicionar 30 contatos
        criarContatosDinamicamente(5, lista);

        //criar um menu para que o usuario escolha a opção
        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaomenu(scan);

            switch (opcao) {
                case 1:
                    adicionarContatoFinal(scan, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, lista);
                    break;
                case 3:
                    obtemContatoPosicao(scan, lista);
                    break;
                case 4:
                    obtemContato(scan, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scan, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, lista);
                    break;
                case 7:
                    excluirPosicao(scan, lista);
                    break;
                case 8:
                    excluirContato(scan, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimeVetor(lista);
                    break;

                default:
                    break;
            }
        }

        System.out.println("Usuário digitou 0, programa terminado!");
    }

    private static void imprimeVetor(Lista<Contato> lista) {
        System.out.println(lista);
    }

    private static void limparVetor(Lista<Contato> lista) {
        lista.limpar();
        System.out.println("Todos os contatos do vetor foram excluídos!");
    }

    private static void imprimeTamanhoVetor(Lista<Contato> lista) {
        System.out.println("Tamanho do vetor é de: " + lista.tamanho());
    }

    private static void excluirContato(Scanner scan, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisara", scan);

        try {
            Contato contato = lista.busca(pos);
            lista.remove(contato);
            System.out.println("Contato Excluido!");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPosicao(Scanner scan, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisara", scan);

        try {
            lista.remove(pos);
            System.out.println("Contato Excluido!");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisara", scan);

        try {
            Contato contato = lista.busca(pos);
            boolean existe = lista.contem(contato);

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

    private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisara", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato eciste, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do ultimo indice do contato encontrado: ");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posição inváçida!");
        }
    }

    private static void obtemContato(Scanner scan, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisara", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato eciste, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado: ");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posição inváçida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisara", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato eciste, seguem dados: ");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inváçida!");
        }
    }

    private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = lerInformacao("Entre com o nome", scan);
        String telefone = lerInformacao("Entre com o telefone", scan);
        String email = lerInformacao("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);

    }

    private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = lerInformacao("Entre com o nome", scan);
        String telefone = lerInformacao("Entre com o telefone", scan);
        String email = lerInformacao("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);
        int pos = lerInformacaoInt("Entre com a posição a adicionar o contato", scan);

        try {
            lista.adicionaQualquerPosicao(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado!");
        }


        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);

    }

    protected static String lerInformacao(String msg, Scanner scan) {
        System.out.println(msg);
        String entrada = scan.nextLine();

        return entrada;
    }

    protected static int lerInformacaoInt(String msg, Scanner scan) {
        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = scan.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente!");
            }
        }
        return num;
    }

    protected static int obterOpcaomenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {

            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato em uma posição específica");
            System.out.println("3: Obtém contato de uma posição específica");
            System.out.println("4: Consulta contato");
            System.out.println("5: Consulta último indice do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Excluir por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Excluir todos os contatos do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println("0: Sair");

            try {
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, tente novamente!\n\n");
            }
        }
        return opcao;
    }

    protected static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
        Contato contato;

        for (int i = 1; i <= quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("11111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.adiciona(contato);
        }
    }
}
