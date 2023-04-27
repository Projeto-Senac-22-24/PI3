<%@ page import ="java.sql.Connection, br.com.SuplaMentePI.servlet.Conexao.ConnectionFactory, br.com.SuplaMentePI.servlet.dao.ProdutoDao, java.util.*, br.com.SuplaMentePI.servlet.modelos.*" %>
<%@ page pageEncoding ="UTF-8"%>
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
   <%
     Connection connection = ConnectionFactory.getConnection();
     ProdutoDao dao = new ProdutoDao(connection);
     List<Produto> produtos = dao.findAll();

     for(Produto produto : produtos){
   %>
   <tr>
      <td><%= produto.getNome()%></td>
      <td><%= produto.getDescri()%></td>
      <td><%= produto.getValor()%></td>
      <td><%= produto.getCategoria()%></td>
      <td><a href="/deleta-produto">Remover</a></td>
   </tr>
   <%
   }
   %>
   </table>


</body>
</html>

