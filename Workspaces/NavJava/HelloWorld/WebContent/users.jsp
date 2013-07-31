<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%
	// verificando se tem um atributo login na sessao
	// se tiver vai continuar e mostrar o menu
	if(session.getAttribute("login") != null) {
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="keywords" content="" />
<meta name="description" content="" />
<title>Users - Marca Séries</title>
<link rel="stylesheet" type="text/css" href="estilo/home.css">
<link rel="stylesheet" type="text/css" href="estilo/default.css">
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
<style type="text/css">
      @import "data_table/media/css/demo_page.css";
      @import "data_table/media/css/demo_table.css";
</style>
 <script type="text/javascript" language="javascript" src="data_table/media/js/jquery.js"></script>
 <script type="text/javascript" language="javascript" src="data_table/media/js/nightly.js"></script>
 <script>
 $(document).ready(function(){
	$('#example').dataTable();
});
 </script>
</head>
<body>
<div id="wrapper">
	<div id="header" class="container">
		<div id="logo">
			<h1>Marca Séries</h1>
		</div>
		<div id="menu">
			<ul>
				<li><a href="home.jsp" accesskey="1" title="Home Page">Home Page</a></li>
				<li class="current_page_item"><a href="users.jsp" accesskey="2" title="Users">Users</a></li>
				<li><a href="#" accesskey="3" title="">About Us</a></li>
				<li><a href="#" accesskey="4" title="">Careers</a></li>
				<li><a href="LoginServlet?acao=logout" accesskey="5" title="">Exit</a></li>
			</ul>
		</div>
	</div>
	<div id="page" class="container">
		<div id="content">
			<div id="dt_example">
				<div id="container">
					 <%@ page import="com.banco.UserDao" %>  
		             <%@ page import="java.util.List" %>  
		             <%@ page import="com.classes.User" %>
		            <table cellpadding="0" cellspacing="0" border="0" class="display" id="example">
		            <thead>
		             <tr>
		             <th>Login</th>
		             <th>Nome Completo</th>
		             <th>Idade</th>
		             </tr>
		             </thead>
		             <tbody>
		             <% UserDao dao = new UserDao();
		     		
		     		 List<User> users = dao.getLista();
		     		
		     		for (User user : users) {
		     			%>	
		     			<tr class="gradeC">
		     			<td align="center"><%out.print(user.getLogin());%></td>
		     			<td align="center"><%out.print(user.getNome_completo());%></td>
		     			<td align="center"><%out.print(user.getIdade());%></td>
		     			<% }
		             %>
		             </tr>
		             <tbody>
		            </table> 
				</div>
			</div>
			<div align="left">
		       <a href="cadastro_user.jsp"><img src="imagens\icon_cadastro.jpg" alt="Cadastrar" width="40" height="40"></a>
		    </div>
			<div class="article">
				<div class="title">
				</div>
			</div>
		</div>
		<div id="sidebar">
			<div class="box1">
				<div class="title">
				</div>
				<ul class="style2">
				</ul>
			</div>
			<div class="box2">
				<div class="title">
				</div>
				<ul class="style2">
				</ul>
			</div>
			<div class="box3">
				<div class="title">
				</div>
				<ul class="style2">
				</ul>
			</div>
		</div>
	</div>
</div>
<div id="footer-wrapper">
	<div id="portfolio" class="container">
		<div id="column1">
	    </div>
		<div id="column2">
		</div>
		<div id="column3">
		</div>
		<div id="column4">
		</div>
	</div>
</div>
 </body>
</html>
<%
	// se não existir um login na sessao, 
	// vai enviar para a página de login novamente
	} else {
%>
	<jsp:forward page="index.jsp"></jsp:forward>
<%
}
%>