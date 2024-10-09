<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <h1>Datos del Cliente</h1>
        <form action="ClienteServlet" method="post">
            <table>
                <tr>
                    <td>Dni: </td>
                    <td><input type="text" name="dni" id="dni" required></td>
                </tr>
                <tr>
                    <td>Nombre: </td>
                    <td><input type="text" name="nombre" id="nombre"></td>
                </tr>
                <tr>
                    <td>Apellido: </td>
                    <td><input type="text" name="apellido" id="apellido"></td>
                </tr>
                <tr>
                    <td>Telefono: </td>
                    <td><input type="text" name="telefono" id="telefono"></td>
                </tr>
                <tr>
                    <td><button type="submit">Guardar cliente</button></td>
                    <td><button type="reset">Resetear formulario</button></td>
                </tr>
            </table>
        </form>
        
        <h1>Ver lista de clientes</h1>
        <p>Si desea ver todos los clientes haga click en el botón mostrar clientes</p>
        <form action="ClienteServlet" method="GET">
            <button type="submit">Mostrar Clientes</button>
        </form>
    </body>
</html>
