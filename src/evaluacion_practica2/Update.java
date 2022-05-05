package evaluacion_practica2;

import java.sql.SQLException;

import java.util.Scanner;

public class Update {
    Update() throws SQLException{ 
        Scanner leer= new Scanner (System.in);

Persona e = new Persona();
ConexionCRUD utilerias =new ConexionCRUD();

System.out.println("<<<<< ACTUALIZAR REGISTROS >>>>>");

System.out.println("Ingresar id del registro a modificar: ");

e.setIdEstudiante(leer.nextInt());

String tablaB="tb_Estudiantes";

String campoB= "id_estudiante, carnet_estudiante, nom_estudiante, ape_estudiante, edad_estudiante";


String condicionB="id_estudiante = "+e.getIdEstudiante();
utilerias.desplegarRegistros(tablaB, campoB, condicionB); 
System.out.println("Nombre: ");

e.setNomEstudiante(leer.next());
System.out.println("Apellido: ");
e.setApeEstudiante(leer.next());
System.out.println("Carnet: ");
e.setCarnetEstudiante(leer.nextLine()); 

String camposValoresnuevos="carnet_estudiante='"+e.getCarnetEstudiante()+"', nom_estudiante= '"+e.getNomEstudiante()+"', ape_estudiante='"+e.getApeEstudiante()+"', edad_estudiante='"+e.getEdadEstudiante();

utilerias.actualizarEliminarRegistro(tablaB, camposValoresnuevos, condicionB); 
System.out.println("Modificado correctamente!"); MenuPrincipal.desplegarMenu();
} 
}
