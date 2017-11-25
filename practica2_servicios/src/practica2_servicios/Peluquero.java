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
public class Peluquero extends Peluqueria{
    //Definimos variables
    private String nombre_peluquero;
    private int codigo_peluquero;
    
    //Constructor vacio
    public Peluquero(){
        super();
        this.codigo_peluquero=0;
        this.nombre_peluquero="";
    }

    //Constructor con parámetros
    public Peluquero(String nombre_peluquero, int codigo_peluquero,String nombre_peluqueria, int codigo_peluqueria,long fecha) {
        super(nombre_peluqueria, codigo_peluqueria, fecha);
        this.nombre_peluquero = nombre_peluquero;
        this.codigo_peluquero = codigo_peluquero;
    }

    //Get y Set
    public String getNombre_peluquero() {
        return nombre_peluquero;
    }

    public void setNombre_peluquero(String nombre_peluquero) {
        this.nombre_peluquero = nombre_peluquero;
    }

    public int getCodigo_peluquero() {
        return codigo_peluquero;
    }

    public void setCodigo_peluquero(int codigo_peluquero) {
        this.codigo_peluquero = codigo_peluquero;
    }

    //Metodo de escritura
    @Override
    public String toString() {
        return "Peluquero{\n" + "nombre_peluquero:" + nombre_peluquero + "\ncodigo_peluquero=" + codigo_peluquero + "\n}";
    }
    
    
}
