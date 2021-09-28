/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg.tarea1;

/**
 *
 * @author Usuario
 */
public class Ventas {
    //Atributos
    private String vehiculo;
    private int cantidad;
    private String fecha;
    private String referencia;
    
    
    public Ventas(){} 

    public Ventas(String vehiculo, int cantidad, String fecha, String referencia) {
        this.vehiculo = vehiculo;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.referencia = referencia;
    }
    
    
    public void Compra(){
        System.out.println("Quiero que me registren un aunto ultimo modelo" + this.vehiculo);
    }
    
    public void getdatos4(){
        System.out.println("Vehiculo:\t" + this.vehiculo +
                "\nCantidad:\t" + this.cantidad +
                "\nfecha:\t" + this.fecha +
                "\nreferencia:\t" + this.referencia);
                
        
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    
    
    
}
