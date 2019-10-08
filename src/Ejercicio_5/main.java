/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5;

import Ejercicio_6.Prestamo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class main {

    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        System.out.println("BIENVENIDO Al SISTEMA DE CADUCIDAD");
        while (true) {
            System.out.println("============================================");
            System.out.println("MENÚ DE OPCIONES:");
            System.out.println("1=ingresar nuevo producto");
            System.out.println("0=salir");
            System.out.print("Eliga una opción:");
            int opcion = leerTeclado.nextInt();
            System.out.println("============================================");
            if (opcion == 1) {
                ProductoLG nuevo_producto = new ProductoLG();
                System.out.print("Ingrese el nombre del producto:");
                nuevo_producto.setNombre(leerTeclado.next());
                System.out.print("Ingrese el precio del producto:");
                nuevo_producto.setPrecio(leerTeclado.nextDouble());
                Date fecha_vencimiento;
                while (true) {
                    try {
                        System.out.print("Ingrese la fecha de vencimiento del producto(dd/MM/yyyy):");
                        fecha_vencimiento = new SimpleDateFormat("dd/MM/yyyy").parse(leerTeclado.next());
                        break;
                    } catch (ParseException ex) {
                        System.err.println("Formato inválido intente de nuevo. Error:"+ex.getMessage());
                    }
                }
                nuevo_producto.setFecha_de_vencimiento(fecha_vencimiento);
                Date fecha_actual = new Date();
                if (fecha_actual.before(nuevo_producto.getFecha_de_vencimiento())){
                    System.out.println("El producto aún no esá vencido.");
                }else{
                    System.out.println("EL producto está vencido.");
                }
            }
        }
    }
}
