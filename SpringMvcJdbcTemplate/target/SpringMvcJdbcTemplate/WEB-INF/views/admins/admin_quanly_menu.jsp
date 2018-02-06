<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Trang Quản Lý Menu</title>

<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.0/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("a").click(function(){
        //$(this).removeClass("yellow");
        $("a").removeClass("yellow");
        $(this).addClass("yellow");
        //$(this).css("background-color","yellow");
    });

    $("a").hover(function(){
        $("a").removeClass("yellow");
        $(this).addClass("yellow");
    });

    $("a").mouseout(function(){
        $("a").removeClass("yellow");
        //$(this).addClass("red");
    });
});
</script>
<style>
.yellow {
    background-color: yellow;
}
</style>
</head>
<body>
<div align="center">
    <jsp:include page="/WEB-INF/views/includes/admin_header.jsp" />
    <h3><a href="addMenus">Add Menus</a></h3>
    <table border="1">
        <th>No</th>
        <th>Name</th>
        <th>ActionID</th>
        <th>Mobile</th>
        <th>Display</th>
        <th>Trạng Thái</th>
        <th>Ngày Tạo</th>
        <th>Người Tạo</th>
        <th>Ngày Cập Nhật</th>
        <th>Người Cập Nhật</th>
        <th>Ngày Xóa</th>
        <th>Người Xóa</th>
        <th>Option</th>
        <tr>
            <td>1</td>
            <td>Trang Chủ</td>
            <td>homepage</td>
            <td>true</td>
            <td>0</td>
            <td>1</td>
            <td>2017-03-01</td>
            <td>DungLT</td>
            <td>2017-03-01</td>
            <td>DungLT</td>
            <td>2017-03-01</td>
            <td>DungLT</td>
            <td><a href="editMenus?id=${dataNews.id}">Edit</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="deleteMenus?id=${dataNews.id}">Delete</a></td>
        </tr>
    </table>
    <h3><a href="index">Trang Chủ</a> | <a href="lichThiDau">Lịch Thi Đấu</a></h3>
</div>
</body>
</html>