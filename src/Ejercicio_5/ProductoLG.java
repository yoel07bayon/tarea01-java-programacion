/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5;

import java.util.Date;
import sun.util.calendar.LocalGregorianCalendar;

/**
 *
 * @author Usuario
 */
public class ProductoLG {
    private String nombre;
    private double precio;
    private Date fecha_de_vencimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha_de_vencimiento() {
        return fecha_de_vencimiento;
    }

    public void setFecha_de_vencimiento(Date fecha_de_vencimiento) {
        this.fecha_de_vencimiento = fecha_de_vencimiento;
    }
}
