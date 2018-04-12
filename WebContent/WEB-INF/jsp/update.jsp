<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="updateAir_quality_index" method="post">
    序号：<input type="text" name="id" value="${air_quality_index.id}"><br>
    监测时间：<input type="text" name="monitor_time" value="${air_quality_index.monitor_time}"><br>
    pm10:<input type="text" name="pm10" value="${air_quality_index.pm10}"><br>
    PM2.5<input type="text" name="pm25" value="${air_quality_index.pm25}"><br>
    监测站:<input type="text" name="monitoring_station" value="${air_quality_index.monitoring_station}"><br>
    最新监测时间：<input type="text" name="last_modify_time" value="${air_quality_index.last_modify_time}"><br>
    区域：<select name="district_id">
    <option value="1">东城区</option>
    <option value="2">西城区</option>
    <option value="3">海定去</option>
    <option value="4">朝阳区</option>
    <option value="5">丰台区</option>
</select>
    <input type="submit" name="tj" value="提交"><br>
</form>
</body>
</html>