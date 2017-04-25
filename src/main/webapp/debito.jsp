<%-- 
    Document   : debito
    Created on : 8/04/2017, 12:24:59 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--meta http-equiv="Content-Type" content="text/html; charset=UTF-8"-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>DEBITO</title>
    </head>
    <body>
        <h2>Practica3 Analisis y Diseño de Sistemas 1</h2>
        <h1>bancoFiusac</h1>
        <h2>Debito</h2>
        <br/><br/>
        <form action = "debitoControlador" method = "post">
            Cuenta a Debitar: <input type ="text" name ="txtCuenta" placeholder="Introduzca Cuenta"/><br /><br/><br/>
            Monto a Debitar: <input type ="text" name ="txtMonto" placeholder="Introduzca monto"/><br /><br/><br/>
            Descripcion: <input type ="text" name ="txtDesc" placeholder="Introduzca Descripcion"/><br /><br/><br/>
            <input type ="submit" value ="Realizar Credito"/><br/><br/>
            <a href = "Menu.jsp">Menu Principal</a>
        </form>
    </body>
</html>
