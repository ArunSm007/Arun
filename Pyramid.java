import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Arun
 */
public class Pyramid {

    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        String str = "*****";
        String tmp = "";
        for(int i = 0;i < 5;i++){
            tmp = str.substring(i, 5);
            System.out.println(tmp+" "+tmp);
        }
    }
    
}