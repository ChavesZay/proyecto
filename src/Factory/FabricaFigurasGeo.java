/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Zaylin
 */
public class FabricaFigurasGeo {
    public FigurasGeo getFiguraGeo(String tipoFigura){
        if(tipoFigura == null){
         return null;
      }		
      if(tipoFigura.equalsIgnoreCase("circulo")){
         return new Circulo();
         
      } else if(tipoFigura.equalsIgnoreCase("rectangulo")){
         return new Rectangulo();
         
      } else if(tipoFigura.equalsIgnoreCase("cuadrado")){
         return new Cuadrado();
      }
      
      return null;
    }
}
