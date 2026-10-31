<% page import="java.sql.*,%>
<html>
    <head>
        <style>
            <h1>my Medicine Reminder<h1>
                <table border="1"
                cellpadding="8"
                cellspancing="0" width="100%">
                <tr>
                    <th>ID</th>
                    <th>medicine</th>
                    <th>dose</th>
                    <th>time</th>
                    <th>Start Date</th>
                    <%try(Connection con=DBConnection()
                    statement st=con.create Statement st=con.createStatement();
                    FROM medicines ORDER BY reminder_time")){
                        out.println("unable to load medicine reminders.");
                    loading medicine reminders from database");}
                        %>
                        </table>
                    }
        </style>
    </head>
</html>