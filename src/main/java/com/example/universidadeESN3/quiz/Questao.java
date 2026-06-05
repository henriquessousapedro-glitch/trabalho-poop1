package com.example.universidadeESN3.quiz;

import java.util.Scanner;

public class Questao {

    String pergunta;
    String opcaoA;
    String opcaoB;
    String opcaoC;
    String opcaoD;
    String opcaoE;
    String correta;

    public boolean escreverQuestao(Scanner scanner) {
        System.out.println(pergunta);
        System.out.println("A) " + opcaoA);
        System.out.println("B) " + opcaoB);
        System.out.println("C) " + opcaoC);
        System.out.println("D) " + opcaoD);
        System.out.println("E) " + opcaoE);
        System.out.print("Digite sua resposta: ");

        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase(correta)) {
            System.out.println("Resposta correta!");
            System.out.println();
            return true;
        } else {
            System.out.println("Resposta incorreta!");
            System.out.println("Resposta correta: " + correta);
            System.out.println();
            return false;
        }
    }
}