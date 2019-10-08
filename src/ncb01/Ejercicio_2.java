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
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scv = new Scanner(System.in);
        System.out.println("Primer Número: ");
        int n1=scv.nextInt();
        System.out.println("Segundo Número: ");
        int n2=scv.nextInt();
        System.out.println("Tercero Número: ");
        int n3=scv.nextInt();
        
        int mayor=n1;
        int menor=n1;
        
        if(mayor>n2){
            mayor=n2;}
        if(mayor>n3){
            mayor=n3;}
        if(menor<n2){
            menor=n2;}
        if(menor<n3){
            menor=n3;}
        
        int Respos = mayor;
        int Resneg = menor;
        
        System.out.println("Mayor: "+Respos);
        System.out.println("Menor: "+Resneg);
    }
    
}


