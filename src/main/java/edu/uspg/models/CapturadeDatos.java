/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg.models;

import edu.uspg.tarea1.Cliente;
import edu.uspg.tarea1.Persona;
import edu.uspg.tarea1.Vehiculo;
import edu.uspg.tarea1.Ventas;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CapturadeDatos {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner (System.in);
   
    public static void main(String[] args) {
        Persona persona = new Persona (); 
        
        System.out.println("============================================");
        System.out.println("Ingrese nombres:");
        persona.setNombres(sc.next());
        
        System.out.println("Ingrese apellidos:");
        persona.setApellidos(sc.next());
        
        System.out.println("Ingrese Fecha de Nacimiento:");
        persona.setFechadeNacimiento(sc.next());
        
        System.out.println("Ingrese dpi:");
        persona.setDpi(sc.nextInt());
        
        System.out.println("Ingrese genero (H) hombre, (M) mujer:");
        persona.setGenero(sc.next());
        
        System.out.println("Ingrese telefono:");
        persona.setTelefono(sc.next());
        
        System.out.println("Ingrese direcion:");
        persona.setDireccion(sc.next());
        
        persona.getdatos();
        
       Vehiculo vehiculo = new Vehiculo ();
       
        System.out.println("============================================");
        
        System.out.println("Ingrese Placa de auto:");
        vehiculo.setPlaca(sc.next());
        
         System.out.println("Ingrese color de auto:");
        vehiculo.setColor(sc.next());
        
         System.out.println("Ingrese Seguro de auto:");
        vehiculo.setSegurodeAuto(sc.next());
        
         System.out.println("Ingrese modelo de auto:");
        vehiculo.setModelo(sc.next());
        
         System.out.println("Ingrese Tipo de auto:");
        vehiculo.setTipodeAuto(sc.next());
        
         System.out.println("Ingrese motor de auto:");
        vehiculo.setMotor(sc.next());
        
        
        vehiculo.getdatos2();
        
        Cliente cliente = new Cliente (); 
        
          System.out.println("============================================");
        
        System.out.println("Ingrese Nombre del cliente:");
        cliente.setNombredelCliente(sc.next());
        
         System.out.println("Ingrese Direccion:");
        cliente.setDireccion(sc.next());
        
         System.out.println("Ingrese Gmail:");
        cliente.setGmail(sc.next());
        
         System.out.println("Ingrese Tarjeta de Credito:");
        cliente.setTarjetadeCredito(sc.nextInt());
        
         System.out.println("Ingrese Saldo de Cuenta:");
        cliente.setSaldodelaCuenta(sc.nextInt());
        
         
        cliente.getdatos3();    
         vehiculo.getdatos2();
        
        Ventas ventas = new Ventas (); 
        
          System.out.println("============================================");
        
        System.out.println("Ingrese Vehiculo:");
        ventas.setVehiculo(sc.next());
        
         System.out.println("Ingrese Cantidad:");
        ventas.setCantidad(sc.nextInt());
        
         System.out.println("Ingrese fecha:");
        ventas.setFecha(sc.next());
        
         System.out.println("Ingrese refernecia:");
        ventas.setReferencia(sc.next());
        
        ventas.getdatos4();
       
       
        
    }
    
}
