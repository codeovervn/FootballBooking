<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Trang Quản Lý Sân</title>

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
    <!-- <h3 class="admin">
        <label>Quản Lý :</label>
        <a href="admin">Admin</a> | 
        <a href="adminquanlyclubs">Đội bóng</a> | 
        <a href="adminquanlytickets">Vé</a><br/></h3> -->
    <h3><a href="addStadiums">Add Stadiums</a></h3>
    <table border="1">
        <th>No</th>
        <th>Mã</th>
        <th>Tên</th>
        <th>Logo</th>
        <th>Thành Lập</th>
        <th>Chủ Quản</th>
        <th>City</th>
        <th>Sức Chứa(người)</th>
        <th>Thông Tin</th>
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
            <td>MYDINH</td>
            <td>Mỹ Đình</td>
            <td>MYDINH.jpg</td>
            <td>2017-03-01</td>
            <td>HÀ NỘI FC</td>
            <td>HÀ NỘI</td>
            <td>40,000</td>
            <td>Sân vận động đẹp nhất và lớn nhất khu vực ĐNA</td>
            <td>Thi Đấu</td>
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