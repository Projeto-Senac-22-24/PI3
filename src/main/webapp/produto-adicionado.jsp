
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
  <div>
   <table>
   <tr>
   <th>Nome</th>
   <th>Descrição</th>
   <th>Valor</th>
   <th>Categoria</th>
   </tr>
   <c:forEach var="produto" items="${produto}">
   <tr>
      <td> ${produto.Nome}</td>
      <td> ${produto.Descri}</td>
      <td> ${produto.Valor}</td>
      <td> ${produto.Categoria}</td>
      <td>Remover</td>
   </tr>
   </c:forEach>
   </table>
   </div>


</body>
</html>
