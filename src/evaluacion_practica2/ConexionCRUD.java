package evaluacion_practica2;

import java.sql.*; //Libreria de conexiones SQL


public class ConexionCRUD {
    /*
    Ruta de la base de datos del servidor 127.0.0.1, el puerto 3306 y el nombre 
    de la base de datos bd_recurso_humano
    */
    private final String servidor = "jdbc:mysql://127.0.0.1:3306/bd_Estudiantes"; 
    //Nombre del usuario (root por defecto) de la base de datos
    private final String usuario = "root";
    //Clave del usuario de la base de datos
    private final String clave = "";
    //Libreria de mysql
    private final String driverConector  = "com.mysql.jdbc.Driver";
    //Objeto de la clase Connection del paquete java.sql
    private static Connection conexion;
    
    //Constructor, que se conecta a la base de datos al ser llamado
    public ConexionCRUD(){
        try{
            Class.forName(driverConector); //Levantar el driver
            //Establecer conexión
            conexion = DriverManager.getConnection(servidor, usuario, clave);
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Conexión fallida! Error! : " + e.getMessage());
        }
    }
}
