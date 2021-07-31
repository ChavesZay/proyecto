/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command1.Stock;

/**
 *
 * @author Zaylin
 */
public class Stock {
   private String nombre="ARROZ";
   private int cantidad =10;
   
   public void comprar(){
       System.out.println("Stock[Nombre: "+nombre+", Cantidad"+cantidad+"]bought");
   }
   public void vender(){
       System.out.println("Stock[Nombre: "+nombre+", Cantidad"+cantidad+"]sold");
   }
}
   
