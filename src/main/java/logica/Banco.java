/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

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
       Cliente c = exite(nombreCliente);
       
    }
       
    //verifica si el cliente existe 
    public Cliente exite(String nomb){
      for(Cliente c : misClientes){
        if(c.getNombre().equals(nomb)){
          return c;
        }
      }
      return null;
    }
  
       
    
    
}
