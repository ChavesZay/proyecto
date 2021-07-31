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
public class CommandPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stock abcStock = new Stock();

      ComprarStock comprar = new ComprarStock(abcStock);
      VenderStock vender = new VenderStock(abcStock);

      Broker broker = new Broker();
      broker.tomarOrden(comprar);
      broker.tomarOrden(vender);

      broker.placeOrders();
    }
    
}
