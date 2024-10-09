package ar.edu.centro8.desarrollo.tp2.servlets;

import ar.edu.centro8.desarrollo.tp2.models.Cliente;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




@WebServlet("/cliente")
public class ClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Cliente> listaClientes = new ArrayList<> ();
        listaClientes.add(new Cliente("98765432","Pedro","Picapiedras","11225577"));
        listaClientes.add(new Cliente("86429753","Pablo","Marmol","33446688"));
        listaClientes.add(new Cliente("24689753","Vilma","Picapiedras","22557799"));
        listaClientes.add(new Cliente("24689753","Betty","Marmol","44669988"));
        
        HttpSession misession = request.getSession();
        misession.setAttribute("listaClientes",listaClientes);
        
        response.sendRedirect("MostrarJSP.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        response.sendRedirect("formulario.jsp");
    }
}
