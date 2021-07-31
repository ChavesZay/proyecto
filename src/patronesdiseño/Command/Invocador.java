/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdiseño.Command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zaylin
 */
public class Invocador {
     private List<IOperacion> operaciones=new ArrayList<IOperacion>();
    
    public void recibirOperacion(IOperacion operacion){
        this.operaciones.add(operacion);
    }
    public void realizarOperacion(){
        for (IOperacion orden : operaciones) {
         orden.execute();
      }
        
        this.operaciones.clear();
    }
}
