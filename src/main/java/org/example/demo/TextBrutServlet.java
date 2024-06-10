package org.example.demo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "monServlet",value = "/monServlet")
public class TextBrutServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Voilà du texte brut");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Un requete GET a ete envoyée à /monServlet");

        resp.setContentType("text/plain");

        PrintWriter writer = resp.getWriter();

        writer.println("Text brut");
    }

    @Override
    public void destroy() {
        System.out.println("monServlet est détruit !!!");
    }
}
