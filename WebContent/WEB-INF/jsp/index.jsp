<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1>帅气的人啊</h1>y
<table width="1000">
    <tr>
        <th>序号</th>
        <th>区域</th>
        <th>监测时间</th>
        <th>PM10</th>
        <th>PM2.5数据</th>
        <th>监测站</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${page.air_quality_indexs }" var="a">
        <tr>
            <td>${a.id}</td>
            <td>${a.district.name}</td>
            <td>${a.monitor_time}</td>
            <td>${a.pm10}</td>
            <td>${a.pm25}</td>
            <td>${a.monitoring_station}</td>
            <td>${a.last_modify_time}</td>
            <td><a href="update?id=${a.id}">编辑</a><a href="deleteAir_quality_index?id=${a.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
<h1><a href="add">新增</a></h1>
<c:if test="${page.pageNo>1}">
    <a href="index?pageNo=1">首页</a>
    <a href="index?pageNo=${page.pageNo-1}">上一页</a>
</c:if>
<c:if test="${page.pageNo<page.pages}">
    <a href="index?pageNo=${page.pageNo+1}">下一页</a>
    <a href="index?pageNo=${page.pages}">末页</a>
</c:if>
</body>
</html>