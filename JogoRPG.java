package jogoRPG;

/*
// metodo soma que é estático, pois esta sendo chamado de outro método estático (o metodo main)
// sua unica função é retornar a soma de 2 parametros (valores passados para ele trabalhar)
// public static int soma(int x, int y) {
//   return x+y; (lembrando que void não retorna valor)
 */
import java.util.Scanner;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class JogoRPG {

    public static void main(String[] args) {
        //chama a função que desencadeia a chamada das outras funções.
        menu();

    }

    //Inicio das Funçoes principais do Quiz
    public static int menu() {
        Scanner keyboard = new Scanner(System.in);
        int op;
        do {
            System.out.println("========================================================");
            System.out.println("==================== THE DEVELOPER  ====================");
            System.out.println("========================================================");
            System.out.println("============== Insira um numero de 1 a 4 ===============");
            System.out.println("========================================================");
            System.out.println("== 1 - Instruções                                     ==");
            System.out.println("== 2 - Jogar                                          ==");
            System.out.println("== 3 - Creditos                                       ==");
            System.out.println("== 0 - Sair                                           ==");
            System.out.println("========================================================");
            op = keyboard.nextInt();
            //Chama uma função com a escolha de uma opção do switch case
            switch (op) {
                case 1:
                    instrucoes();
                    break;
                case 2:
                    jogo1();
                    break;
                case 3:
                    creditos();
                    break;
                case 4:
                    sair();
                    break;
            }
        } while (op != 0);
        return op;
    }

    public static void instrucoes() {
        Scanner keyboard = new Scanner(System.in);
        int opc;
        do {
            System.out.println("=================================== INTRUÇÕES =================================");
            System.out.println("== THE DEVELOPER é um RPG “Jogo de Interpretação de Papéis”.");
            System.out.println("== Seu papel é evoluir o seu personagem, que é um programador iniciante.");
            System.out.println("== Você passará por alguns testes (perguntas) de tecnologia e lógica de programação");
            System.out.println("== Por meio destas será possível acumular pontos, que te farão evoluir em sua carreira");
            System.out.println("== O jogo inicia com um teste básico e avança sua carreira para Júnior ");
            System.out.println("== posteriormente, Pleno e Sênior. Tornando-se um grande desenvolvedor. \n");
            System.out.println("== 0 - Voltar ao menu");
            System.out.println("== 1 - Como jogar ==");

            opc = keyboard.nextInt();
        } while (opc != 0 && opc != 1);
        switch (opc) {
            case 1:
                System.out.println("=============================== COMO JOGAR =============================");
                System.out.println("1 - Você terá cinco alternativas: a, b, c, d, e. ");
                System.out.println("2 - Apenas uma alternativa estará correta.");
                System.out.println("3 - Ao acertar uma alternativa, você ira ganhar pontos.");
                System.out.println("4 - Você poderá subir de nível, e avançar na sua carreira. ");
                System.out.println("Júnior: Iniciante, 5 anos de experiência profissional (2 testes).");
                System.out.println("Pleno: Intermediário, entre 6 a 9 anos de experiência (5 testes).");
                System.out.println("Sênior: Avançado, Gestor e líder de equipes e projetos. (2 projetos) ");
                System.out.println("5 - O jogo termina quando você atingir um nível Sênior. ");
                System.out.println("========================= BOA SORTE E BOM JOGO :) =======================");
                do {
                    System.out.println("\n Aperte 0 para voltar ao Menu");
                    opc = keyboard.nextInt();
                } while (opc != 0);
                break;
        }

    }

    public static void creditos() {
        //Responsaveis pela criação do RPG
        Scanner keyboard = new Scanner(System.in);
        int opc;
        System.out.println("=== CRIADO POR: ===");
        System.out.println("Eliseu Ferreira");
        System.out.println("Alexsandro ");
        System.out.println("Mateus");
        System.out.println("Guilherme");
        do {
            System.out.println("\n Aperte 0 para voltar ao Menu");
            opc = keyboard.nextInt();
        } while (opc != 0);
    }

    public static void sair() {
        System.out.println("Você Saiu do jogo! ");
    }
    //Fim da funções principais do Quiz

    //Função de acumulo de pontuação do usuario
    public static int pontos(int bonus) {
        bonus = bonus + 10;
        System.out.println("\n   PONTOS = " + bonus);
        System.out.println("");
        return bonus;
    }

    //Se a resposta resposta estiver errada, chama esta função
    public static int casoIncorreta(int tent) {
        tent--;
        switch (tent) {
            case 4:
                tent = 4;
                System.out.println("Resposta incorreta");
                System.out.println("Você tem mais " + tent + " tentativas");
                break;
            case 3:
                tent = 3;
                System.out.println("Resposta incorreta");
                System.out.println("Você tem mais " + tent + " tentativas");
                break;
            case 2:
                tent = 2;
                System.out.println("Resposta incorreta");
                System.out.println("Você tem mais " + tent + " tentativas");
                break;
            case 1:
                tent = 1;
                System.out.println("Resposta incorreta");
                System.out.println("Você tem mais " + tent + " tentativas");

                break;
            default:

                break;
        }
        return tent;
    }

    //---------------Bugs e coisas pendentes------------------
    //Perguntas do quiz
    //CONCLUÍDO
    //Criar vetores para poder randomizar as questões
    //CONCLUÍDO
    //Laço de repetição até o usuario digitar a, b, c, d ou e (Quando digitado letra ou um numer odiferente o codidgo da erro.
    //CONCLUÍDO
    public static void jogo1() {
        Scanner keyboard = new Scanner(System.in);
        int op;
        System.out.println("============================== THE DEVELOPER ==============================");
        System.out.println("Você se chama Mark Zuckerberg, e está começando a sua carreira ");
        System.out.println("como desenvolvedor. você realizará alguns testes que irão testar ");
        System.out.println("suas capacidades intelectuais. Realize os testes para avançar na carreira. ");
        do {
            System.out.println("1 - START THE GAME");
            op = keyboard.nextInt();

        } while (op != 1);
        quiz(op);
    }

    public static int quiz(int bonus) {
        Scanner keyboard = new Scanner(System.in);
        bonus = 0;
        int tent = 5;
        String n = null;
        boolean acertou = false;
        List Alternativas = new ArrayList();

        Alternativas.add("Os binários são encapsulados em uma MVC. ");
        Alternativas.add("Os binários são executados nativamente no sistema operacional. ");
        Alternativas.add("Os binários são executados dentro de uma VM (virtual machine).");
        Alternativas.add("Os binários são compilados em linux.");
        do {
            Collections.shuffle(Alternativas);

            System.out.println("========= 1 - A linguagem de programação Java é uma das mais populares do mundo e sua portabilidade é um de seus pontos");
            System.out.println("mais fortes para que isso tenha acontecido. Portabilidade é a capacidade de se portar um software para diferentes");
            System.out.println("plataformas, com o mínimo de esforço, ou seja, Java é multiplataforma. Como a linguagem Java consegue garantir");
            System.out.println("essa portabilidade? ==========\n");

            System.out.println("|a)" + Alternativas.get(0));

            System.out.println("|b)" + Alternativas.get(1));

            System.out.println("|c)" + Alternativas.get(2));

            System.out.println("|d)" + Alternativas.get(3));

            n = keyboard.next().toLowerCase();

            switch (n) {
                case "a":
                    if (Alternativas.get(0).equals("Os binários são executados dentro de uma VM (virtual machine).")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "b":
                    if (Alternativas.get(1).equals("Os binários são executados dentro de uma VM (virtual machine).")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "c":
                    if (Alternativas.get(2).equals("Os binários são executados dentro de uma VM (virtual machine).")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
                case "d":
                    if (Alternativas.get(3).equals("Os binários são executados dentro de uma VM (virtual machine).")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
            }
            if (acertou == false) {
                casoIncorreta(tent);
                tent--;
            } else {
                System.out.println("Restam: " + tent + "tentativas");
            }
        } while (!acertou);
        if (acertou == true) {
            bonus = pontos(bonus);
        }

        quiz2(bonus);
        return bonus;
    }

    public static int quiz2(int bonus) {
        Scanner keyboard = new Scanner(System.in);
        String n = null;
        int tent = 5;
        boolean acertou = false;
        List Alternativas = new ArrayList();

        Alternativas.add("0. ");
        Alternativas.add("6. ");
        Alternativas.add("false.");
        Alternativas.add("true.");
        Alternativas.add("3.");
        do {
            Collections.shuffle(Alternativas);

            System.out.println("========= 2 - a condição (3 != 3) é: ==========\n");

            System.out.println("|a)" + Alternativas.get(0));

            System.out.println("|b)" + Alternativas.get(1));

            System.out.println("|c)" + Alternativas.get(2));

            System.out.println("|d)" + Alternativas.get(3));

            System.out.println("|e)" + Alternativas.get(4));

            n = keyboard.next().toLowerCase();

            switch (n) {
                case "a":
                    if (Alternativas.get(0).equals("false.")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "b":
                    if (Alternativas.get(1).equals("false.")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "c":
                    if (Alternativas.get(2).equals("false.")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
                case "d":
                    if (Alternativas.get(3).equals("false.")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
                case "e":
                    if (Alternativas.get(3).equals("false.")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
            }
            if (acertou == false) {
                casoIncorreta(tent);
                tent--;
            } else {
                System.out.println("Restam: " + tent + "tentativas");
            }
        } while (!acertou);
        if (acertou == true) {
            bonus = pontos(bonus);
        }
        quiz3(bonus);
        return bonus;
    }

    public static int quiz3(int bonus) {
        Scanner keyboard = new Scanner(System.in);
        String n = null;
        int tent = 5;
        boolean acertou = false;
        List Alternativas = new ArrayList();

        Alternativas.add("um vetor e o valor de a[5] é 22 ");
        Alternativas.add("uma matriz e o valor de a[5] é 9 ");
        Alternativas.add("um vetor e o valor de a[5] é 4 ");
        Alternativas.add("um vetor e o valor de a[5] é 35 ");
        Alternativas.add("uma matriz e o valor de a[5] é 5 ");
        do {
            Collections.shuffle(Alternativas);

            System.out.println("========= 3 - a = [1, 9, 2, 4, 22, 35] - a[5] é: ==========\n");

            System.out.println("|a)" + Alternativas.get(0));

            System.out.println("|b)" + Alternativas.get(1));

            System.out.println("|c)" + Alternativas.get(2));

            System.out.println("|d)" + Alternativas.get(3));

            System.out.println("|e)" + Alternativas.get(4));

            n = keyboard.next().toLowerCase();

            switch (n) {
                case "a":
                    if (Alternativas.get(0).equals("um vetor e o valor de a[5] é 35 ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "b":
                    if (Alternativas.get(1).equals("um vetor e o valor de a[5] é 35 ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "c":
                    if (Alternativas.get(2).equals("um vetor e o valor de a[5] é 35 ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "d":
                    if (Alternativas.get(3).equals("um vetor e o valor de a[5] é 35 ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "e":
                    if (Alternativas.get(2).equals("um vetor e o valor de a[5] é 35 ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
            }
            if (acertou == false) {
                casoIncorreta(tent);
                tent--;
            } else {
                System.out.println("Restam: " + tent + "tentativas");
            }
        } while (!acertou);
        if (acertou == true) {
            bonus = pontos(bonus);
        }
        quiz4(bonus);
        return bonus;
    }

    public static int quiz4(int bonus) {
        Scanner keyboard = new Scanner(System.in);
        String n = null;
        int tent = 5;
        boolean acertou = false;
        List Alternativas = new ArrayList();

        Alternativas.add("Tudo que está entre ( ) ");
        Alternativas.add("Tudo que está entre [ ] ");
        Alternativas.add("Tudo que está entre { } ");
        Alternativas.add("Tudo que está entre | | ");
        do {
            Collections.shuffle(Alternativas);

            System.out.println("========= 4 - Em Java, um bloco de código é: ==========\n");

            System.out.println("|a)" + Alternativas.get(0));

            System.out.println("|b)" + Alternativas.get(1));

            System.out.println("|c)" + Alternativas.get(2));

            System.out.println("|d)" + Alternativas.get(3));

            n = keyboard.next().toLowerCase();

            switch (n) {
                case "a":
                    if (Alternativas.get(0).equals("Tudo que está entre { } ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "b":
                    if (Alternativas.get(1).equals("Tudo que está entre { } ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "c":
                    if (Alternativas.get(2).equals("Tudo que está entre { } ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "d":
                    if (Alternativas.get(3).equals("Tudo que está entre { } ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
            }
            if (acertou == false) {
                casoIncorreta(tent);
                tent--;
            } else {
                System.out.println("Restam: " + tent + "tentativas");
            }
        } while (!acertou);
        if (acertou == true) {
            bonus = pontos(bonus);
        }
        quiz5(bonus);
        return bonus;
    }

    public static int quiz5(int bonus) {
        Scanner keyboard = new Scanner(System.in);
        String n = null;
        int tent = 5;
        boolean acertou = false;
        List Alternativas = new ArrayList();

        Alternativas.add("Um atributo ");
        Alternativas.add("Uma classe ");
        Alternativas.add("Uma outra instância ");
        Alternativas.add("Um método ");
        do {
            Collections.shuffle(Alternativas);

            System.out.println("========= 5 - Um objeto é uma instância de: ==========\n");

            System.out.println("|a)" + Alternativas.get(0));

            System.out.println("|b)" + Alternativas.get(1));

            System.out.println("|c)" + Alternativas.get(2));

            System.out.println("|d)" + Alternativas.get(3));

            n = keyboard.next().toLowerCase();

            switch (n) {
                case "a":
                    if (Alternativas.get(0).equals("Uma classe ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "b":
                    if (Alternativas.get(1).equals("Uma classe ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "c":
                    if (Alternativas.get(2).equals("Uma classe ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
                case "d":
                    if (Alternativas.get(3).equals("Uma classe ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
            }
            if (acertou == false) {
                casoIncorreta(tent);
                tent--;
            } else {
                System.out.println("Restam: " + tent + "tentativas");
            }

        } while (!acertou);
        if (acertou == true) {
            bonus = pontos(bonus);
        }
        quiz6(bonus);
        return bonus;
    }

    public static int quiz6(int bonus) {
        Scanner keyboard = new Scanner(System.in);
        String n = null;
        int tent = 5;
        boolean acertou = false;
        List Alternativas = new ArrayList();

        Alternativas.add("Derivada ");
        Alternativas.add("Elementar ");
        Alternativas.add("Primária ");
        Alternativas.add("Secundária ");
        do {
            Collections.shuffle(Alternativas);

            System.out.println("========= 6 - A classe herdada é chamada de classe? ==========\n");

            System.out.println("|a)" + Alternativas.get(0));

            System.out.println("|b)" + Alternativas.get(1));

            System.out.println("|c)" + Alternativas.get(2));

            System.out.println("|d)" + Alternativas.get(3));

            n = keyboard.next().toLowerCase();

            switch (n) {
                case "a":
                    if (Alternativas.get(0).equals("Derivada ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "b":
                    if (Alternativas.get(1).equals("Derivada ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "c":
                    if (Alternativas.get(2).equals("Derivada ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
                case "d":
                    if (Alternativas.get(3).equals("Derivada ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
            }
            if (acertou == false) {
                casoIncorreta(tent);
                tent--;
            } else {
                System.out.println("Restam: " + tent + "tentativas");
            }
        } while (!acertou);
        if (acertou == true) {
            bonus = pontos(bonus);
        }
        quiz7(bonus);
        return bonus;
    }

    public static int quiz7(int bonus) {
        Scanner keyboard = new Scanner(System.in);
        String n = null;
        int tent = 5;
        boolean acertou = false;
        List Alternativas = new ArrayList();

        Alternativas.add("for e wilhe ");
        Alternativas.add("for e switch ");
        Alternativas.add("if e switch ");
        Alternativas.add("if e for ");
        do {
            Collections.shuffle(Alternativas);

            System.out.println("========= 7 - Em linguagem Java são comandos para as Estruturas de Decisão: ==========\n");

            System.out.println("|a)" + Alternativas.get(0));

            System.out.println("|b)" + Alternativas.get(1));

            System.out.println("|c)" + Alternativas.get(2));

            System.out.println("|d)" + Alternativas.get(3));

            n = keyboard.next().toLowerCase();

            switch (n) {
                case "a":
                    if (Alternativas.get(0).equals("if e switch ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "b":
                    if (Alternativas.get(1).equals("if e switch ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "c":
                    if (Alternativas.get(2).equals("if e switch ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
                case "d":
                    if (Alternativas.get(3).equals("if e switch ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
            }
        } while (!acertou);
        if (acertou == true) {
            bonus = pontos(bonus);
        }
        quiz8(bonus);
        return bonus;
    }

    public static int quiz8(int bonus) {
        Scanner keyboard = new Scanner(System.in);
        String n = null;
        int tent = 5;
        boolean acertou = false;
        List Alternativas = new ArrayList();

        Alternativas.add("Identidade do objeto ");
        Alternativas.add("Funcionalidades do objeto ");
        Alternativas.add("Operações do objeto ");
        Alternativas.add("Características do objeto ");
        do {
            Collections.shuffle(Alternativas);

            System.out.println("========= 8 - Quando falamos em atributos estamos nos referindo a(s): ==========\n");

            System.out.println("|a)" + Alternativas.get(0));

            System.out.println("|b)" + Alternativas.get(1));

            System.out.println("|c)" + Alternativas.get(2));

            System.out.println("|d)" + Alternativas.get(3));

            n = keyboard.next().toLowerCase();

            switch (n) {
                case "a":
                    if (Alternativas.get(0).equals("Características do objeto ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "b":
                    if (Alternativas.get(1).equals("Características do objeto ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "c":
                    if (Alternativas.get(2).equals("Características do objeto ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
                case "d":
                    if (Alternativas.get(3).equals("Características do objeto ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
            }
            if (acertou == false) {
                casoIncorreta(tent);
                tent--;
            } else {
                System.out.println("Restam: " + tent + "tentativas");
            }
        } while (!acertou);
        if (acertou == true) {
            bonus = pontos(bonus);
        }
        quiz9(bonus);
        return bonus;
    }

    public static int quiz9(int bonus) {
        Scanner keyboard = new Scanner(System.in);
        String n = null;
        int tent = 5;
        boolean acertou = false;
        List Alternativas = new ArrayList();
        
        Alternativas.add("Erro em tempo de execução. ");
        Alternativas.add("Soma: '19' ");
        Alternativas.add("O código não compila. ");
        Alternativas.add("Soma: '910' ");
        
        do {
            Collections.shuffle(Alternativas);

            System.out.println("========= 9 - Analise o código Java e Marque a alternativa que representa o valor impresso: ==========\n");

            System.out.println("public class Classe { ");
            System.out.println("public static void main(String[] args){");
            System.out.println("String i = '9'; ");
            System.out.println("String x = '10'; ");
            System.out.println("System.out.println(Soma: + i + x); }\n} ");
            System.out.println("n = j+i; ");

            System.out.println("|a)" + Alternativas.get(0));

            System.out.println("|b)" + Alternativas.get(1));

            System.out.println("|c)" + Alternativas.get(2));

            System.out.println("|d)" + Alternativas.get(3));

            n = keyboard.next().toLowerCase();

            switch (n) {
                case "a":
                    if (Alternativas.get(0).equals("Soma: '910' ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "b":
                    if (Alternativas.get(1).equals("Soma: '910' ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "c":
                    if (Alternativas.get(2).equals("Soma: '910' ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
                case "d":
                    if (Alternativas.get(3).equals("Soma: '910' ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
            }
            if (acertou == false) {
                casoIncorreta(tent);
                tent--;
            } else {
                System.out.println("Restam: " + tent + "tentativas");
            }
        } while (!acertou);
        if (acertou == true) {
            bonus = pontos(bonus);
        }
        quiz10(bonus);
        return bonus;
    }

    public static int quiz10(int bonus) {
        Scanner keyboard = new Scanner(System.in);
        String n = null;
        int tent = 5;
        boolean acertou = false;
        List Alternativas = new ArrayList();
        
        Alternativas.add("0 ");
        Alternativas.add("4 ");
        Alternativas.add("2 ");
        Alternativas.add("3 ");
        
        do {
            Collections.shuffle(Alternativas);

            System.out.println("========= 10 - Analise o código Java e Marque a alternativa que representa o valor impresso: ==========\n");

            System.out.println("public class Classe { ");
            System.out.println("public static void main(String[] args){");
            System.out.println("int i=2, j=8, n; ");
            System.out.println("System.out.println(n); } \n} ");
            System.out.println("n = j%i; ");
            System.out.println("|a)" + Alternativas.get(0));

            System.out.println("|b)" + Alternativas.get(1));

            System.out.println("|c)" + Alternativas.get(2));

            System.out.println("|d)" + Alternativas.get(3));

            n = keyboard.next().toLowerCase();

            switch (n) {
                case "a":
                    if (Alternativas.get(0).equals("0 ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "b":
                    if (Alternativas.get(1).equals("0 ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;

                case "c":
                    if (Alternativas.get(2).equals("0 ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
                case "d":
                    if (Alternativas.get(3).equals("0 ")) {
                        System.out.println("Resposta Correta");
                        acertou = true;
                    }
                    break;
            }
            if (acertou == false) {
                casoIncorreta(tent);
                tent--;
            } else {
                System.out.println("Restam: " + tent + "tentativas");
            }
        } while (!acertou);
        if (acertou == true) {
            bonus = pontos(bonus);
        }
        jogofinalizado(bonus);
        return bonus;
    }

    public static void jogofinalizado(int bonus) {
        System.out.println("A sua pontuação máxima foi de " + bonus + " pontos");
        System.out.println("Meus Parabéns, você chegou no ápice da carreira");
        System.out.println("Você concluiu o jogo\n");
    }
}
