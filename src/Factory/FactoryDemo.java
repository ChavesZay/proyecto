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
public class FactoryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaFigurasGeo fig = new FabricaFigurasGeo();
        FigurasGeo fig1=fig.getFiguraGeo("circulo");
        FigurasGeo fig2=fig.getFiguraGeo("cuadrado");
        FigurasGeo fig3=fig.getFiguraGeo("rectangulo");
        fig1.numLados();
        fig2.numLados();
        fig3.numLados();
        
    }
    
}
