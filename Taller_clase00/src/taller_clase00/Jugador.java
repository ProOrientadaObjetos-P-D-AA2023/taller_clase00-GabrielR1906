/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_clase00;

/**
 *
 * @author renat
 */
public class Jugador {
    private int cedula;
    private String nombre;
    private String apellido;
    private int edad;
    
    public Jugador(int cedula, String nombre, String apellido, int edad){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public int getCedula(){
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public void caminar(){
        System.out.println("camina");
    }
    
    public void correr(){
        System.out.println("corre");
    }
    
    public void viajar(){
        System.out.println("viajar");
    }
}
