package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
         System.out.println("Boas vindas");

        Scanner cadastro = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String name = cadastro.nextLine();
        System.out.println("É um prazer conhecê-lo " + name);
        System.out.println("Qual sua idade?");
        int age = cadastro.nextInt();
        int birthdate = 2021 - age;
        System.out.println(name);
        System.out.println("Você nasceu no ano " + birthdate);

        System.out.println("Olá, sou uma calculadora!");
        System.out.println("Digite um número: ");
        int number1 = cadastro.nextInt();
        System.out.println("Digite outro número: ");
        int number2 = cadastro.nextInt();
        int soma = number1 + number2;
        int menos = number1 - number2;
        int vezes = number1 * number2;
        int punição = number1 + number2 + age;

        System.out.println(punição);
        System.out.println(soma);
        System.out.println(menos);
        System.out.println(vezes);

    }
}

