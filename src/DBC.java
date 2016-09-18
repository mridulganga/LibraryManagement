import java.sql.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class DBC {
    
    public static String currentUser="";
    

    
    public static Connection ConnectDB() 
    {
        //Register the JDBC Driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //Open a Connection
        try{
            Connection Con=DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
            return Con;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       return null;
    } // End of ConnectDB
    
    
    public static void DisconnectDB(Connection Con)
    {
        try {
            Con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    } // End of DisconnectDB
    
    public static void ExecuteSQL(Connection Con,String SQL)
    {
        Statement S;
        try {
            S = Con.createStatement();
            int R = S.executeUpdate(SQL);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    } //End of ExecuteSQL
    public static ResultSet getTable(Connection Con,String SQL)
    {
        Statement S;
        try {
            S = Con.createStatement();
            ResultSet R = S.executeQuery(SQL);
            return R;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    } //End of getTable
    public static void firstRun()
    {
        Connection con = DBC.ConnectDB();
        String sql="create table if not exists books (bid int(4) primary key,bname varchar(30),author varchar(30),DOP date,available int(1),price float(7,2))";
        DBC.ExecuteSQL(con, sql);
        sql="create table if not exists issue (id int(4) primary key,BID int(4), MID int(4), DOI date);";
        DBC.ExecuteSQL(con, sql);
        sql="create table if not exists members (id int(4) primary key, name varchar(30), Sex varchar(10),Age int(2), address varchar(400), issued int(8), password varchar(14));";
        DBC.ExecuteSQL(con, sql);
        sql="create table if not exists subscriptions (id int(4) primary key,name varchar(30),fdate date,tdate date,price float(7,2));";
        DBC.ExecuteSQL(con, sql);
        sql="create table if not exists suppliers (id int(4) primary key,name varchar(30), mobile varchar(15),address varchar(400));";
        DBC.ExecuteSQL(con, sql);
        sql="Insert into members values(0,'admin','male',14,'Library DAV',0,'admin')";
        DBC.ExecuteSQL(con, sql);
        
        DBC.DisconnectDB(con);
    }
}
