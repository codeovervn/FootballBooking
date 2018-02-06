<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Trang Quản Lý Bản Tin</title>

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
<style type="text/css">
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
        <a href="adminquanlytintuc">Quản lý Bản tin</a> | 
        <a href="adminquanlyuser">Quản lý Người dùng</a><br></h3> -->
    <h3><a href="addUsers">Add Users</a></h3>
    <table border="1">
        <th>No</th>
        <th>Logo</th>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Nghề nghiệp</th>
        <th>Mã người dùng</th>
        <th>Mật khẩu</th>
        <th>Quản lý</th>
        <th>Ngày tạo</th>
        <th>Người tạo</th>
        <th>Ngày cập nhật</th>
        <th>Option</th>
        <c:forEach var="dataUsers" items="${dataUsersAll}" varStatus="status">
        <tr>
            <td>${status.index + 1}</td>
            <td>${dataUsers.logo}</td>
            <td>${dataUsers.name}</td>
            <td>${dataUsers.birthday}</td>
            <td>${dataUsers.address}</td>
            <td>${dataUsers.job}</td>
            <td>${dataUsers.user}</td>
            <td>${dataUsers.password}</td>
            <td>${dataUsers.admin}</td>
            <td>${dataUsers.createDate}</td>
            <td>${dataUsers.createBy}</td>
            <td>${dataUsers.updateDate}</td>
            <td><a href="editUsers?id=${dataUsers.id}">Edit</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="deleteUsers?id=${dataUsers.id}">Delete</a></td>
        </tr>
        </c:forEach>
    </table>
    <h3><a href="index">Trang Chủ</a> | <a href="lichThiDau">Lịch Thi Đấu</a></h3>
</div>
</body>
</html>