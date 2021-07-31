/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command1.Stock;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zaylin
 */
public class Broker {
    private List<Orden>ordenList= new ArrayList<Orden>();
    public void tomarOrden(Orden orden){
        ordenList.add(orden);
    }
    public void placeOrders(){
 
      for (Orden orden : ordenList) {
         orden.execute();
      }
      ordenList.clear();
   }
}
