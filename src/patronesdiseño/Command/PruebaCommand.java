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
public class PruebaCommand {
    
    public static void main(String[] args) {
   Cuenta cuenta=new Cuenta(1,200);
   
   DepositarImp opDepositar= new DepositarImp(cuenta, 100);
   RetirarImp opRetirar= new  RetirarImp (cuenta, 50);
   
   Invocador  i= new  Invocador ();
   i.recibirOperacion(opDepositar);
   i.recibirOperacion(opRetirar);
   i.realizarOperacion();
   
    }
   
}