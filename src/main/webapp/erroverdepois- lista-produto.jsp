<%@ page pageEncoding ="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
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
   <th>Categoria</th>
   </tr>
<c:forEach var="produtos" items="${produtos}">
   <tr>
      <td> ${produtos.Nome}</td>
      <td> ${produtos.Descri}</td>
      <td> ${produtos.Valor}</td>
      <td> ${produtos.Categoria}</td>
   </tr>
</c:forEach>
   </table>


</body>
</html>