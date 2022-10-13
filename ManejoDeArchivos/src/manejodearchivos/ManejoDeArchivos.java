/*
    Nuestro manejo de archivos tendra los siguientes metodos
        - Crear archivo
        - Guardar Imformacion
        - Eliminar imformacion de un archivo
 */
package manejodearchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonat
 */
public class ManejoDeArchivos {

    public static void crearArchivo(String nombre) {
        File archivo = new File(nombre);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        
    }
    
    //Este metodo agrega texto en el archivo sobreescribiendo 
    public static void escribirArchivo(String nombre, String contenido){
        PrintWriter salida = null;
        File archivo= new File(nombre);
        try {//se que el fichero existe
            salida = new PrintWriter(archivo);
            salida.println(contenido);
            System.out.println("Se a creado el archivo");
        } catch (FileNotFoundException ex){//el fichero no existe
            ex.printStackTrace(System.out);
        } finally{//este bloque siempre se ejecuta
            salida.close();
        }
    }
    
    //Este metodo agrega texto en el archivo, no sobreescrito
    //No sirve
    public static void agregarArchivo(String nombre, String contenido){
        PrintWriter salida = null;
        File archivo = new File(nombre);
        try {
            salida = new PrintWriter(new FileWriter(nombre, true));
            salida.println(contenido);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }finally{
            salida.close();
        }
    }
    
    public static void leerArchivo(String nombre){
        //1.Declaramos el file
        File archivo = new File(nombre);
        BufferedReader entrada = null;
        
        try {
            //2.creamos el descriptor de lectura del fichero
            entrada = new BufferedReader (new FileReader(archivo));
            String lectura = entrada.readLine();
            //3.Ahora recorremos lectura hasta fin de fichero
            while (lectura != null) {
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivoPorPalabra(String nombre){
        File archivo = new File(nombre);
        
        try {
            Scanner entrada = new Scanner(archivo);
            int cont = 0;
            
            while(entrada.hasNext()){
                String palabra = entrada.next();
                System.out.println(palabra);
                cont ++;
            }
            System.out.println("Numero de palabras del fichero es: " + cont);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
