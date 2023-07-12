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
            if(retiro(amount)){
                Movimiento mov = new Movimiento("retiro", amount);
                misMovimientos.add(mov);
                JOptionPane.showConfirmDialog(null, "retiro realizado correctamente", "retiro", i, i, null);
            }else{
                capturarMov(2);
            }
            
        }  
        
    }
     

    public Boolean deposito(double amount) {
        if(amount > 0){
            balance += amount;
            return true;
        }else{
            return false;
        }    
    } 
    public boolean retiro(double amount) {
        if(this.balance >= amount){
            balance -= amount;
            return true;
        }else{
            JOptionPane.showConfirmDialog(null, "Fondos Insuficientes");
            return false;
        }
       
    }

   
    public ArrayList<Movimiento> getMisMovimientos() {
        return misMovimientos;
    }

     
    
}
