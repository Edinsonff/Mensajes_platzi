import java.sql.Connection;
import java.sql.SQLException;

public class inicio {

    public static void main(String[] args) {

        Conexion con = new Conexion();

        try (Connection cnx = con.get_connection()) {

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
