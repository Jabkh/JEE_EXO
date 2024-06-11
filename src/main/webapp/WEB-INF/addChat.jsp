<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajouter un Chat</title>
    <%@ include file="/bootstrap-includes.html" %>
</head>
<body>
<div class="container mt-5">
    <h1>Ajouter un Chat</h1>
    <form action="formulaire" method="post">
        <div class="mb-3">
            <label for="nom" class="form-label">Nom</label>
            <input type="text" class="form-control" id="nom" name="nom" required>
        </div>
        <div class="mb-3">
            <label for="race" class="form-label">Race</label>
            <input type="text" class="form-control" id="race" name="race" required>
        </div>
        <div class="mb-3">
            <label for="repasFavori" class="form-label">Repas Favori</label>
            <input type="text" class="form-control" id="repasFavori" name="repasFavori" required>
        </div>
        <div class="mb-3">
            <label for="dateNaissance" class="form-label">Date de Naissance</label>
            <input type="date" class="form-control" id="dateNaissance" name="dateNaissance" required>
        </div>
        <button type="submit" class="btn btn-primary">Ajouter le Chat</button>
    </form>
</div>
</body>
</html>
