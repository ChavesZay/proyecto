/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Zaylin
 */
public class CuentaAhorro implements ICuenta{
    private String tipo;
    private double monto;

    public CuentaAhorro() {
        this.tipo = "AHORRO";
        this.monto=0;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public ICuenta clonar() {
        CuentaAhorro cuenta=null;
        try{
            cuenta=(CuentaAhorro) clone();
        }catch(Exception e){
        }
        return cuenta;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "tipo=" + tipo + ", monto=" + monto + '}';
    }
}
