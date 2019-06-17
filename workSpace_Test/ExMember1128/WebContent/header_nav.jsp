<header id="header" id="home">	
		<div class="container main-menu">
			<div class="row align-items-center justify-content-between d-flex">
				<div id="logo">
					<a href="main.jsp"><img src="img/fav.png" alt="" title="" /> Digital</a>
				</div>
				<nav id="nav-menu-container">
					<ul class="nav-menu">
						<li class="menu-active"><a href="main.jsp">home</a></li>
						<%
							String id = (String)session.getAttribute("id");
						    if( id == null ){
						%>
						<li><a href="registerForm.jsp">register</a></li>
						<li><a href="loginForm.jsp">Login</a></li>
						<% }else{ %>
						<li><a href="#">member list</a></li>
						<li><a href="modify.jsp">member modify</a></li>
						<li><a href="#"><%=id %>(login) </a></li>
						<li><a href="logout.jsp">logout </a></li>
						<%} %>
					</ul>
				</nav>
				<!--######## #nav-menu-container -->
			</div>
		</div>
	</header>