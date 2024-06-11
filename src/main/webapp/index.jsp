<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP - Hello World</title>

    <%@ include file="bootstrap-includes.html" %>

    </head>
<body>
<div class="container mt-5">
    <h1 class="text-primary"><%= "Hello World!" %></h1>
    <br/>
    <a class="btn btn-primary" href="montext">Texte Brut</a>
    <br/><br/>
    <a class="btn btn-success" href="hello-servlet">HTML</a>
    <br/><br/>
    <a class="btn btn-info" href="monservlet-jsp">JSP</a>
    <br/><br/>
    <a class="btn btn-info" href="monservlet-jsp">JSP2</a>
    <br/><br/>
    <a class="btn btn-info" href="monservlet-jsp">JSP3</a>
    <br/><br/>
    <a class="btn btn-info" href="variables">Exercice3</a>
</div>

<%--<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>--%>
<%--<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>--%>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
