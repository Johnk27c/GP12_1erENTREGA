package package_Vistas;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import package_Modelo.Alumno;
import package_Persistencia.AlumnoData;
import package_Modelo.Conexion;
import package_Modelo.Materia;
import package_Persistencia.MateriaData;

/**
 *
 * @author Jon_kevin27
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//
//        Connection connect = Conexion.getConexion();
//        AlumnoData alu = new AlumnoData();
//        MateriaData mat = new MateriaData();
//
////        Alumno alumno1 = new Alumno("Jara", "Gabriel", 34007556, LocalDate.of(1988, 9, 26), true);
////        alu.guardarAlumno(alumno1);
////        Alumno alumno2 = new Alumno(2,"Guerrero", "Rodrigo", 23765347, LocalDate.of(2001, 9, 27), true);
////        alu.guardarAlumno(alumno2);
////        Alumno alumno3 = new Alumno("Lara", "Santiago", 42942099, LocalDate.of(2002, 4, 12), true);
////        alu.guardarAlumno(alumno3);
////        Alumno alumno4 = new Alumno("Herrera", "Franco", 46936302, LocalDate.of(2005, 11, 26), true);
////        alu.guardarAlumno(alumno4);
////        Alumno alumno5 = new Alumno("Cuello", "Jon", 37090900, LocalDate.of(1993, 4, 27), true);
////        alu.guardarAlumno(alumno5);
////
////        ArrayList<Alumno> alumnos = new ArrayList();
////        alumnos = alu.mostrarAlumnos();
////        System.out.println("");
////        System.out.println("Lista de alumnos");
////        System.out.println("");
////        for (Alumno alumno : alumnos) {
////            System.out.println(alumno);
////        }
////        
////        
////        System.out.println("");
////        System.out.println("Búsqueda de alumno por ID");
////        System.out.println(alu.buscarAlumnoporID(2)); // MÉTODOS OPCIONALES
////        System.out.println("");
////        System.out.println("Busqueda de alumno por DNI");
////        System.out.println(alu.buscarAlumnoporDNI(34007556)); // MÉTODOS OPCIONALES
//        Materia mat1 = new Materia("Matemática", 1, true);
//        Materia mat2 = new Materia("Lengua", 2, true);
//        Materia mat3 = new Materia("Música", 1, false);
//        Materia mat4 = new Materia("Tecnología", 3, true);
//        Materia mat5 = new Materia(1, "Matemáticas", 2, true);
//
////        mat.modificarMateria(mat5);
////        alu.modificarAlumno(alumno2);
////        mat.guardarMateria(mat1);
////        mat.guardarMateria(mat2);
////        mat.guardarMateria(mat3);
////        mat.guardarMateria(mat4);
////        mat.eliminarMateria(3);
////        alu.eliminarAlumno(2);
////        System.out.println(mat.buscarMateria(2));
////        System.out.println(mat.mostrarMaterias());
//
//        //MÉTODOS CON EL USO DE ESCANNER
////
////        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
////        String respuesta = "";
////        do {
////            System.out.println("¿Desea cargar un/a alumno/a?");
////            respuesta= entrada.nextLine();
////            if (respuesta.equalsIgnoreCase("SI")) {
////                System.out.println("INGRESE LOS DATOS DEL ALUMNO/A");
////                System.out.println("Ingrese el apellido del alumno/a");
////                String apellido = entrada.nextLine();
////                System.out.println("Ingrese el nombre del alumno/a");
////                String nombre = entrada.nextLine();
////                System.out.println("Ingrese el DNI del alumno/a");
////                int dni = entrada.nextInt();
////                entrada.nextLine();
////                System.out.println("Ingrese la fecha de nacimiento del alumno/a con el siguiente formato (YYYY-MM-DD)");
////                String fecha = entrada.nextLine();
////                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
////                LocalDate fechaNac = LocalDate.parse(fecha, formatter);
////                System.out.println("Ingrese el estado del alumno/a");
////                boolean estado = entrada.nextBoolean();
////                Alumno alumno = new Alumno(apellido, nombre, dni, fechaNac, estado);
////                alu.guardarAlumno(alumno);
////
////                System.out.println("¿Desea agregar otra alumno/a? SI/NO");
////                entrada.nextLine();
////                respuesta = entrada.nextLine();
////                if (respuesta.equalsIgnoreCase("SI")) {
////                    System.out.println("INGRESE LOS DATOS DEL SIGUIENTE ALUMNO/A");
////                }
////            }else {
////                break;
////            }
////        }while (respuesta.equalsIgnoreCase("SI")); 
////
////    }
//    }
}
