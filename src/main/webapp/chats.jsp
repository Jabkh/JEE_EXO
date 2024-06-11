<%@ page import="org.example.demo.Chat" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des Chats</title>
    <%@ include file="bootstrap-includes.html" %>
</head>
<body>
<div class="container mt-5">
    <h1 class="mb-4">Liste des Chats</h1>

    <a href="formulaire" class="btn btn-success mb-4">Ajouter un Chat</a>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nom</th>
            <th>Race</th>
            <th>Repas Favori</th>
            <th>Date de naissance</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<Chat> chats = (List<Chat>) session.getAttribute("chats");
            if (chats == null) {
                chats = new ArrayList<>();
                session.setAttribute("chats", chats);
            }

            Chat newChat = (Chat) request.getAttribute("chat");
            if (newChat != null) {
                chats.add(newChat);
            }

            if (!chats.isEmpty()) {
                for (Chat chat : chats) {
        %>
        <tr>
            <td><%= chat.getNom() %></td>
            <td><%= chat.getRace() %></td>
            <td><%= chat.getRepasFavori() %></td>
            <td><%= chat.getDateNaissance() %></td>
        </tr>
        <%
            }
        } else {
        %>
        <tr>
            <td colspan="4">Aucun chat à afficher</td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>
</body>
</html>
