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

e.setId_Estudiante(leer.nextInt());

String tablaB="tb_Estudiantes";

String campoB= "id_estudiante, carnet_estudiante, nom_estudiante, ape_estudiante, edad_estudiante";


String condicionB="id_estudiante = "+e.getId_estudiante();
utilerias.desplegarRegistros(tablaB, campoB, condicionB); 
System.out.println("Nombre: ");

e.setNom_estudiante(leer.next());
System.out.println("Apellido: ");
e.setApe_estudiante(leer.next());
System.out.println("Carnet: ");
e.setCarnet_estudiante(leer.nextLine()); 

String camposValoresnuevos="carnet_estudiante='"+e.getCarnet_estudiante()+"', nom_estudiante= '"+e.getNom_estudiante()+"', ape_estudiante='"+e.getApe_estudiante()+"', edad_estudiante='"+e.getEdad_estudiante();

utilerias.actualizarEliminarRegistro(tablaB, camposValoresnuevos, condicionB); 
System.out.println("Modificado correctamente!"); MenuPrincipal.desplegarMenu();
} 
}
