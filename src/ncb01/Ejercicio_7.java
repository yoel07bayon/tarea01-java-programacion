/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncb01;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_7 {
    public static void main(String[] ARGS)
	{
		Scanner obtener = new Scanner(System.in);
		int estudiantes,i,edadMayor,edadMenor,edad,sumaedad;
 
		System.out.print("Ingrese la cantidad de estudiantes: ");
		estudiantes = obtener.nextInt();
 
		edadMayor = 0;
		edadMenor = 100;
		sumaedad = 0;
 
 
		for(i = 1; i <= estudiantes; i++)
		{
			System.out.print("Ingrese la nota para el estudiante: " + i + " : ");
		  edad = obtener.nextInt();
 
			sumaedad = sumaedad + edad;
			if(edad > edadMayor)
			{
				edadMayor=edad;
			}
			if(edad < edadMenor)
			{
				edadMenor=edad;
			}
		}
 
		System.out.print("La nota mayor es: " + edadMayor + "\n");
		System.out.print("La nota menor es: " + edadMenor + "\n");
 
		DecimalFormat df = new DecimalFormat("#.00");
 
		System.out.print("El promedio es: " + df.format((double)sumaedad/estudiantes) + "\n");
	}
}

