<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Trang Quản Lý Vé</title>

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
    <h3><a href="addTickets">Add Tickets</a></h3>
    <table border="1">
        <th>No</th>
        <th>Giải Đấu</th>
        <th>Vòng Đấu</th>
        <th>Trận Đấu</th>
        <th>Sân Đấu</th>
        <th>Khán Đài</th>
        <th>Cửa Số</th>
        <th>Giá Vé(VND)</th>
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
            <td>V-League</td>
            <td>10</td>
            <td>HAGL - HAIPHONG</td>
            <td>Sân Pleiku</td>
            <td>A</td>
            <td>4</td>
            <td>120,000</td>
            <td>Đã bán</td>
            <td>2017-03-01</td>
            <td>DungLT</td>
            <td>2017-03-01</td>
            <td>DungLT</td>
            <td>2017-03-01</td>
            <td>DungLT</td>
            <td><a href="editNews?id=${dataNews.id}">Edit</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="deleteNews?id=${dataNews.id}">Delete</a></td>
        </tr>
        <c:forEach var="dataNews" items="${dataNewsAll}" varStatus="status">
        <tr>
            <td>${status.index + 1}</td>
            <td>${dataNews.title}</td>
            <td>${dataNews.img}</td>
            <td>${dataNews.description}</td>
            <td>${dataNews.detail}</td>
            <td>${dataNews.feed}</td>
            <td>${dataNews.menuId}</td>
            <td>${dataNews.createDate}</td>
            <td>${dataNews.createBy}</td>
            <td>${dataNews.updateDate}</td>
            <td><a href="editNews?id=${dataNews.id}">Edit</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="deleteNews?id=${dataNews.id}">Delete</a></td>
        </tr>
        </c:forEach>
    </table>
    <h3><a href="index">Trang Chủ</a> | <a href="lichThiDau">Lịch Thi Đấu</a></h3>
</div>
</body>
</html>