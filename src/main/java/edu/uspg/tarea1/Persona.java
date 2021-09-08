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
public class Persona { 
    //Atributos
    private String nombres;
    private String apellidos;
    private String fechadeNacimiento;
    private int dpi;
    private String genero;
    private String direccion;
    private String telefono;
    
    //Comportamiento
    //Constructores
    public Persona (){}
    
    public Persona(String nombres, String apellidos){
        
        this.nombres = nombres;
        this.apellidos = apellidos;
        
}
    
    
    Persona (String nombres, String apellidos, String fechadeNacimiento,
            int dpi, String genero, String direccion, String telefono){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dpi = dpi;
        this.genero = genero;
        this.fechadeNacimiento = fechadeNacimiento;
        this.telefono = telefono;
        
                
        
    }

    public void saludar(){
        System.out.println("Hola a todos me llamo:" +
                this.apellidos+ " " +
                this.nombres);
        
        
    
        
                
    }
    public void getdatos(){
        System.out.println("nombres:\t" + this.nombres + 
                "\napellidos:\t" + this.apellidos +
                "\nFecha de nacimiento:\t" + this.fechadeNacimiento +
                "\nDPI:\t" + this.dpi + 
                "\nGenero:\t" + this.genero +
                "\nTelefono:\t" + this.telefono +
                "\nDireccion:\t" + this.direccion);
        
    }
    
     
    
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(String fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
    
    

