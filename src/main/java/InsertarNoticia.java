
import java.io.IOException;
import static java.lang.System.out;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Eryck Tz
 */
public class InsertarNoticia {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String titulo = request.getParameter("titulo").toString().trim();
        String datAbstract = request.getParameter("datAbstract").toString().trim();
        String byLine = request.getParameter("byLine").toString().trim();
        String urlFoto = request.getParameter("urlFoto").toString().trim();

      insertarNoticia(titulo, datAbstract, byLine, urlFoto);

        HttpSession sesion = request.getSession();
        String jsonString;
    }

    public void insertarNoticia(String titulo, String datAbstract, String byLine, String urlFoto) {

        try {

            Statement statement = VariablesGlobales.conn.createStatement();
            String consulta = "INSERT INTO noticiasprueba (titulo,abstract,byline,url_foto) values ('" + titulo + "','" + datAbstract + "','" + byLine + "','" + urlFoto + "')";

            statement.executeUpdate(consulta);

        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }

    }

}
