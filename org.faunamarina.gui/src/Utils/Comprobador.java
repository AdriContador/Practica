package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**Esta clase sirve para conectarse a la bbdd que especifiquemos en el GetConnection, nos enciara un aviso para saber si
 * la conexión es correcta o no.
 * @author Adri Contador
 */
public class Comprobador {
    /**
     * Con este método compruebo la conectividad de la bbdd.
     * @return Retorna si conecta o no.
     */
    public static Connection Prueba(){


        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/registros","root","Codian69");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("show databases;");
            System.out.println("Hay conexion con la base de datos.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return null;
    }

    public Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registros",
                    "root", "Codian69");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}