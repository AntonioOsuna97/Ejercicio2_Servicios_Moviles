/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_servicios;

import java.util.ArrayList;

/**
 *
 * @author antonio
 */
public class Practica2_ServiciosClases {
    //Variables
    private String nombre_peinado, comentarios;
    public ArrayList <Peluqueria> lcitas;

    //Constructor
    public Practica2_ServiciosClases() {
        this.nombre_peinado="";
        this.comentarios="";
        this.lcitas= new ArrayList();
    }

    //Get y Set
    public String getNombre_peinado() {
        return nombre_peinado;
    }

    public void setNombre_peinado(String nombre_peinado) {
        this.nombre_peinado = nombre_peinado;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public ArrayList<Peluqueria> getLcitas() {
        return lcitas;
    }

    public void setLcitas(ArrayList<Peluqueria> lcitas) {
        this.lcitas = lcitas;
    }
    
    
    public Peluqueria addCita(String nomb_pelu, int cod_pelu, long fecha){
        //Declaramos un jugador, utilizando el constructor de la clase Jugador
        Peluqueria nuevaCit= new Peluqueria(nomb_pelu,cod_pelu, fecha);
        //damos de alta en la hashmap
        lcitas.add(nuevaCit);
        
        return nuevaCit;
    }
    
    //Partido es una arrayList por lo tanto, el parámetro pos pasado a la entrada
    //es la posición del arraylist, siempre empieza en la poscion 0
    public boolean bajacita(int pos){
         boolean baja=false;
        //si el tamaño de la lista es 0
        if(lcitas.size()==0){
            System.out.println("No se puede dar de baja un partido.");
            return baja;
        }else{
        lcitas.remove(pos);
        baja=true;
        return baja;
        }
    }
    
    
    //Clase para los mensajes del protocolo
   public String visualizaCita() {
   
       String texto="";
      //Recorremos la lista de citas
         for(int pos=0;pos<this.lcitas.size();pos++){
         texto+= this.lcitas.get(pos).toString();         
   }
         return texto;
   }
   //Lista las citas en una fecha
    public String visualizaCita(int dia, int mes, int anio){
        long fechaBuscar=dia + 100*mes + 10000*anio;
        //Inicializamos texto a vacío
        String texto="";
        //Recorremos la lista de citas
         for(int pos=0;pos<this.lcitas.size();pos++){
        
            //Comparamos si la fechabuscar es igual a la fecha
            if(this.lcitas.get(pos).getFechaCompara()==fechaBuscar){
                     texto+= this.lcitas.get(pos).toString(); 
            }else texto="No hay partidos en la fecha\n";
        }
        return texto;
    } 
   
   
    
}
