package com.medical;

import java.io.IOException;
import java.sql.connection;
import java,sql.preparedStatement;

public class medicineServlet extends
HttpServlet{
    protected void dopost(
        HttpservletRequest request,
        httpservletResponce responce
    ) throws ServletException,
    IOException{
        try {
            
        } catch (connection con=DBConnection.getconnection
        ps.setString(1,name);
        ps.setString(2,dose);
        ps.setString(3,time);
        ps.setString(4,date);

        ps.executeUpdate();
        }
    }
    );
}