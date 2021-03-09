package day1;

import java.sql.*;

public class LoopingResultTest {
    public static void main(String[] args) throws SQLException {

        String url="jdbc:oracle:thin:@54.236.150.168:1521:XE";
        String username = "hr";
        String password="hr";

        Connection con = DriverManager.getConnection(url, "hr", "hr");
        Statement stmnt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmnt.executeQuery("select * from regions");

      //  rs.next();
       // System.out.println("regoin value at this row is "+rs.getString("region_name"));

      //  System.out.println("do we have next row "+rs.getString("region_name"));

        while(rs.next()){
            System.out.println("region id at this row is "+ rs.getString("region_id"));
            System.out.println("region value at this row is " + rs.getString("region_name"));
        }

    }
}
