
package archivosmain;

import manejodearchivos.ManejoDeArchivos;

/**
 *
 * @author jonat
 */
public class ArchivosMain {
    
     public static void main(String[] args) {
         String nombreArchivo = "Prueba.txt";
         ManejoDeArchivos.crearArchivo(nombreArchivo);
     }
}
