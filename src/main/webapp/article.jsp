﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" type="text/css" href="style/css/bootstrap.css">
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="jumbotron">
		<div class="container">
			<div class="page-header">
				<h1>
					<c:out value="${article.artitle }"></c:out>
				</h1>
			</div>
			<p>
				<c:out value="${article.arcontent }"></c:out>
			</p>
		</div>
	</div>
	<jsp:include page="bottom.jsp" />
</body>
</html>