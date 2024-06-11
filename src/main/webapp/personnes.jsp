<%@ page import="org.example.demo.Personne" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des Personnes</title>
    <%@ include file="bootstrap-includes.html" %>
</head>
<body>
<div class="container mt-5">
    <h1 class="mb-4">Liste des Personnes</h1>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Age</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<Personne> personnes = (List<Personne>) request.getAttribute("personnes");
            for (Personne person : personnes) {
        %>
        <tr>
            <td><%= person.getPrenom() %></td>
            <td><%= person.getNom() %></td>
            <td><%= person.getAge() %></td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>


</body>
</html>
