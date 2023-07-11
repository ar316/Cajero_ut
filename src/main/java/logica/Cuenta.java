/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Cuenta {
    
    private String nCuenta;
    private double balance;
    private String TipoCuenta;
    ArrayList<Movimiento> misMovimientos;
    java.util.Date fecha = new Date();
    public Cuenta(String nCuenta, double balance, String TipoCuenta) {
        this.nCuenta = nCuenta;
        this.balance = balance;
        this.TipoCuenta = TipoCuenta;
        misMovimientos = new ArrayList<>();
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
    
     public void capturarMov(int i ){
         if(i == 1){
            String monto =  JOptionPane.showInputDialog(null,  "digite la cantidad a depositar");
            double amount =Double.parseDouble(monto); 
            Movimiento mov = new Movimiento("deposito", amount);
            misMovimientos.add(mov);
            deposito(amount);  
            JOptionPane.showConfirmDialog(null, "el deposito se ha realizdo correctamente", "Deposito", i, i, null);
            System.out.print(mov.toString());
        }
        else if(i == 2){
            String monto =  JOptionPane.showInputDialog(null,  "digite la cantidad a retirar");
            double amount =Double.parseDouble(monto); 
            Movimiento mov = new Movimiento("retiro", amount);
            misMovimientos.add(mov);
            retiro(amount);
            JOptionPane.showConfirmDialog(null, "retiro realizado correctamente", "retiro", i, i, null);
        }  
        
    }
     

    public void deposito(double amount) {
        balance += amount;
    } 
    public void retiro(double amount) {
        balance -= amount;
    }

    public ArrayList<Movimiento> getMisMovimientos() {
        return misMovimientos;
    }

     
    
}
