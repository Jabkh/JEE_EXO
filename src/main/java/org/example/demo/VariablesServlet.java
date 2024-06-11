package org.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "variableServlet", value = "/variables")
public class VariablesServlet extends HttpServlet {

    private List<Personne> personnes;

    @Override
    public void init() throws ServletException {
        personnes = new ArrayList<>();
        personnes.add(new Personne("Prenom1", "Nom1", 25));
        personnes.add(new Personne("Prenom2", "Nom2", 30));
        personnes.add(new Personne("Prenom3", "Nom3", 35));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personnes", personnes);
        getServletContext().getRequestDispatcher("/personnes.jsp").forward(req, resp);
    }
}
