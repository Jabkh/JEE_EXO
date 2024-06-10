package org.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name = "monServletJSP",value = "/monservlet-jsp2")
public class JSPServlet2 extends HttpServlet {

    private String nom;

    @Override
    public void init() throws ServletException {
        nom = "tonton";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("nom",nom);
        getServletContext().getRequestDispatcher("/test.jsp").forward(req,resp);
    }
}
