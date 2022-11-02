/*
    Nuestro manejo de archivos tendra los siguientes metodos
        - Crear archivo
        - Guardar Imformacion
        - Eliminar imformacion de un archivo
 */
package archivosmain;

import manejodearchivos.ManejoDeArchivos;

/**
 *
 * @author jonat
 */
public class ArchivosMain {
    
     public static void main(String[] args) {
         String nombreArchivo = "Prueba.txt";
         //ManejoDeArchivos.crearArchivo(nombreArchivo);
         //ManejoDeArchivos.escribirArchivo(nombreArchivo, "ha");
         
         ManejoDeArchivos.agregarArchivo(nombreArchivo, "Jesus");
         ManejoDeArchivos.leerArchivo(nombreArchivo);
         //ManejoDeArchivos.leerArchivoPorPalabra(nombreArchivo);
     }
}
