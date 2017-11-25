/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_servicios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author antonio
 */
public class Practica2_Servicios {
//Menu inicio sesión
    public String textoMenuInicio(){
        String texto="Menu Inicio sesión\n";
        texto+="1. Inicio sesion \n";
        texto+="2. Registrarse\n";
        return texto;
    }
    
 //Menu
    public String textoMenu(){
        String texto="MENU\n";
        texto+="0.- Cerrar Sesion.\n";
        texto+="1.- Alta cita.\n";
        texto+="2.- Baja cita.\n";
        texto+="3.- Mostrar informacion de citas.\n";
        texto+="4.- Mostrar informacion de citas dada una fecha.\n";
        return texto;
    }

//Menu
    public void menu() throws IOException, FileNotFoundException, ClassNotFoundException{
        int opcion=0;

        //Variable lee de tipo lectura
        Lectura lee=new Lectura();
        //Creamos el objeto de la practica para acceder a sus metodos
        Practica2_ServiciosClases objetoApp = new Practica2_ServiciosClases();
        Peluqueria objetoPelu = new Peluqueria();
        usuario objetoUser = new usuario();
        int opcioninicio;
        do{
            //inicio sesion
            System.out.print(textoMenuInicio());
            System.out.println("Elige opción: ");
            opcioninicio=lee.LeeInt();
            switch(opcioninicio){
                case 1:{
                    //Inicio sesion
                    System.out.println("Introduce usuario: ");
                    String user = lee.LeeDato();
                    System.out.println("Introduce DNI: ");
                    String DNI = lee.LeeDato();
                    if(objetoUser.getNombre().equals(user) && objetoUser.getDNI().equals(DNI)){
                        System.out.println("Usuario correcto");
                    }else{
                        System.out.println("Usuario incorrecto");
                        //Para que se vaya al case 3 y no escriba "opcion no disponible"
                        opcioninicio=3;
                    }
                    break;
                }
                case 2:{
                    //Registrarse
                    System.out.println("Introduce nombre de usuario: ");
                    String userRegis=lee.LeeDato();
                    objetoUser.setNombre(userRegis);
                    System.out.println("Introduce su DNI: ");
                    String DNIRegis = lee.LeeDato();
                    objetoUser.setDNI(DNIRegis);
                    //Tendriamos que guardar cada registro para que al registrarse se guardará cada usuario
                    break;
                }
                default:{
                    System.out.print("Opcion no disponible.\n");
                    break;
                }
            }
        }while(opcioninicio!=1);    
            do{        
            //Introducimos el menu
            System.out.print(textoMenu());
            //Elegimos opción
            System.out.print("Elija una opcion: ");
            //Leemos un entero
            opcion=lee.LeeInt();
            switch(opcion){
                    case 1:{
                    System.out.println("Introduce el nombre de la peluqueria: ");
                    String nombre=lee.LeeDato();
                    if(objetoPelu.getNombre_peluqueria().equals(nombre)){
                    System.out.println("Peluqueria encontrada");
                    System.out.println("Introduce su codigo: ");
                    int codigoPel=lee.LeeInt();
                    if(objetoPelu.getCodigo_peluqueria() == codigoPel){
                    System.out.println("Codigo correcto"); 
                    //Introducimos dia,mes y año
                    System.out.print("Dia: ");
                    int dia=lee.LeeInt();
                    System.out.print("Mes: ");
                    int mes=lee.LeeInt();
                    System.out.print("Anio: ");
                    int anio=lee.LeeInt();
                    long fecha=anio*10000+mes*100+dia;
                    objetoApp.addCita(nombre, codigoPel, fecha);
                    }else{
                     System.out.println("Codigo incorrecto");   
                    }
                    }else{
                        System.out.println("Peluqueria no encontrada");
                    }
                    break;
                }
                case 2:{
                    System.out.println("Introduce el codigo de la peluqueria para dar de baja una cita: ");
                    int codigoPelBaja=lee.LeeInt();
                    objetoApp.bajacita(codigoPelBaja);
                    break;
                }
                case 3:{
                    System.out.println(objetoApp.visualizaCita());
                    break;  
                }
                
                case 4:{
                    //Declaramos variables
                    int dia, mes, anio;
                    System.out.print("Introduzca el dia: ");
                    dia=lee.LeeInt();
                    System.out.print("Introduzca el mes: ");
                    mes=lee.LeeInt();
                    System.out.print("Introduzca el año: ");
                    anio=lee.LeeInt();
                    System.out.println(objetoApp.visualizaCita(dia, mes, anio));
                    break;
                }
                case 0:{
                    System.out.print("Fin del programa.\nGracias por usar PeluApp.\n");
                    break;
                }
                default:{
                    System.out.print("Opcion no disponible.\n");
                    break;
                }
            }
        }while(opcion!=0);
}

        
 
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here
        System.out.print("Bienveanido a la PeluApp\n");
        //Creamos el objeto PeluApp
        Practica2_Servicios nuevo = new Practica2_Servicios();
        //llamamos al menu
        nuevo.menu();
    }
    
    
}

