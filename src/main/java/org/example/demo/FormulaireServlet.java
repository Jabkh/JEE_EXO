package org.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "formServlet", value = "/formulaire")
public class FormulaireServlet extends HttpServlet {

    private String myInitParam;

    @Override
    public void init() throws ServletException {
        myInitParam = getServletContext().getInitParameter("MonParametreInit");
        System.out.println(myInitParam);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String mode = req.getParameter("mode");
        System.out.println(mode);
        req.setAttribute("mode", mode);

        getServletContext().getRequestDispatcher("/WEB-INF/addChat.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nom = req.getParameter("nom");
        String race = req.getParameter("race");
        String repasFavori = req.getParameter("repasFavori");
        String dateNaissanceStr = req.getParameter("dateNaissance");

        LocalDate dateNaissance = LocalDate.parse(dateNaissanceStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        Chat chat = new Chat(nom, race, repasFavori, dateNaissance);

        System.out.println("Nom: " + chat.getNom());
        System.out.println("Race: " + chat.getRace());
        System.out.println("Repas Favori: " + chat.getRepasFavori());
        System.out.println("Date de Naissance: " + chat.getDateNaissance());;

        req.getSession().setAttribute("newChat", chat);

        req.setAttribute("chat", chat);
        getServletContext().getRequestDispatcher("/chats.jsp").forward(req, resp);
    }
}
