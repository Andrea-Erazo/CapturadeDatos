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
public class Cliente {
    private String nombredelCliente;
    private String direccion;
    private String gmail;
    private int tarjetadeCredito;
    private int saldodelaCuenta;
    
    
    public Cliente(){}

    public Cliente(String nombredelCliente, String direccion, String gmail, int tarjetadeCredito,
            int saldodelaCuenta) {
        this.nombredelCliente = nombredelCliente;
        this.direccion = direccion;
        this.gmail = gmail;
        this.tarjetadeCredito = tarjetadeCredito;
        this.saldodelaCuenta = saldodelaCuenta;
    }
    
    public void FormadePago(){
        System.out.println("Yo voy a pagar con:" + this.tarjetadeCredito);}
    
    
    public void getdatos3(){
        System.out.println("Nombre del Cliente:\t" + this.nombredelCliente +
                "\nDireccion:" + this.direccion +
                "\nGmail:" + this.gmail +
                "\nTarjeta de Credito:" + this.tarjetadeCredito +
                "\nSaldo de la Cuenta:" + this.saldodelaCuenta);
                
                 
    }


    public String getNombredelCliente() {
        return nombredelCliente;
    }

    public void setNombredelCliente(String nombredelCliente) {
        this.nombredelCliente = nombredelCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getTarjetadeCredito() {
        return tarjetadeCredito;
    }

    public void setTarjetadeCredito(int tarjetadeCredito) {
        this.tarjetadeCredito = tarjetadeCredito;
    }

    public int getSaldodelaCuenta() {
        return saldodelaCuenta;
    }

    public void setSaldodelaCuenta(int saldodelaCuenta) {
        this.saldodelaCuenta = saldodelaCuenta;
    }
    
    
    
    
    
}