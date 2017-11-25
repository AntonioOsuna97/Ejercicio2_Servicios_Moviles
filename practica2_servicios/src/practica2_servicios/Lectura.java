/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_servicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Antonio
 */
public class Lectura {
    //Metodo que devuelve dato en mayusculas
    public String LeeDato(){
        String texto="";
        //Con InputStreamReader podemos leer caracteres 
        InputStreamReader isr = new InputStreamReader(System.in);
        //Declarmos un objeto bufferedReader para utilizar readLine y leer la entrada
        BufferedReader br = new BufferedReader(isr);
        try{
            texto=br.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        //Devuelve una cadena igual a la original pero con todos los caracteres en mayúsculas.
        return texto.toUpperCase();
    }
    
    public int LeeInt(){
        //Se utiliza parseInt para tranformar leeDato en entero.
        return Integer.parseInt(LeeDato());
    }
    public int LeeIntSolo(){
        //CharAt devuelve el caracter en la posicion indicada,es decir la 0.
        return Integer.parseInt(String.valueOf(LeeDato().charAt(0)));
    }
    //Leer float
    public float LeeFloat(){
        return Float.parseFloat(LeeDato());
    }
    public long LeeLong(){
        return Long.parseLong(LeeDato());
    }
    public char LeeChar(){
        return LeeDato().charAt(0);
    }
}
