/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.mysql;

/**
 *
 * @author cley
 */
@WebServlet("/Registro")
public class insert extends HttpServlet{

    
       @Override
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
    //String dni=requequest.get
    res.setContentType("text/html");
    // para escribir codigo java
   PrintWriter out= res.getWriter();
    //req.getParameter(string)
    out.print("<html><body>");
    out.print("<h2>---</h2>");
    out.print("</body></html>");
    out.close();
}  

       @Override
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
           try {
               //String dni=requequest.get
               res.setContentType("text/html");
               // para escribir codigo java
                int dni=Integer.parseInt(req.getParameter("Rdni"));
               String nombre=req.getParameter("Rnombre");
               String apellido=req.getParameter("Rapellido");
               String nacionalidad=req.getParameter("Rnacionalidad");
               
               Statement st = null;
               ResultSet rs = null;
               Connection con = null;
               //PreparedStatement pre = null;
               con= mysql.conection();
               st=con.createStatement();
               
               //String sql="insert persona (ID,DNI,Nombre,Apellido,Nacionalidad)value(4,'2','2','3','2')";
//String sql="insert persona (DNI,Nombre,Apellido,Nacionalidad)value(?,'2','3','2')";
             String sql="insert persona (DNI,Nombre,Apellido,Nacionalidad)value('"+dni+"','"+nombre+"','"+apellido+"','"+nacionalidad+"')";

//PreparedStatement pre=con.prepareStatement(sql);
  //             pre.setInt(1, dni);
               //pre.setInt(2, dni);
               //pre.setInt(3, dni);
               //pre.setInt(1, dni);
              // pre.execute();
st.executeUpdate(sql);
               PrintWriter out= res.getWriter();
               out.print("<html><body>");
               out.print("<h2>hola s</h2>");
               out.print("</body></html>");
               out.close();
           } catch (SQLException ex) {
               Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
           }
}  


    
}
