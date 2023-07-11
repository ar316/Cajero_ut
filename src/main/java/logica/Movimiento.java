/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Movimiento {

    private String TipoMovimiento;
    private double monto;
    public Movimiento(String tipoMovimiento, double monto) {
        TipoMovimiento = tipoMovimiento;
        
        this.monto = monto;
    }
    @Override
    public String toString() {
        return "Movimiento [TipoMovimiento=" + TipoMovimiento  + ", monto=" + monto + "]";
    }

    public String getTipoMovimiento() {
        return TipoMovimiento;
    }

    public void setTipoMovimiento(String TipoMovimiento) {
        this.TipoMovimiento = TipoMovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
    
}
