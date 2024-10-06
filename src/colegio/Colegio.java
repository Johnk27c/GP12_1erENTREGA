package colegio;



import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
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

        Connection connect = Conexion.getConexion();
        AlumnoData alu = new AlumnoData();
////        System.out.println(alu.buscarAlumno(1));
////        Alumno jony = new Alumno("Castro", "Jony", 48766736, LocalDate.of(2000, 5, 27), true);
////        alu.guardarAlumno(jony);
//
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        String respuesta = "";
        do {
            System.out.println("¿Desea cargar un/a alumno/a?");
            if (respuesta.equalsIgnoreCase("SI")) {
                System.out.println("INGRESE LOS DATOS DEL ALUMNO/A");
                System.out.println("Ingrese el apellido del alumno/a");
                String apellido = entrada.nextLine();
                System.out.println("Ingrese el nombre del alumno/a");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese el DNI del alumno/a");
                int dni = entrada.nextInt();
                System.out.println("Ingrese la fecha de nacimiento del alumno/a con el siguiente formato (YYYY-MM-DD)");
                String fecha = entrada.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate fechaNac = LocalDate.parse(fecha, formatter);
                System.out.println("Ingrese el estado del alumno/a");
                boolean estado = entrada.nextBoolean();
                Alumno alumno = new Alumno(apellido, nombre, dni, fechaNac, estado);
                alu.guardarAlumno(alumno);

                System.out.println("¿Desea agregar otra alumno/a? SI/NO");
                entrada.nextLine();
                respuesta = entrada.nextLine();
                if (respuesta.equalsIgnoreCase("SI")) {
                    System.out.println("INGRESE LOS DATOS DEL SIGUIENTE ALUMNO/A");
                }
            }else {
                break;
            }
        }while (respuesta.equalsIgnoreCase("SI")); 

    }

}
