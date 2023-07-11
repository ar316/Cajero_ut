/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.nio.file.Files;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Banco {
    
    ArrayList<Cliente> misClientes;
    
    
       
    public Banco( ){
        this.misClientes = new ArrayList<>();
        
    }
    
    
    public void Capturardatos(String n, String cc, String tlf){
         Cliente e = new Cliente(n, cc, tlf);
         misClientes.add(e);
    }
    public ArrayList listarClientes(){
        ArrayList<Cliente> Clientes = new ArrayList<>();
        Clientes = misClientes;
        return Clientes; 
    }
    
    public void CrearCuenta(String nombreCliente, String nCuenta, double saldo, String tipo){
       Cliente c = existe(nombreCliente);
       c.datosCuenta(nCuenta, saldo, tipo);
    }
       
    //verifica si el cliente existe 
    public Cliente existe(String nomb){
      for(Cliente c : misClientes){
        if(c.getNombre().equals(nomb)){
          return c;
        }
      }
      return null;
    }
    
  
    public ArrayList verCuentas(String nombreCliente){
        Cliente c = existe(nombreCliente);
        ArrayList  cuentas = c.VerCuentas();
        return cuentas; 
    }
    
       
   public int tiposDeMovimiento(){
      int op = -1;
      while(op != 0){
        String opcion = JOptionPane.showInputDialog(null,"opciones:"+ "\n"
        + "1.realizar deposito"+"\n"
        + "2.realizar retiro"+"\n");
        op = Integer.parseInt(opcion);
    
        switch(op){
          case 1:
            return 1;
          case 2:
            return 2; 
          default:
         }

       }
      return op;
      }
    
    public void agregarMov(String nombre, String cuenta){
        
      ArrayList Cuentas;
      Cuentas =  verCuentas(nombre);
          Cuenta Actual = CuentaActual(cuenta,Cuentas);
      Cliente movCliente = existe(nombre);
      int op = tiposDeMovimiento();
      if(movCliente!=null){
        if(op == 1){
          Actual.capturarMov(1);
        }else if(op == 2){
        
          Actual.capturarMov(2);

        }
      }else{
        JOptionPane.showMessageDialog(null, "Cliente no existe");
      }
    }
    
    public Cuenta CuentaActual(String tipoCuenta, ArrayList<Cuenta> c){
        for(Cuenta e: c){
            if(tipoCuenta.equals(e.getTipoCuenta())){
                return e;
            }
            
        }
        return null;
    }
    
    
    
   
}
