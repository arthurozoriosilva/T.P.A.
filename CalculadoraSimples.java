/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arthurozoriosilva1dsams.calculadorasimples;

/**
 *
 * @author Arthur
 */
import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        string soma = "soma";
        Scanner scanner = new Scanner(System.in);
        //escolher qual operação realizar
        System.out.print("Digitxxxxxxxe qual operação você deseja realizar(soma, subtração, multiplicação ou divisão):");
        String operacao = scanner.nextLine();
        System.out.print(operacao);
        //inserindo os números
        System.out.print("Digite um numero:");
        int num1 = scanner.nextInt();
        System.out.print("Digite ou tro numero:");
        int num2 = scanner.nextInt();
        System.out.println("xxx");
        if(operacao == 'soma') { 
            System.out.println(num1 + num2+"alt");
        }else if(operacao == "subtração"){
            System.out.println((num1 - num2)+"Sun");
        }else if(operacao == "multiplicação"){
            System.out.println((num1 * num2)+"MU");
        }else {System.out.println((num1 / num2)+ "div" );
        }
    }
}
