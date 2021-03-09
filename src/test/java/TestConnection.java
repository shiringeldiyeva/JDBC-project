import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) throws SQLException {


        /*
        *host : 54.236.158.168
        * host :54.236.159.168
        * port:1521
        * SID : XE
        * User : hr
        * pass: hr
        *
        * jdbc url AKA connection string
        * syntax: jdbc: vendorName:driverType @yourHost:PORT:SID
        *
        * jdbc:oracle:
         */

        String url="jdbc:oracle:thin:@54.236.150.168:1521:XE";
        try {
            Connection con = DriverManager.getConnection(url, "hr", "hr");
            System.out.println("connection successful");
        }catch(SQLException e){
            System.out.println("connection has failed"+e.getMessage());
        }
    }
}
