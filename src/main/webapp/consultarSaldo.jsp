<%-- 
    Document   : consultarSaldo
    Created on : 8/04/2017, 12:17:58 AM
    Author     : Usuario
--%>

<%
    String saldoActual = (String)request.getAttribute("miSaldo");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--meta http-equiv="Content-Type" content="text/html; charset=UTF-8"-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Consulta de Saldo</title>
    </head>
    <body>
        <h2>Practica3 Analisis y Diseño de Sistemas 1</h2>
        <h1>bancoFiusac</h1>
        <h2>Consulta de Saldo</h2>
        <form action = "consultaSaldo.do" method = "post">
        <h1>Su saldo actual es de:</h1>
        <p>Q. <%= saldoActual %> </p> <br/>
        <a href = "Menu.jsp">Menu Principal</a>
        </form>
    </body>
</html>
