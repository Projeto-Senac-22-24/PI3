<%@ page import ="java.sql.Connection, br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory, br.com.SuplaMentePI.servlet.dao.ProdutoDao, java.util.*, br.com.SuplaMentePI.servlet.modelos.*" %>
<%@ page pageEncoding ="UTF-8"%> //pra aceita frescuras da lingua portuguesa
<!DOCTYPE html>
<html lang="pt">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<c:forEach var="produto" items="${produto}">

   <tr>
      <td>${produto.Nome}</td>
      <td>${produto.nome}</td>
      <td>${param.Nome}</td>

   </tr>
</c:forEach>

   </table>


</body>
</html>