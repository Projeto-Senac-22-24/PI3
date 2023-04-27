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
    <h2>Adiciona Produtos ${param.Nome}</h2>
    <title>Adiciona Produtos</title>
</head>
<body>
<h2>Adiciona ${param.valor} Produtos</h2>
   <table>
   <tr>
   ${nome}
   ${param[Nome]}
   <th>Nome</th>
   <th>Descrição</th>
   <th>Valor</th>
   <th>Categoria</th>
   </tr>


   <tr>
      <td>${produto.Nome}</td>
      <td>${produto.nome}</td>
      <td>${param.Nome}</td>

   </tr>

   </table>


</body>
</html>