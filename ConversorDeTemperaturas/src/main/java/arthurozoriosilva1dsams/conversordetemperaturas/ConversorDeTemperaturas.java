/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arthurozoriosilva1dsams.conversordetemperaturas;

/**
 *
 * @author Arthur
 */
import java.util.Scanner;
public class ConversorDeTemperaturas {

    public static void main(String[] args) {
        float C = 0;
        float F = 0;
        float K = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a tempratura em Celsius:");
        C = scanner.nextFloat();
        
        System.out.println("fahrenheit=" + (C*1.8+32));
        System.out.println("Kelvin=" + (C+273.15));
    }
}
