package clases;
import java.sql.*;
/*** @author El Maestro
 */
public class Conexion {
    //LOCAL HOST
    public static Connection conectar(){
        try {
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/bd_mant","root","");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en conexión "+e);
        }   
        return (null);
    }
}
