package ar.edu.centro8.desarrollo.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="Calculadora", urlPatterns = "/")
public class CalculadoraServlet extends HttpServlet{
	
	
	
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String operacion = request.getParameter("operacion");
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        double resultado = 0;


        switch (operacion) {
            case "sumar":
                resultado = num1 + num2;
                break;
            case "restar":
                resultado = num1 - num2;
                break;
            case "multiplicar":
                resultado = num1 * num2;
                break;
            case "dividir":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    response.getWriter().print("Error: División por cero.");
                    return;
                }
                break;
            default:
                response.getWriter().print("Operación no válida.");
                return;
        }

        // Devolver el resultado
        response.getWriter().print("El resultado es: " + resultado);
    }
}