package connector;

import java.sql.*;
import javax.swing.JOptionPane;


public class Dbc {
    
    public static Statement st;
    public static PreparedStatement insertClient,viewClient,updateClient;
    public static Connection c;
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Admin?autoReconnect=true&useSSL=false"
                    ,"root","12345678");
            st=c.createStatement();
            insertClient = c.prepareStatement("insert into Clien_info (name,gender,dob,country,address,language) values(?,?,?,?,?,?)");
            viewClient = c.prepareStatement("select * from Clien_info where name like ?");
            updateClient = c.prepareStatement("update Clien_info set name=? ,gender=? ,dob=? ,country=? ,address=? ,language=? where cid=?");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}

