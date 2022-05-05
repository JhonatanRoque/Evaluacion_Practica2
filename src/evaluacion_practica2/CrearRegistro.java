
package evaluacion_practica2;

import java.sql.SQLException;
import java.util.Scanner;

public class CrearRegistro {
    
    CrearRegistro() throws SQLException{
    Persona person = new Persona ();
    Scanner leer = new Scanner ();
    
        System.out.println("-------CREAR NUEVO REGISTRO-------");
        
        System.out.println("Ingrese el carnet del estudiante: ");
        person.setCarnetEstudiante(leer.nextLine());
        
        System.out.println("Ingrese el nombre del estudiante: ");
        person.setNomEstudiante(leer.nextLine());
        System.out.println("Ingrese el apellido del estudiante: ");
        person.setApeEstudiante(leer.nextLine());
        
        System.out.println("Ingrese la edad del estudiante: ");
        person.setEdadEstudiante(Integer.parseInt(leer.nextLine()));
        
        
    }
}
