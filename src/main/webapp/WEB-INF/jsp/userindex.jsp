<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/26 0026
  Time: 18:55
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
    <p class="left">您好:${userzh}，欢迎回来！</p>
    <p class="right"><a href="user/tologin">登陆</a> | <a href="user/toregUser">注册</a> | <a href="#">我的购物车</a> | <a href="#">网站首页</a></p>
    <div class="fixed"></div>
</div>
<div id="header_div">
    <div id="search">
        <!--下面form标签的id属性不能修改，因为在css中使用了一个id选择器-->
        <form id="form">
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
<!--con-->
<div class="w960 mt10">
    <div class="side left">
        <h3>图书分类</h3>
        <ul class="classify bgf7e4e4 bdf7e4e4">
            <li> <a href="user/totypelist?tId=1">文艺</a></li>
            <li> <a href="user/totypelist?tId=2">小说</a></li>
            <li> <a href="user/totypelist?tId=3">青春</a></li>
            <li> <a href="user/totypelist?tId=4">童书</a></li>
            <li> <a href="user/totypelist?tId=5">励志/成功</a></li>
            <li> <a href="user/totypelist?tId=6">生活</a></li>
            <li> <a href="user/totypelist?tId=7">人文社科</a></li>
            <li> <a href="user/totypelist?tId=8">经管</a></li>
            <li> <a href="user/totypelist?tId=9">科技</a></li>
            <li> <a href="user/totypelist?tId=10">教育</a></li>
            <li> <a href="user/totypelist?tId=11">工具书</a></li>
            <li> <a href="user/totypelist?tId=12">期刊</a></li>
            <div class="fixed"></div>
        </ul>
    </div>
    <div class="w740 right">
        <div class="main_div">
            <div class="banner left"><img src="images/banner.png" /></div>
            <div class="fixed"></div>
        </div>
        <div class="main_div mt10">
            <h2>
                <cite class="left">新书上架</cite>
                <div class="fixed"></div>
            </h2>

            <ul class="arivals">
                <c:forEach items="${bookList}" var="bl">
                <li>
                    <a href="#"><img src="imgs/9.png" /></a><p>${bl.bBt}</p><p class="red">￥${bl.bJg}</p>
                </li>
                </c:forEach>
                <div class="fixed"></div>
            </ul>

        </div>
        <div class="main_div mt10">
            <h2>
                <cite class="left">热销图书</cite>
                <div class="fixed"></div>
            </h2>
            <ul class="arivals">
                <c:forEach items="${booktopList}" var="bkl">
                <li>
                    <a href="#"><img src="imgs/1.png" /></a><p>${bkl.bBt}</p><p class="red">￥${bkl.bJg}</p>
                </li>
                </c:forEach>
                <div class="fixed"></div>
            </ul>
        </div>
    </div>
    <div class="fixed"></div>
</div>
<!--end con-->
<!--footer-->
<div id="footer_wrap">
    <p>Copyright ©2014 飞凡教育，版权所有</p>
</div>
<!--end footer-->
</body>
</html>

