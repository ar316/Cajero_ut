/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Lenovo
 */
public class Cuenta {
    
    private String nCuenta;
    private double balance;
    private String TipoCuenta;

    public Cuenta(String nCuenta, double balance, String TipoCuenta) {
        this.nCuenta = nCuenta;
        this.balance = balance;
        this.TipoCuenta = TipoCuenta;
    }

    public String getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }
    
    
    
}
