/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdiseño.Command;

/**
 *
 * @author Zaylin
 */
public class RetirarImp implements IOperacion{
    
    private Cuenta cuenta;
    private double monto;
    
    public RetirarImp(Cuenta cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }
   
    @Override
    public void execute() {
        this.cuenta.retirar(this.monto);
    }
}
