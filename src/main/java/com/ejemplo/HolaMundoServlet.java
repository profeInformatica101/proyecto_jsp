package com.ejemplo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hola")
public class HolaMundoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Establece un atributo para pasar a la página JSP
        request.setAttribute("mensaje", "Hola desde el Servlet!");

        // Redirige la solicitud a la página JSP
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
