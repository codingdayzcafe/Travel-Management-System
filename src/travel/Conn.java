package travel;

import java.sql.*;

public class Conn{
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","Ankit@1012#");

            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}


