/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;
import java.sql.*;


/**
 *
 * @author admin
 */
public class HotelSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
      
     String str=(" select * from Customer");
     try
     {
         Class.forName("org.postgresql.Driver");
         Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/Hotel","postgres","87654321");
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery(str);
         while(rs.next())
         {
             System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
         }
         rs.close();
         st.close();
         con.close();
     }
     catch (Exception e)
     {
     }

    }
    
}
