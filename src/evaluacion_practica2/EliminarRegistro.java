
package evaluacion_practica2;

import java.sql.SQLException;
import java.util.Scanner;

public class EliminarRegistro {
    
    EliminarRegistro() throws SQLException{
        Scanner leer = new Scanner (System.in);
        ConexionCRUD utilerias = new ConexionCRUD();
        System.out.println("-------ELIMINAR REGISTRO-------");
        
        System.out.println("Ingresar el id del registro: ");
        String idEstudianteEliminar = leer.next();
        String tabla = "tb_estudiante";
        String campo = "*";
        String condicion = "id_estudiante = " + idEstudianteEliminar;
        utilerias.desplegarRegistros(tabla, campo, condicion);
        
        System.out.println("Presionar << X >> para confirmar: ");
        String confirmarBorrar = leer.next();
        
        if("X".equals(confirmarBorrar)) {
            String valoresCamposNuevos = "";
            
            utilerias.actualizarEliminarRegistro(tabla, valoresCamposNuevos, condicion);
            System.out.println("EL REGISTRO SE HA ELIMINADO CORRECTAMENTE!");
        }
        MenuPrincipal.desplegarMenu();
        
    }
}
