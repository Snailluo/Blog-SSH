<%@page import="com.news.entity.Manager"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Paper Dashboard by Creative Tim</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />


    <!-- Bootstrap core CSS     -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />

    <!-- Animation library for notifications   -->
    <link href="assets/css/animate.min.css" rel="stylesheet"/>

    <!--  Paper Dashboard core CSS    -->
    <link href="assets/css/paper-dashboard.css" rel="stylesheet"/>

    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="assets/css/demo.css" rel="stylesheet" />

    <!--  Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'>
    <link href="assets/css/themify-icons.css" rel="stylesheet">

</head>

<body>

<div class="wrapper">

	<!-- 侧边导航栏 -->
	<%@include file="sidebar.jsp"%>

    <div class="main-panel">
		<%@include file="top.jsp"%>


        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">
                                	<a href="${pageContext.request.contextPath }/Article_toAdd.action" style="color: #EB5E28">增加文章</a>
                                </h4>
                            </div>
                            <div class="content table-responsive table-full-width">
                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                        	<th>文章标题</th>
                                        	<th>文章作者</th>
                                        	<th>所属栏目</th>
                                        	<th>文章大概内容</th>
                                        	<th>最后修改时间</th>
                                        	<th colspan="2">编辑</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    
                                    <c:forEach items="${pageBean.list }" var="article">
                                    	<tr class="odd">
                                            <td class="center">
                                            	<c:out value="${article.arid }"/>
                                            </td>
                                            <td class="center">
                                            	<c:out value="${article.artitle }"/>
                                            </td>
                                            <td class="center">
                                            	<c:out value="${article.aruser }"/>
                                            </td>
                                            <td class="center">
                                            	<c:out value="${article.catalog.caname }"/>
                                            </td>
                                            <td class="center">
                                            	<c:out value="${article.arcontent }"/>
                                            </td>
                                            <td class="center">
                                            	<c:out value="${article.artime }"/>
                                            </td>
                                            <td class="center"><a href="${pageContext.request.contextPath }/Article_findById.action?arid=${article.arid }">编辑</a></td>
                                            <td class="center"><a href="${pageContext.request.contextPath }/Article_delete.action?arid=${article.arid }">删除</a></td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <nav aria-label="Page navigation">
                            <ul class="pager">
	                            <li id="frist"><a href="${pageContext.request.contextPath }/Article_findAllPage.action" style="color: #EB5E28">首页</a></li>
	                            <li id="pre"><a href="${pageContext.request.contextPath }/Article_findAllPage.action?page=${pageBean.page-1 }" style="color: #EB5E28">上一页</a></li>
	                            <li id="next"><a href="${pageContext.request.contextPath }/Article_findAllPage.action?page=${pageBean.page+1 }" style="color: #EB5E28">下一页</a></li>
	                          	<li id="last"><a href="${pageContext.request.contextPath }/Article_findAllPage.action?page=${pageBean.pageCount }" style="color: #EB5E28">末页</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>

        <footer class="footer">
            <div class="container-fluid">
                <nav class="pull-left">
                    <ul>

                        <li>
                            <a href="#">
                                Creative Tim
                            </a>
                        </li>
                        <li>
                            <a href="http://blog.creative-tim.com">
                               Blog
                            </a>
                        </li>
                        <li>
                            <a href="#/license">
                                Licenses
                            </a>
                        </li>
                    </ul>
                </nav>
				<div class="copyright pull-right">
                    &copy; <script>document.write(new Date().getFullYear())</script>, made with <i class="fa fa-heart heart"></i> by <a href="#">Creative Tim</a>. More Templates
                </div>
            </div>
        </footer>


    </div>
</div>


</body>

	
    <!--   Core JS Files   -->
    <script src="assets/js/jquery-1.10.2.js" type="text/javascript"></script>
	<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>

	<!--  Checkbox, Radio & Switch Plugins -->
	<script src="assets/js/bootstrap-checkbox-radio.js"></script>

	<!--  Charts Plugin -->
	<script src="assets/js/chartist.min.js"></script>

    <!--  Notifications Plugin    -->
    <script src="assets/js/bootstrap-notify.js"></script>

    <!-- Paper Dashboard Core javascript and methods for Demo purpose -->
	<script src="assets/js/paper-dashboard.js"></script>

	<!-- Paper Dashboard DEMO methods, don't include it in your project! -->
	<script src="assets/js/demo.js"></script>

	<!-- 翻页按钮的js实现 -->
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
