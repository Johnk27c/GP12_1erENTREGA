
package package_Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import package_Modelo.Conexion;
import package_Modelo.Materia;

public class MateriaData {
    
    private Connection conexion = null;

    public MateriaData() {

        conexion = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia (nombre, anioMateria, activo)"
                + "VALUES(?, ?, ?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La materia ha sido guardada con éxito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia de la base de datos.");
        }
    }
    
    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre = ?, anioMateria = ? "
                + "WHERE idMateria = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());   
            ps.setInt(3, materia.getIdMateria());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "La materia ha sido modificada con éxito.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia de la base de datos.");
        }
    }
    
    public void eliminarMateria(int id) {
        String sql = "UPDATE materia SET activo = 0 WHERE idMateria = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "La materia ha sido eliminada con exito");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia en la base de datos.");
        }
    }
    
    public Materia buscarMateria(int id) {
        String sql = "SELECT nombre, anioMateria FROM materia WHERE IdMateria = ? AND activo = 1";
        Materia materia = null;
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);               
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                materia.setActivo(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe una materia con el ID indicado.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia en la base de datos.");
        }
        return materia;
    }
    
    public ArrayList<Materia> mostrarMaterias() {
        ArrayList<Materia> materias = new ArrayList();
        try {
            String sql = "SELECT idMateria, nombre, anioMateria FROM materia WHERE activo = 1";
            PreparedStatement ps = conexion.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                materia.setActivo(true);
                materias.add(materia);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia de la base de datos.");
        }
        return materias;
    }
    
}
