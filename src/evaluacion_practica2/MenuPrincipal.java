package evaluacion_practica2;

import java.sql.SQLException; //Libreria para conexiones con base de datos
import java.util.*;

public class MenuPrincipal {

    public static void main(String[] args) {
        desplegarMenu();
    }
    
    //metodo de desplegar menu
    public static void desplegarMenu() {
        Scanner opcionSeleccionada = new Scanner(System.in);
        String opcionMenu;
        //Menu a desplegar
        System.out.println("*******************************************");
        System.out.println("|         CRUD  DE JAVA EN CONSOLA        |");
        System.out.println("| Opciones:                               |");
        System.out.println("|          1. Crear resgistro             |");
        System.out.println("|          2. Consultar registros         |");
        System.out.println("|          3. Actualizar registros        |");
        System.out.println("|          4. Eliminar registros          |");
        System.out.println("|          5. Salir                       |");
        System.out.println("*******************************************");
        System.out.println("Seleccionar opción: ");
        opcionMenu = opcionSeleccionada.next();
        try{
        //Despliegue de menu basado en la opción seleccionada
        switch(opcionMenu){
            case "1":
                CrearRegistro crear = new CrearRegistro();
                break;
            case "2":
                ConsultarRegistro consultar = new ConsultarRegistro();
                break;
            case "3":
                Update update = new Update();
                break;
            case "4":
                EliminarRegistro eliminar = new EliminarRegistro();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Selección invalida!");
                break;
        }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
