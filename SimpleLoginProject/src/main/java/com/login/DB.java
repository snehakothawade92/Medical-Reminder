package com.medical;
import java.sql.Connection;
import java.sql.connection;
import java.sql.DriverManager;

public class DBConnection{
    public static Connection
    getConnection()throws Exception{
        class.forname("com.mysql.cj.jdbc.driver");
        string url="jdbc:mysql://localhost/Medical_Reminder";
        string username ="root";
        string password =sneha@12345
        
        return 
        drivermanager.getconnection (
            url,username,password
        );
    }
}