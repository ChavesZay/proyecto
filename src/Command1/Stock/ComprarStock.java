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
    public class ComprarStock implements Orden{
    private Stock abcStock;

    public ComprarStock(Stock abcStock) {
        this.abcStock = abcStock;
    }
    
    @Override
    public void execute() {
        abcStock.comprar();
    }
}
