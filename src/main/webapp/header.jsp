		<nav class="navbar navbar-default" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<a class="navbar-brand" href="${pageContext.request.contextPath }/Web_index.action">Logo</a>
				</div>
				<ul class="nav navbar-nav" role="tablist">
					<li>
						<a href="${pageContext.request.contextPath }/Web_index.action">首页</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath }/Web_articleList.action">文章</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath }/admin/login.jsp">后台</a>
					</li>
				</ul>
				<form class="navbar-form navbar-right" role="search">
			        <div class="form-group">
			        	<input type="text" class="form-control" placeholder="Search">
			        </div>
			        <button type="submit" class="btn btn-default">Search</button>
			    </form>
			</div>
		</nav>