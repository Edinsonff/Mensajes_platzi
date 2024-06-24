import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root", "");
            if(con != null){
                System.out.println("conexion exitosa");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
}
