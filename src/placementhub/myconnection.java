package placementhub;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditi
 */
import java.sql.*;
public class myconnection {
  public  Connection db;
    public myconnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            db=DriverManager.getConnection("jdbc:mysql://localhost/dbplacement","root","123456");
            Statement stmt = db.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS `tbcompany` (\n" +
                "  `id` int(11) NOT NULL,\n" +
                "  `cname` varchar(50) NOT NULL,\n" +
                "  `email` varchar(50) NOT NULL,\n" +
                "  `contact` varchar(50) NOT NULL,\n" +
                "  `address` varchar(50) NOT NULL,\n" +
                "  `tenth` double NOT NULL,\n" +
                "  `twelfth` double NOT NULL,\n" +
                "  `graduation` double NOT NULL,\n" +
                "  `password` varchar(50) NOT NULL\n" +
                ") ");
            stmt.execute("CREATE TABLE IF NOT EXISTS `tbstudent` (\n" +
                "  `rno` int(11) NOT NULL,\n" +
                "  `fname` varchar(50) NOT NULL,\n" +
                "  `lname` varchar(50) NOT NULL,\n" +
                "  `email` varchar(50) NOT NULL,\n" +
                "  `contact` varchar(50) NOT NULL,\n" +
                "  `address` varchar(50) NOT NULL,\n" +
                "  `tenth` double NOT NULL,\n" +
                "  `twelfth` double NOT NULL,\n" +
                "  `graduation` double NOT NULL,\n" +
                "  `fathername` varchar(50) NOT NULL,\n" +
                "  `password` varchar(50) NOT NULL\n" +
                ") ");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

    

