
package package_Persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import package_Modelo.Alumno;


public class AlumnoData {

    private Connection conexion = null;

    public AlumnoData() {

        conexion = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {

        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUES(?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if (rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El/la alumno/a ha sido cargado con éxito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno de la base de datos.");
        }
    }
    
    public void modificarAlumno (Alumno alumno) {
        String sql="UPDATE alumno SET dni=?, apellido=?, nombre=?, fechaNacimiento=?"
                + "WHERE=?";
        try {
            PreparedStatement ps= conexion.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getDni());
            int exito= ps.executeUpdate();
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "El/la alumno/a ha sido modificado con éxito.");
            }
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno de la base de datos.");        }
    }
    
    public void eliminarAlumno (int id){
        String sql="UPDATE alumno SET estado=0 WHERE idAlumno=?";
        
        try {
            PreparedStatement ps= conexion.prepareCall(sql);
            ps.setInt(1,id);
            int exito= ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "El/la alumno/a ha sido eliminado con éxito.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno de la base de datos.");
        }
    }
    

}
