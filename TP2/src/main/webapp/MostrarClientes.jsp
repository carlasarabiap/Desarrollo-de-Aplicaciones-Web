<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    <body>
        <h1>Lista de Clientes</h1>
        <ul>
            <% List<Cliente> listaClientes = (List<Cliente>) request.getAttribute("listaClientes"); %>
            <% for (Cliente cliente : listaClientes) { %>
                <li>
                    DNI: <%= cliente.getDni() %><br>
                    Nombre: <%= cliente.getNombre() %><br>
                    Apellido: <%= cliente.getApellido() %><br>
                    Teléfono: <%= cliente.getTelefono() %>
                </li>
            <% } %>
        </ul>
    </body>
</html>