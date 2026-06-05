package com.example.universidadeESN3.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cabecalho cabecalho = new Cabecalho();
        cabecalho.mostrarCabecalho();

        ArrayList<Questao> questoes = new ArrayList<>();

        Questao q1 = new Questao();
        q1.pergunta = "1) O que significa POO?";
        q1.opcaoA = "Programacao Orientada a Objetos";
        q1.opcaoB = "Programa Organizado Online";
        q1.opcaoC = "Processo Operacional Obrigatorio";
        q1.opcaoD = "Projeto Operacional Oficial";
        q1.opcaoE = "Programacao Online de Objetos";
        q1.correta = "A";
        questoes.add(q1);

        Questao q2 = new Questao();
        q2.pergunta = "2) Em Java, qual palavra-chave e usada para criar uma classe?";
        q2.opcaoA = "method";
        q2.opcaoB = "class";
        q2.opcaoC = "object";
        q2.opcaoD = "new";
        q2.opcaoE = "package";
        q2.correta = "B";
        questoes.add(q2);

        Questao q3 = new Questao();
        q3.pergunta = "3) Qual palavra-chave e usada para criar um objeto em Java?";
        q3.opcaoA = "create";
        q3.opcaoB = "make";
        q3.opcaoC = "new";
        q3.opcaoD = "object";
        q3.opcaoE = "start";
        q3.correta = "C";
        questoes.add(q3);

        Questao q4 = new Questao();
        q4.pergunta = "4) O que e um atributo em uma classe?";
        q4.opcaoA = "Uma acao do objeto";
        q4.opcaoB = "Uma caracteristica ou dado do objeto";
        q4.opcaoC = "Um erro de compilacao";
        q4.opcaoD = "Um comando de repeticao";
        q4.opcaoE = "Uma biblioteca";
        q4.correta = "B";
        questoes.add(q4);

        Questao q5 = new Questao();
        q5.pergunta = "5) O que e um metodo em Java?";
        q5.opcaoA = "Uma acao ou comportamento de uma classe";
        q5.opcaoB = "Uma pasta do projeto";
        q5.opcaoC = "Um tipo de variavel";
        q5.opcaoD = "Um erro do sistema";
        q5.opcaoE = "Um arquivo do Maven";
        q5.correta = "A";
        questoes.add(q5);

        Questao q6 = new Questao();
        q6.pergunta = "6) Qual tipo de dado armazena numeros inteiros em Java?";
        q6.opcaoA = "String";
        q6.opcaoB = "double";
        q6.opcaoC = "boolean";
        q6.opcaoD = "int";
        q6.opcaoE = "char";
        q6.correta = "D";
        questoes.add(q6);

        Questao q7 = new Questao();
        q7.pergunta = "7) Qual tipo de dado armazena textos em Java?";
        q7.opcaoA = "int";
        q7.opcaoB = "String";
        q7.opcaoC = "double";
        q7.opcaoD = "boolean";
        q7.opcaoE = "float";
        q7.correta = "B";
        questoes.add(q7);

        Questao q8 = new Questao();
        q8.pergunta = "8) Qual operador e usado para comparar igualdade em Java?";
        q8.opcaoA = "=";
        q8.opcaoB = "!=";
        q8.opcaoC = "==";
        q8.opcaoD = ">=";
        q8.opcaoE = "<=";
        q8.correta = "C";
        questoes.add(q8);

        Questao q9 = new Questao();
        q9.pergunta = "9) Qual estrutura e usada para repetir comandos?";
        q9.opcaoA = "if";
        q9.opcaoB = "else";
        q9.opcaoC = "for";
        q9.opcaoD = "class";
        q9.opcaoE = "package";
        q9.correta = "C";
        questoes.add(q9);

        Questao q10 = new Questao();
        q10.pergunta = "10) Qual estrutura e usada para tomar decisoes no codigo?";
        q10.opcaoA = "if";
        q10.opcaoB = "print";
        q10.opcaoC = "import";
        q10.opcaoD = "new";
        q10.opcaoE = "static";
        q10.correta = "A";
        questoes.add(q10);

        Questao q11 = new Questao();
        q11.pergunta = "11) O que e encapsulamento em POO?";
        q11.opcaoA = "Apagar todos os dados";
        q11.opcaoB = "Proteger atributos e controlar o acesso a eles";
        q11.opcaoC = "Criar apenas metodos publicos";
        q11.opcaoD = "Transformar codigo em imagem";
        q11.opcaoE = "Executar o programa automaticamente";
        q11.correta = "B";
        questoes.add(q11);

        Questao q12 = new Questao();
        q12.pergunta = "12) Qual palavra-chave indica heranca em Java?";
        q12.opcaoA = "implements";
        q12.opcaoB = "inherits";
        q12.opcaoC = "extends";
        q12.opcaoD = "superclass";
        q12.opcaoE = "instance";
        q12.correta = "C";
        questoes.add(q12);

        Questao q13 = new Questao();
        q13.pergunta = "13) O que e um construtor?";
        q13.opcaoA = "Um metodo especial usado para inicializar objetos";
        q13.opcaoB = "Um tipo de loop";
        q13.opcaoC = "Um arquivo do Windows";
        q13.opcaoD = "Uma variavel constante";
        q13.opcaoE = "Um comando de impressao";
        q13.correta = "A";
        questoes.add(q13);

        Questao q14 = new Questao();
        q14.pergunta = "14) Qual comando imprime uma mensagem no console em Java?";
        q14.opcaoA = "Console.WriteLine";
        q14.opcaoB = "print.console";
        q14.opcaoC = "System.out.println";
        q14.opcaoD = "echo";
        q14.opcaoE = "display";
        q14.correta = "C";
        questoes.add(q14);

        Questao q15 = new Questao();
        q15.pergunta = "15) O que e um objeto em POO?";
        q15.opcaoA = "Uma copia da linguagem Java";
        q15.opcaoB = "Uma instancia de uma classe";
        q15.opcaoC = "Um erro do sistema";
        q15.opcaoD = "Um arquivo executavel";
        q15.opcaoE = "Uma biblioteca";
        q15.correta = "B";
        questoes.add(q15);

        int acertos = 0;

        for (Questao questao : questoes) {
            boolean acertou = questao.escreverQuestao(scanner);

            if (acertou) {
                acertos++;
            }
        }

        int totalQuestoes = questoes.size();
        double mediaAcerto = (acertos * 100.0) / totalQuestoes;

        System.out.println("==============================================");
        System.out.println("Resultado final");
        System.out.println("Questoes corretas: " + acertos + " de " + totalQuestoes);
        System.out.printf("Media de acerto: %.2f%%\n", mediaAcerto);
        System.out.println("Obrigado por participar do quiz!");
        System.out.println("==============================================");

        scanner.close();
    }
}