<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<!-- 侧边栏 -->
<div class="sidebar" data-background-color="white" data-active-color="danger">

    <!--
		Tip 1: you can change the color of the sidebar's background using: data-background-color="white | black"
		Tip 2: you can change the color of the active button using the data-active-color="primary | info | success | warning | danger"
	-->

    	<div class="sidebar-wrapper">
            <div class="logo">
                <a href="#" class="simple-text">
                    News
                </a>
            </div>

            <ul class="nav">
                <li class="active">
                    <a href="main.jsp">
                        <i class="ti-panel"></i>
                        <p>首页</p>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath }/Manager_findByName.action?managerName=${sessionScope.managerName }">
                        <i class="ti-user"></i>
                        <p>用户信息</p>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath }/Manager_findAllPage.action">
                        <i class="ti-user"></i>
                        <p>管理员列表</p>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath }/Manager_toAdd.action">
                        <p>新增管理员</p>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath }/Article_findAllPage.action">
                        <i class="ti-view-list-alt"></i>
                        <p>文章列表</p>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath }/Article_toAdd.action">
                        <p>新增文章</p>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath }/Catalog_findAll.action">
                        <i class="ti-pencil-alt2"></i>
                        <p>栏目列表</p>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath }/Catalog_toAdd.action">
                        <p>新增栏目</p>
                    </a>
                </li>
                <li>
                    <a href="maps.html">
                        <i class="ti-map"></i>
                        <p>图片管理</p>
                    </a>
                </li>
                <!-- 
                <li>
                    <a href="notifications.html">
                        <i class="ti-bell"></i>
                        <p>Notifications</p>
                    </a>
                </li>
				<li class="active-pro">
                    <a href="upgrade.html">
                        <i class="ti-export"></i>
                        <p>Upgrade to PRO</p>
                    </a>
                </li>
                -->
            </ul>
    	</div>
    </div>