<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>文章</title>
	<link rel="stylesheet" type="text/css" href="style/css/bootstrap.css">
</head>
<body>
	<jsp:include page="header.jsp" />
	<c:forEach items="${pageBean.list }" var="article">
			
		<div class="container">
			<div>
				<div class="page-header">
					<h3>
						<a href="${pageContext.request.contextPath }/Web_article.action?arid=${article.arid }">
							<c:out value="${article.artitle }"></c:out>
						</a>
					</h3>
				</div>
				<div class="row">
					<div class="col-md-8">
						<p><c:out value="${article.arcontent }"></c:out></p>
					</div>
					<div class="col-md-4">
						<p><c:out value="${article.artime }"></c:out></p>
					</div>
				</div>
			</div>
		</div>
			
	</c:forEach>
	
	<nav aria-label="Page navigation">
	    <ul class="pager">
		    <li id="frist"><a href="${pageContext.request.contextPath }/Web_index.action">首页</a></li>
		    <li id="pre"><a href="${pageContext.request.contextPath }/Web_index.action?page=${pageBean.page-1 }">上一页</a></li>
		    <li id="next"><a href="${pageContext.request.contextPath }/Web_index.action?page=${pageBean.page+1 }">下一页</a></li>
		    <li id="last"><a href="${pageContext.request.contextPath }/Web_index.action?page=${pageBean.pageCount }">末页</a></li>
	    </ul>
    </nav>
	
	<jsp:include page="bottom.jsp" />
</body>
	<script src="assets/js/jquery-1.10.2.js" type="text/javascript"></script>
	<script type="text/javascript">
		var page = ${pageBean.page };
		var pageCount = ${pageBean.pageCount };

		$(document).ready(function(){
			if(page == 1){
				//首页
				$("#frist").addClass("disabled");
				$("#pre").addClass("disabled");
			}
			if(page == pageCount){
				//末页
				$("#next").addClass("disabled");
				$("#last").addClass("disabled");
			}
		});

		
	</script>
</html>