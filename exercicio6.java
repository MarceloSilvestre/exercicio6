//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

import java.util.Scanner;

public class exercicio6 {
    public static void main (String[] args){
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("informe o raio do circulo ");
        double raio = teclado.nextDouble();

        teclado.close();

        //area do circulo é igual a "pi" * raio ao quadrado "pi"= 3,14

        double area = 3.14 * raio * raio;

        System.out.println("a área do circulo é " + area);




    }
}
