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
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner (System.in);
        double prom;
        System.out.println("Primer Número: ");
        int n1=entrada.nextInt();
        System.out.println("Segundo Número: ");
        int n2=entrada.nextInt();
        System.out.println("Tercero Número: ");
        int n3=entrada.nextInt();
        System.out.println("Cuarto Número: ");
        int n4=entrada.nextInt();
        System.out.println("Quinto Número: ");
        int n5=entrada.nextInt();
        
        int menor=n1;
        
        if(menor>n2);{
            menor=n2;}
        if(menor>n3);{
            menor=n3;}
        if(menor>n4){
            menor=n4;}
        if(menor>n5){
            menor=n5;}
        prom=(n1+n2+n3+n4+n5-menor)/4;
        System.out.println("El promedio de las 4 máximas notas es: "+prom);
    }
}

    

    

