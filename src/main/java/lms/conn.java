package lms;


import java.sql.*;  

/**
 * Database connection setup
 * 
 * @author Andi
 * @author Vlad
 */
public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            c =DriverManager.getConnection("jdbc:mysql:///lms","root","");    
            s =c.createStatement();  
        }catch(Exception e){ 
            System.out.println(e); 
        }  
    }  
}  
