/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class Tabuada {

    public static void main(String[] args) {
        //Publicando as variáveis
        int num = 0;
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        int x5 = 0;
        int x6 = 0;
        int x7 = 0;
        int x8 = 0;
        int x9 = 0;
        int x10 = 0;
        Scanner scanner = new Scanner(System.in);//Abrindo o scanner
        //inserindo um valor para a variável
        System.out.print("Digite um número:");
        num = scanner.nextInt();
        //calculando a tabuada
        x1 = num*1;
        x2 = num*2;
        x3 = num*3;
        x4 = num*4;
        x5 = num*5;
        x6 = num*6;
        x7 = num*7;
        x8 = num*8;
        x9 = num*9;
        x10 = num*10;
        //Mostrando a tabuada
        System.out.println(num+" x "+1+" = "+x1);
        System.out.println(num+" x "+2+" = "+x2);
        System.out.println(num+" x "+3+" = "+x3);
        System.out.println(num+" x "+4+" = "+x4);
        System.out.println(num+" x "+5+" = "+x5);
        System.out.println(num+" x "+6+" = "+x6);
        System.out.println(num+" x "+7+" = "+x7);
        System.out.println(num+" x "+8+" = "+x8);
        System.out.println(num+" x "+9+" = "+x9);
        System.out.println(num+" x "+10+" = "+x10);
        scanner.close();//Fechando o scanner
    }
}
