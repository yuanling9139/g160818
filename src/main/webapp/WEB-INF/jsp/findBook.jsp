<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/26 0026
  Time: 23:16
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
    <c:if test="${userzh!=null}">
        <p class="left">您好:${userzh}，欢迎回来！</p>
    </c:if>
    <p class="left">您好，欢迎来到飞凡网上书店 ！</p>
    <p class="right"><a href="#">登陆</a> | <a href="#">注册</a> | <a href="#">我的购物车</a> | <a href="#">网站首页</a></p>
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

            <li> <a href="#">文艺</a></li>

            <li> <a href="#">小说</a></li>

            <li> <a href="#">青春</a></li>

            <li> <a href="#">童书</a></li>

            <li> <a href="#">励志/成功</a></li>

            <li> <a href="#">生活</a></li>

            <li> <a href="#">人文社科</a></li>

            <li> <a href="#">经管</a></li>

            <li> <a href="#">科技</a></li>

            <li> <a href="#">教育</a></li>

            <li> <a href="#">工具书</a></li>

            <li> <a href="#">期刊</a></li>

            <div class="fixed"></div>
        </ul>

    </div>

    <div class="w740 right">
        <div class="order02 pb10">
            <c:forEach items="${listtype}" var="it">
            <dl class="findbook">
                <dt class="left"><img src="imgs/1.png" /></dt>
                <dd class="right">
                    <h4>${it.bBt}</h4>
                    <p><strong>作者：</strong>${it.bZz}</p>
                    <p><strong>价格：</strong>${it.bJg}</p>
                    <p><strong>出版社：</strong>${it.bCbs}</p>
                    <p><strong>书籍简介：</strong>${it.bSjjj}</p>
                    <p class="mt10"><a href="user/addshopping?bId=${it.bId}&uId=${userid}&sNum=${it.bJg}&tId=${it.tId}"><img src="images/btn_shopping.png" /></a><a href="#"><img src="images/btn_accounts.png" /></a> </p>
                </dd>
                <div class="fixed"></div>
            </dl>
            </c:forEach>
        </div>

        <!-- page -->
        <div style="text-align: right;">
            每页 5 行 共 9 行 第 1 页 共 2 页 <a href='javascript:gotoPage(1)'>首页</a> <a href='javascript:gotoPage(1)'>上一页</a> <a href='javascript:gotoPage(2)'>下一页</a> <a href='javascript:gotoPage(2)'>尾页</a> 页数 <input type='text' id='pageNumber'  style='width:20px;' /> <a href='javascript:jumpPage()'>GO</a>
        </div>
        <!-- end page -->

    </div>
    <div class="fixed"></div>
</div>
<!--end con-->
<!--end con-->

<!--footer-->

<div id="footer_wrap">
    <p>Copyright ©2014 飞凡教育，版权所有</p>
</div>

<!--end footer-->
</body>
</html>

