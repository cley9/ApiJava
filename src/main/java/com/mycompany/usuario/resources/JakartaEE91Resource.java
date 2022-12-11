package com.mycompany.usuario.resources;

//import jakarta.ws.rs.Consumes;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sql.mysql;
import static sql.mysql.conection;
//import sql.mysql2;

/*
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 *
 * @author 
 */
@Path("RegistroP")
public class JakartaEE91Resource extends HttpServlet{
  @POST
    @Path("/insert")
  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
  @Produces(MediaType.TEXT_PLAIN)
   public Response ping(@FormParam("id") int id) throws SQLException{
     Statement st = null;
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement pre = null;
    con= mysql.conection();
    st=con.createStatement();
//    String sql="insert persona (ID,DNI,Nombre,Apellido,Nacionalidad)value(4,'2','2','3','2')";

        return Response
                .ok("ping Jakarta EE"+id)
                .build();
    }
    @GET
    @Path("/lista")
     @Produces("application/json")
    // @Consumes("/application/json")
   public String Persona() throws SQLException{
       
       Statement st = null;
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement pre = null;
    con= mysql.conection();
   
        st = con.createStatement();
        rs = st.executeQuery("Select * from persona");
        int id = 0;
        while (rs.next()) {
            id = rs.getInt(1);
            String dni = rs.getString(2);
            System.out.println("id -- " + id+"-- dni"+dni);
//            System.out.println("dni----" + dni);
       return""
               + "\n"+ dni;
        }
        return ""+id;
   }
    
    //json
    
}
