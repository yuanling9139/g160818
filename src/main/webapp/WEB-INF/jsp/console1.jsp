<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/27 0027
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>飞凡网上书店</title>
    <link href="css/main.css" rel="stylesheet" type="text/css" />
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <%@include file="/commom/head.jsp"%>
</head>
<body>
<!--top-->
<div id="top_div">
    <p class="left">您好${userzh}，欢迎来到飞凡网上书店后台界面 ！</p>
    <p class="right"><a href="#">后台管理</a> | <a href="#">退出系统</a> | <a href="#">网站首页</a></p>
    <div class="fixed"></div>
</div>

<div id="header_div">
    <div id="search">
        <!--form的id与下面文本框的id不能修改，因为使用了id选择器定义样式-->
        <form name="bookForm" id="form" method="post" action="#">
            <table width="413" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td>
                        <input type="text" name="" value="" id="input">
                    </td>
                    <td>
                        <input type="image" name="imageField" src="images/btn_search.png" />
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>
<!--nav-->
<div id="nav">
    <ul id="menu"></ul>
</div>
<!--end nav-->
<!--end top-->
<!--content-->
<div class="w960 mt10">
    <div class="breadcrumb"></div>
</div>
<div class="w960">
    <div class="side left">
        <!--nav-->
        <h4>书籍管理</h4>
        <ul class="classify E6">
            <li>&nbsp;&nbsp;<a href="gly/toglyadd">新&nbsp;&nbsp;增</a></li>
            <li>&nbsp;&nbsp;<a href="gly/glynotbook">未上架</a></li>
            <li>&nbsp;&nbsp;<a href="gly/toglynotbook">已上架</a></li>
            <li>&nbsp;&nbsp;<a href="gly/toglyendbook">已下架</a></li>
            <div class="fixed"></div>
        </ul>
        <h4>订单管理</h4>
        <ul class="classify E6">
            <li>&nbsp;&nbsp;<a href="#">未发货</a></li>
            <li>&nbsp;&nbsp;<a href="#">已发货</a></li>
            <li>&nbsp;&nbsp;<a href="#">已签收</a></li>
            <div class="fixed"></div>
        </ul>
        <!--end nav-->
    </div>
    <div class="w740 right">
    </div>
    <div class="fixed"></div>
</div>
<!--end content-->
<!--footer-->
<div id="footer_wrap">
    <p>Copyright ©2014 飞凡教育，版权所有</p>
</div>
<!--end footer-->
</body>
</html>

