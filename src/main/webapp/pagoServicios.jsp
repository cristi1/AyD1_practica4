<%-- 
    Document   : pagoServicios
    Created on : 8/04/2017, 12:30:46 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PAGO DE SERVICIOS</title>
    </head>
    <body>
        <h2>Practica3 Analisis y Diseño de Sistemas 1</h2>
        <h1>bancoFiusac</h1>
        <h2>Pago de Servicio</h2>
        
        <table style="width:30%">
          <tr>
            <th>Tipo Servicio</th>
            <th>No. Cuenta</th> 
          </tr>
          <tr>
            <td>Agua</td>
            <td>600789</td>
          </tr>
          <tr>
            <td>Luz</td>
            <td>610789</td>
          </tr>
          <tr>
            <td>Telefono</td>
            <td>620789</td>
          </tr>
          <tr>
            <td>Colegio</td>
            <td>630789</td>
          </tr>
        </table>
        <br/><br/>
        <form action = "pagoServicioControlador0" method = "post">
            Numero de Cuenta del Servicio: <input type ="text" name ="txtCuenta" placeholder="Introduzca Cuenta"/><br /><br/><br/>
            Tipo de Servicio a Pagar: <input type ="text" name ="txtTipo" placeholder="Introduzca Servicio"/><br /><br/><br/>
            Monto a Pagar: <input type ="text" name ="txtPago" placeholder="Introduzca monto"/><br /><br/><br/>
            <input type ="submit" value ="Realizar Pago"/><br/><br/>
            <a href = "Menu.jsp">Menu Principal</a>
        </form>
    </body>
</html>
