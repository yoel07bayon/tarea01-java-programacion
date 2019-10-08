/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class main {

    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        ArrayList<Prestamo> prestamos = new ArrayList();
        System.out.println("BIENVENIDO A LA TIENDA DE PRESTAMOS");
        while (true) {
            System.out.println("============================================");
            System.out.println("MENÚ DE OPCIONES:");
            System.out.println("1=ingresar nuevo prestamo");
            System.out.println("2=mostrar reporte");
            System.out.println("0=salir");
            System.out.print("Eliga una opción:");
            int opcion = leerTeclado.nextInt();
            System.out.println("============================================");
            if (opcion == 1) {
                System.out.println("============================================");
                System.out.println("NUEVO PRESTAMO:");
                Prestamo prestamo = new Prestamo();
                System.out.print("Ingrese el día(0=domingo,1=lunes,2=martes,3=miercoles,4=jueves,5=viernes,6=sabado):");
                prestamo.setDia(leerTeclado.nextInt());
                System.out.print("Ingrese el nombre del prestamo:");
                prestamo.setNombre(leerTeclado.next());
                System.out.print("Ingrese la cantidad:");
                prestamo.setCantidad(leerTeclado.nextInt());
                prestamos.add(prestamo);
                System.out.println("============================================");
            } else if (opcion == 2) {
                System.out.println("============================================");
                System.out.println("REPORTE POR DÍA:");
                int[] cantidad_prestamos_dia = new int[7];
                String[] dias = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado"};

                for (Prestamo prestamo : prestamos) {
                    cantidad_prestamos_dia[prestamo.getDia()] = cantidad_prestamos_dia[prestamo.getDia()] + prestamo.getCantidad();
                }
                for (int i = 0; i < cantidad_prestamos_dia.length; i++) {
                    System.out.println(String.valueOf(i)+". "+dias[i] + "=" + String.valueOf(cantidad_prestamos_dia[i]));
                }
                System.out.println("============================================");
            } else if (opcion == 0) {
                break;
            }

        }

    }
}
