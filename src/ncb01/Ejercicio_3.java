/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncb01;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double H, suma;
        System.out.println("Cateto Opuesto: ");
        int CO=entrada.nextInt();
        System.out.println("Cateto adyacente: ");
        int CA=entrada.nextInt();
        suma=(CO*CO)+(CA*CA);
        H=Math.sqrt(suma);
        System.out.println("La Hipotenusa del angulo cuyos catetos "+CO+" y "+CA+" es: "+H);
    }
}

