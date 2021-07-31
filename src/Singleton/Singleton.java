/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Zaylin
 */
public class Singleton {
    
    private static Singleton instancia=new Singleton();
     private int id;
     private String nombre;
     
    
    private Singleton() {
        this.id=231156271;
        this.nombre="VRA425jd";
    }
    public static Singleton getInstancia(){
        if(instancia==null){
            instancia=new Singleton();
        }
        return instancia;
    }
    public void conectar(){
        System.out.println("El dispositivo, Nombre: "+this.nombre+" ID: "+this.id+" se "
                + "conecto a la BD");
    }
    public void desconectar(){
        System.out.println("El dispositivo,  Nombre: "+this.nombre+" ID: "+this.id+" se "
                + "desconecto a la BD");
    }
    
}
