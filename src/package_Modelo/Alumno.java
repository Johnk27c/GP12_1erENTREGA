
package package_Modelo;

import java.time.LocalDate;

/**
 *
 * @author Jon_kevin27
 */
public class Alumno {
    private int IdAlumno;
    private String apellido;
    private String nombre;
    private int dni;
    private LocalDate fechaNac;
    private boolean estado;

    public Alumno() {
    }

    public Alumno(int IdAlumno, String apellido, String nombre, int dni, LocalDate fechaNac, boolean estado) {
        this.IdAlumno = IdAlumno;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.estado = estado;
    }

    public Alumno(String apellido, String nombre, int dni, LocalDate fechaNac, boolean estado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.estado = estado;
    }

    public int getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "IdAlumno=" + IdAlumno + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + ", fechaNac=" + fechaNac + ", estado=" + estado + '}';
    }

    
    
    
}
