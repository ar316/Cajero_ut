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
public class Cliente  {
    
    private String nombre;
    private String cc;
    private String tlf;
    ArrayList<Cuenta> misCuentas;
    

    
    public Cliente(String nombre, String cc, String tlf) {
       
        this.nombre = nombre;
        this.cc = cc;
        this.tlf = tlf;
        misCuentas = new ArrayList<>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }
    
    public void AgregarCuenta(Cuenta e){
        misCuentas.add(e);
    }
    
    public void datosCuenta(String nCuuenta, double Monto,String tipo){
        Cuenta account = new Cuenta(nCuuenta,Monto,tipo);
        misCuentas.add(account);
    }
    
    
    
    
    
    
}
