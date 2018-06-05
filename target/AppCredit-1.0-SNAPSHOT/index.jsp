<%-- 
    Document   : index
    Created on : 4/06/2018, 10:06:13 PM
    Author     : dmons
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>CREDITO</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
              rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/signin.css" rel="stylesheet">
    </head>

    <body class="text-center">
        <form class="form-signin"
              action="${pageContext.servletContext.contextPath}/IngresoServlet"
              method="post">
            <!--img class="mb-4" src="http://www.construccionenacero.com/sites/construccionenacero.com/files/noticia/bc_07-16_n_5_copia.png" alt="" width="72" height="72"-->
            <h1 class="h4 mb-2 font-weight-normal">CREDITO</h1>   
            <div class="container">
                <div class="form-row">
                    <div class="col">
                    <div class="form-group">
                        <!--label for="exampleFormControlInput1">Numero de credito</label-->
                        <input type="text" name="txtcredito" class="form-control" id="exampleFormControlInput1" placeholder="Numero de credito">
                    </div>
                    <div class="form-group">
                        <!--label for="exampleFormControlInput1">Numero Documento</label-->
                        <input type="text" name="txtdocumento" class="form-control" id="exampleFormControlInput1" placeholder="Numero Documento">
                    </div>
                    <div class="form-group">
                        <!--label for="exampleFormControlInput1">Nombres</label-->
                        <input type="text" name="txtnombres" class="form-control" id="exampleFormControlInput1" placeholder="Nombres">
                    </div>
                    <div class="form-group">
                        <!--label for="exampleFormControlInput1">Apellidos</label-->
                        <input type="text" name="txtapellidos" class="form-control" id="exampleFormControlInput1" placeholder="Apellidos">
                    </div>
                    </div>
                </div>
                <div class="form-group">
                    <!--label for="exampleFormControlInput1">Monto a prestar</label-->
                    <input type="text" name="txtmonto" class="form-control" id="exampleFormControlInput1" placeholder="Monto a prestar">
                </div>
                <!--div class="slidecontainer">
                    <input type="range" min="500" max="3000" value="50" class="slider" id="myRange">
                </div-->
                <div class="form-group">
                    <label for="exampleFormControlSelect1">Tipo trabajador</label>
                    <select class="form-control" name="txttipotrabajador" id="exampleFormControlSelect1">
                        <option>Independiente</option>
                        <option>Dependiente</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="exampleFormControlSelect1">Tipo de credito</label>
                    <select class="form-control" name="txttipocredito" id="exampleFormControlSelect1">
                        <option>Vivienda</option>
                        <option>Estudio</option>
                        <option>Libre Inversion</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="exampleFormControlSelect1">Trabaja en la compañia</label>
                    <select class="form-control" name="txttcompania" id="exampleFormControlSelect1">
                        <option>Si</option>
                        <option>No</option>
                    </select>
                </div>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit" name="accion" value="Guardar">Ingresar</button>            
        </form>
    </body>
</html>
