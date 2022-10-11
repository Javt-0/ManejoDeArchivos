/*
    Nuestro manejo de archivos tendra los siguientes metodos
        - Crear archivo
        - Guardar Imformacion
        - Eliminar imformacion de un archivo
 */
package manejodearchivos;

import java.io.File;
import java.io.PrintWriter;

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
    
}
