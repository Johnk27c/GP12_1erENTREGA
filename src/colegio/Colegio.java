
package colegio;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import package_Modelo.Alumno;
import package_Persistencia.AlumnoData;
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
        
//        Connection connect= Conexion.getConexion();
 AlumnoData alu = new AlumnoData();
        System.out.println(alu.buscarAlumno(1));
        Alumno jony = new Alumno("Castro","Jony",48766736,LocalDate.of(2000, 5, 27),true);
        alu.guardarAlumno(jony);
        
    }
    
}
