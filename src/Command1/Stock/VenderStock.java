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
public class VenderStock implements Orden{
     private Stock abcStock;

    public VenderStock(Stock abcStock) {
        this.abcStock = abcStock;
    }
    
    @Override
    public void execute() {
        abcStock.vender();
    }
}
