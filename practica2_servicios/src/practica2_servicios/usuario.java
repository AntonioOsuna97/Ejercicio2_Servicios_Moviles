/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_servicios;

/**
 *
 * @author antonio
 */
public class usuario {
    //Variables
    private String nombre;
    private String DNI;

    //Constructor
    public usuario() {
        this.nombre="";
        this.DNI="";
    }

    //Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    //Metodo de escritura
    @Override
    public String toString() {
        return "usuario{\n" + "nombre:" + nombre + "\nDNI:" + DNI + "\n}";
    }
    
    
    
}
