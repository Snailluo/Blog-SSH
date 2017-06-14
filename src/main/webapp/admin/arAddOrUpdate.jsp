<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Add or Update</title>

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
                                <h4 class="title">Insert or Updata</h4>
                            </div>
                            <div class="content">
                                <form method="post" action="${pageContext.request.contextPath }/Article_addOrUpdate.action">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label>文章标题</label>
                                                <input name="artitle" type="text" class="form-control border-input" 
                                                	placeholder="栏目标题" value="${article.artitle }">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>文章作者</label>
                                                <input name="aruser" type="text" class="form-control border-input" 
                                                	placeholder="文章作者" 
                                                	<c:choose>
	                                                	<c:when test="${article.arid == null }">
	                                                		value = "${sessionScope.managerName }"
	                                                	</c:when>
	                                                	<c:otherwise>
	                                                		value = "${article.aruser}"
	                                                	</c:otherwise>
                                                	</c:choose>
                                                	>
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>所属栏目</label>
                                                <select class="form-control" name="catalog.caid">
                                                
                                                	<c:forEach items="${clist }" var="catalog">
                                                	
                                                		<option value="${catalog.caid }"
                                                			<c:if test="${catalog.caid == article.catalog.canumber }" >
                                                				selected="selected"
                                                			</c:if>
                                                		>
                                                			<c:out value="${catalog.caname }"/>
                                                		</option>
                                                	</c:forEach>
                                                	
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label>文章内容</label>
                                                	
                                                    <textarea id="container" name="arcontent" ></textarea>
                                                    <!-- 
                                                    <script id="container" name="content" type="text/plain">
														
													</script>
													-->
                                            </div>
                                        </div>
                                    </div>
                                    
                                    <div class="row">
                                        <div class="col-md-5">
                                            <div class="form-group">
                                                <label>文章状态</label>
                                                <select class="form-control" name="arstate">
                                                <c:choose>
                                                	<c:when test="${article.arstate == 1 }">
                                                		<option selected="selected" value="1">可用</option>
                                                		<option value="0">不可用</option>
                                                	</c:when>
                                                	<c:otherwise>
                                                		<option value="1">可用</option>
                                                		<option selected="selected" value="0">不可用</option>
                                                	</c:otherwise>
                                                </c:choose>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="text-center">
                                        <button type="submit" class="btn btn-info btn-fill btn-wd">确定</button>
                                        <input type="hidden" name="arid" value="${article.arid}" />
                                        <input type="hidden" name="artime" value="${article.artime}" />
                                    </div>
                                    <div class="clearfix"></div>
                                </form>
                            </div>
                        </div>
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
                    &copy; <script>document.write(new Date().getFullYear())</script>, made with <i class="fa fa-heart heart"></i> by <a href="#">Creative Tim</a>.
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
	
	<!-- 配置文件 -->
    <script type="text/javascript" src="utf8-jsp/ueditor.config.js"></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="utf8-jsp/ueditor.all.js"></script>
    <!-- 实例化编辑器 -->
    <script type="text/javascript">
    
        var editor = UE.getEditor('container', {
        	initialFrameWidth:[1000],
        	initialFrameHeight:[400]
        });
        
        var outputContent = "${article.arcontent }";
        
        editor.ready(function() {
			editor.setContent(outputContent);
		});
        
    </script>

</html>
