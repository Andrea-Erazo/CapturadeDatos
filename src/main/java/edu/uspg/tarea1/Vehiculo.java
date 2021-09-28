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
public class Vehiculo {
    private String placa;
    private String color;
    private String segurodeAuto;
    private String modelo;
    private String tipodeAuto;
    private String motor;
    
    
    
    public Vehiculo(){}
    
  
    public Vehiculo(String placa, String color, String segurodeAuto, String modelo, 
            String tipodeAuto, String motor) {
        this.placa = placa;
        this.color = color;
        this.segurodeAuto = segurodeAuto;
        this.modelo = modelo;
        this.tipodeAuto = tipodeAuto;
        this.motor = motor;
    }
    
    
    public void Arrancar(){
        System.out.println("run run run");
       
    }
    
    public void Acelerar(){
        System.out.println("aceleracion 50km/h");
    }
    
    public void getdatos2(){
            System.out.println("Placa:\t" + this.placa + 
                "\nColor:\t" + this.color +
                "\nSegurodeAuto:\t" + this.segurodeAuto +
                "\nModelo:\t" + this.modelo + 
                "\nTipo de Auto:\t" + this.tipodeAuto+
                "\nMotor:\t" + this.motor );
                
    
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSegurodeAuto() {
        return segurodeAuto;
    }

    public void setSegurodeAuto(String segurodeAuto) {
        this.segurodeAuto = segurodeAuto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipodeAuto() {
        return tipodeAuto;
    }

    public void setTipodeAuto(String tipodeAuto) {
        this.tipodeAuto = tipodeAuto;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    
    
    
    
    
    
}
