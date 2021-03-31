<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.cj.jdbc.Driver"); %>

<html>
<body>

 	 <% 
            Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/crudapi", "root", "admin@123");

            Statement statement = connection.createStatement() ;
            ResultSet resultset = statement.executeQuery("select * from employee") ; 
        %>
      
        <TABLE BORDER="1">
            <TR>
                <TH>ID</TH>
                <TH>Name</TH>
                <TH>Department</TH>
                <TH>Designation</TH>
                <TH>Salary</TH>
                <TH>Update</TH>
                <TH>Delete</TH>
            </TR>
            <% while(resultset.next()){ %>
            <TR>
                <TD contenteditable='true'> <%= resultset.getInt(1) %></td>
                <TD> <%= resultset.getString(2) %></TD>
                <TD> <%= resultset.getString(3) %></TD>
                <TD> <%= resultset.getString(4) %></TD>
                <TD> <%= resultset.getInt(5) %></TD>
                <TD> <a href="/SpringQ5/editEmployeeDetail/<%= resultset.getInt(1) %>">Edit</a> </TD>
                <TD> <a href="/SpringQ5/deleteEmployee.html/<%= resultset.getInt(1) %>">Delete</a>
            </TR>
            <% } %>
        </TABLE>
        
</body>
</html>