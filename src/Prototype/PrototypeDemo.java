/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Zaylin
 */
public class PrototypeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaAhorro cAhorro=new CuentaAhorro();
        cAhorro.setMonto(500);
        CuentaAhorro cClonada=(CuentaAhorro) cAhorro.clonar();
        System.out.println(cAhorro);
        if(cClonada!=null){
            System.out.println(cClonada);
        }
        
        // falso porq tiene los mismos valores, pero tiene diferente espacio en la memoria
        System.out.println(cAhorro==cClonada);
    }
    
}
