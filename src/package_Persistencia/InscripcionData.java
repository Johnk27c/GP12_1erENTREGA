
package package_Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import package_Modelo.Alumno;
import package_Modelo.Conexion;
import package_Modelo.Inscripcion;
import package_Modelo.Materia;

/*
 * @author Santiago Lara
 */
public class InscripcionData {
    private Connection con = null;
    private MateriaData mdata= new MateriaData();
    private AlumnoData adata= new AlumnoData(); 
    
    public InscripcionData(){
        this.con = Conexion.getConexion();
        
    }
    public void guardarInscripcion(Inscripcion ins){
        String sql= "INSERT INTO inscripcion(idAlumno, idMateria, nota) VALUES (?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,ins.getAlumno().getIdAlumno());
            ps.setInt(2, ins.getMateria().getIdMateria());
            ps.setDouble(3, ins.getNota());
            ps.executeUpdate();
            ResultSet res = ps.getGeneratedKeys();
            if (res.next()) {
                ins.setIdInscripcion(res.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion Registrada");
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
        
        
    }//Chequeado
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        
        String sql= "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Nota Actualizada");
                
            }
            ps.close();
            
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al actualizar nota");        }
    }
    
    public void borrarInscripcion(int idAlumno, int idMateria){
        String sql= "DELETE FROM inscripcion WHERE idAlumno= ? AND idMateria = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
             int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion Borrada");
                
            }
            ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla inscripcion");  
        }
        
    } //Chequeado
    
    public List<Inscripcion> obtenerInscripciones(){
        ArrayList <Inscripcion> cursada= new ArrayList<>();  
        String sql= "SELECT * FROM inscripcion";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            while(res.next()){
                
                Inscripcion ins=new Inscripcion();
                ins.setIdInscripcion(res.getInt("idInscripto"));
                Alumno alum=adata.buscarAlumnoporID(res.getInt("idAlumno"));
                Materia mat=mdata.buscarMateria(res.getInt("idMateria"));
                ins.setAlumno(alum);
                ins.setMateria(mat);
                ins.setNota(res.getDouble("nota"));
                cursada.add(ins);
            }
                    } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a tabla inscripción");
        }
        return cursada;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
        ArrayList <Inscripcion> cursada= new ArrayList<>();  
        String sql= "SELECT * FROM inscripcion WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet res=ps.executeQuery();
            while(res.next()){
                
                Inscripcion ins=new Inscripcion();
                ins.setIdInscripcion(res.getInt("idInscripto"));
                Alumno alum=adata.buscarAlumnoporID(res.getInt("idAlumno"));
                Materia mat=mdata.buscarMateria(res.getInt("idMateria"));
                ins.setAlumno(alum);
                ins.setMateria(mat);
                ins.setNota(res.getDouble("nota"));
                cursada.add(ins);
            }
                    } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a tabla inscripción");
        }
        return cursada;
    }
     
    public List<Materia> obtenerMateriasCursadas(int idAlumno){
         ArrayList<Materia> materias=new ArrayList<>();
         String sql = "SELECT materia.idMateria, nombre, anioMateria FROM inscripcion, "
                 + "materia WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet res=ps.executeQuery();
            
            while(res.next()){
                
                Materia materia =new Materia();
                materia.setIdMateria(res.getInt("idMateria"));
                materia.setNombre(res.getNString("nombre"));
                materia.setAnioMateria(res.getInt("anioMateria"));
                materias.add(materia);
                
            }
            ps.close();
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion"); 
     }
        return materias;
}//Chequeado
     
    public List<Materia> obtenerMateriasNOCursadas(int idAlumno){
         ArrayList<Materia> materias=new ArrayList<>();
         String sql = "SELECT * FROM materia WHERE activo = 1 AND idMateria not in "
                 + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ? )";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet res=ps.executeQuery();
            
            while(res.next()){
                
                Materia materia =new Materia();
                materia.setIdMateria(res.getInt("idMateria"));
                materia.setNombre(res.getNString("nombre"));
                materia.setAnioMateria(res.getInt("anioMateria"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion"); 
     }
        return materias;
 }//Chequeado
 
    public List<Alumno> obtenerAlumnosPorMateria(int idMateria){
        ArrayList<Alumno> alumnoMateria=new ArrayList<>();
        String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado "
                + "FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ?"
                + "AND a.estado = 1";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            
            ResultSet res=ps.executeQuery();
            
            while(res.next()){
                Alumno alum=new Alumno();
                alum.setIdAlumno(res.getInt("idAlumno"));
                alum.setApellido(res.getString("apellido"));
                alum.setNombre(res.getString("nombre"));
                alum.setFechaNac(res.getDate("fechaNacimiento").toLocalDate());
                alum.setEstado(res.getBoolean("estado"));
                alumnoMateria.add(alum);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las tablas");        }
        return alumnoMateria;
    }
}