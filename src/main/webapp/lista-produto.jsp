<%@ page pageEncoding ="UTF-8"%>

<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="pt">
<head>
    <meta charset="UTF-8">

    <style>
        table {
          font-family: arial, sans-serif;
          border-collapse: collapse;
          width: 100%;
       }

       td, th {
         border: 1px solid #dddddd;
         text-align: left;
         padding: 8px;
       }

        tr:nth-child(even) {
          background-color: #dddddd;
       }
    </style>
    <h2> Lista de Produtos</h2>
    <title>Lista dos Produtos</title>
</head>
<body>
   <table>
   <tr>
   <th>Nome</th>
   <th>Descrição</th>
   <th>Valor</th>

   </tr>

   <tr>
       <td>${param.Nome}</td>
       <td>${param.Descri}</td>
       <td>${param.Valor}</td>


      <td><a href="/deleta-produto?id=${produto.id}">Remover</a></td>
   </tr>

   </table>


</body>
</html>
