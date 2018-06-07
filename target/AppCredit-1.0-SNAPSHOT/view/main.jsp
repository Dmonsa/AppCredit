<%-- 
    Document   : main
    Created on : 23/05/2018, 07:52:11 PM
    Author     : sala312
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
              rel="stylesheet">
    </head>
    <body>
        <br>
        <br>
        <br>
        <br>            
        <div class="text-center">
            <form action="${pageContext.servletContext.contextPath}/IngresoServlet"
              method="post">
                <label for="exampleFormControlInput1">Listar Creditos ---> </label>
                <button type="submit" class="btn btn-primary" value="Listar" name="accion">Listar</button>
                <br>
                <br>
                <label for="exampleFormControlInput1">Credito mas utilizado ---> </label>
                <button type="submit" class="btn btn-primary">Aqui</button>
                <br>
                <br>
                <label for="exampleFormControlInput1">Credito mas acumulado y su valor ---> </label>
                <button type="submit" class="btn btn-primary" value="MaxMonto" name="accion">Acumulado</button>
                <br>
                <br>
                <label for="exampleFormControlInput1">Quienes prestan mas ---> </label>
                <button type="submit" class="btn btn-primary">Quien presta</button>
            </form>
        </div>
    </body>
</html>
