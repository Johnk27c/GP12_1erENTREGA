
package package_Persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import package_Modelo.Alumno;


public class AlumnoData {
    private Connection conexion=null;
    
    public AlumnoData(){
        
        conexion = Conexion.getConexion();
        
    }
    
    public void guardarAlumno(Alumno alumno){
        
        String sql="INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                +"VALUES(?, ?, ?, ?, ?)";
                
        try {
            PreparedStatement ps=conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
    }
    
}
