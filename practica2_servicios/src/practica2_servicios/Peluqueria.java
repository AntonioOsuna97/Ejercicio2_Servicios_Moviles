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
public class Peluqueria {
    //Variables
    private String nombre_peluqueria;
    private int codigo_peluqueria;
    private long fecha;
    
    //Constructor vacio
    public Peluqueria(){
        this.nombre_peluqueria="";
        this.codigo_peluqueria=0;
        this.fecha=0;
    }
    
    //Constructor 
    public Peluqueria(String nombre_peluqueria, int codigo_peluqueria, long fecha) {
        this.nombre_peluqueria = nombre_peluqueria;
        this.codigo_peluqueria = codigo_peluqueria;
        this.fecha=fecha;
    }

    
    //GEt y Set
    public String getNombre_peluqueria() {
        return nombre_peluqueria;
    }

    public void setNombre_peluqueria(String nombre_peluqueria) {
        this.nombre_peluqueria = nombre_peluqueria;
    }

    public int getCodigo_peluqueria() {
        return codigo_peluqueria;
    }

    public void setCodigo_peluqueria(int codigo_peluqueria) {
        this.codigo_peluqueria = codigo_peluqueria;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }
    
     //Devuelve fecha
    public long getFechaCompara(){
        return this.fecha;
    }
    
    //Método que asigna a la fecha los valores pasados por parametros
    public void setFecha(int dia, int mes, int anio){
        this.fecha=dia + 100*mes + 10000*anio;
    }
    
    //Metodo de sobrescritura
    @Override
    public String toString() {
        return "Peluqueria{\n" + "nombre_peluqueria:" + nombre_peluqueria + "\ncodigo_peluqueria:"
                + codigo_peluqueria + "\nfecha:" + fecha + "\n}";
    }
   
}
