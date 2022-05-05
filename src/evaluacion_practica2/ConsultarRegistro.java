package evaluacion_practica2;
import java.sql.SQLException;
public class ConsultarRegistro {
    public ConsultarRegistro() throws SQLException{
        System.out.println("------CONSULTA DE REGISTROS------");
        mostrarResultados();
    }
private void mostrarResultados() throws SQLException{
    try{
        ConexionCRUD utilerias = new
    ConexionCRUD();
            String tabla = "tb_estudiante";
            String camposTabla = "*";
            String condicionBuscar = "";
            utilerias.desplegarRegistros(tabla, camposTabla, condicionBuscar);
            
    
    }catch (SQLException ex){
        System.out.println("Ha ocurrido el siguiente error: " + ex.getMessage() );
    }finally{
        MenuPrincipal.desplegarMenu();
    }
}    
}
