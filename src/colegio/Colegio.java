
package colegio;

import java.sql.Connection;
import package_Persistencia.Conexion;

/**
 *
 * @author Jon_kevin27
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection connect= Conexion.getConexion();
    }
    
}
