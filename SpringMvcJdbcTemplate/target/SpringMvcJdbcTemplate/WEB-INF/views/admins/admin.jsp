<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/tlds/Paginator.tld" prefix="display" %>
<%@ taglib uri="/WEB-INF/taglibs/customTaglib.tld" prefix="tag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Admin Pages</title>

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
    background-color:yellow;
}
</style>
<style type="text/css">
.admin a:hover {
    _background-color: yellow;
}
</style>
</head>
<body>
<div align="center">
    <jsp:include page="/WEB-INF/views/includes/admin_header.jsp" />
    <!-- <h3 class="admin">
        <label>Quản Lý :</label>
        <a href="adminquanlytintuc">Bản tin</a> | 
        <a href="adminquanlyuser">Người dùng</a> | 
        <a href="adminquanlyclubs">Đội bóng</a> | 
        <a href="adminquanlytickets">Vé</a> | 
        <a href="adminquanlystadiums">Sân</a> | 
        <a href="adminquanlyroundmatchs">Vòng đấu</a> | 
        <a href="adminquanlyseasons">Mùa giải</a>
    </h3><br/><br/> -->
</div>
<div align="left">
    <h3>
        <a href="index">Trang Chủ</a> | 
        <a href="lichThiDau">Lịch Thi Đấu</a>
    </h3>
</div>
</body>
</html>