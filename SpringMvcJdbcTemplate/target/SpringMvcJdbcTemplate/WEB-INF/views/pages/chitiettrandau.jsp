<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.0/jquery.min.js"></script>
<link href='http://fonts.googleapis.com/css?family=Vollkorn:400,700' rel='stylesheet' type='text/css'>
<title>Chi Tiết Trận Đấu</title>
<link rel="stylesheet" type="text/css" href="resources/css/reset.css" />
<link rel="stylesheet" type="text/css" href="resources/css/header.css" />
<link rel="stylesheet" type="text/css" href="resources/css/main.css" />
<link rel="stylesheet" type="text/css" href="resources/css/chitiettrandau.css" />
<script>
function goBack() {
    window.history.back();
}
</script>
</head>
<body>
    <jsp:include page="/WEB-INF/views/includes/header.jsp" />
    <h1 class="description">Giải Vô Địch Quốc Gia ${matchDetail.giai} : ${matchDetail.nam}</h1>
    <!-- Table demo -->
    <div class="box-table">
        <table>
            <tbody>
                <tr>
                    <th colspan="3" style="width: 1%; height: 60px; background-color: green; font-size: 30px;">Trận: ${matchDetail.chunha} vs ${matchDetail.khach}</th>
                </tr>
                <tr>
                    <td><a href="chitietclub?id=${matchDetail.machunha}"><img class="user-tumb" src="resources/images/${matchDetail.machunha}.jpg" /></a><br/>
                        <label style="padding-left: 50px;">${matchDetail.chunha}</label></td>
                    <td>
                        <c:if test="${matchDetail.status == 0}">
                        <div style="margin-left: 50px;">
                        <!-- <label style="font-size: 30px; padding-right: 15px;"">1</label>
                        <label>vs</label>
                        <label style="font-size: 30px; padding-left: 15px;">2</label> -->
                        ${matchDetail.tyso}</div><br/>
                        <label style="margin-left: 10px; color: red;">Chưa Thi Đấu</label><br/>
                        </c:if>

                        <c:if test="${matchDetail.status == 1}">
                        <div style="margin-left: 50px;">${matchDetail.tyso}</div><br/>
                        <label style="margin-left: 10px; color: red;">Đang Thi Đấu</label><br/>
                        </c:if>

                        <c:if test="${matchDetail.status == 2}">
                        <div style="margin-left: 50px;">${matchDetail.tyso}</div><br/>
                        <label style="margin-left: 10px; color: red;">Đã Thi Đấu</label><br/>
                        </c:if>

                        <label style="margin-left: 10px;">17:00 ngày ${matchDetail.ngay}</label>
                    </td>
                    <td>
                        <a href="chitietclub?id=${matchDetail.makhach}"><img class="user-tumb" src="resources/images/${matchDetail.makhach}.jpg" /></a><br/>
                        <label style="margin-left: 53px;">${matchDetail.khach}</label>
                    </td>
                </tr>
            </tbody>
        </table>
        <div class="thongtin_">
            <table>
                <tr style="height: 35px;"><th colspan="2"><label style="font-size: 23px; border: solid 1px; background-color: green; color: red">Thông Tin</label></th></tr>
                <tr>
                    <th style="width:160px;"><label style="font-size: 20px; border: 1px;">Country</label></th><td>${matchDetail.giai}</td>
                </tr>
                <tr>
                    <th><label style="font-size: 20px; border: 1px;">Regula Season</label></th><td>${matchDetail.giai} ${matchDetail.nam}</td>
                </tr>
                <tr>
                    <th><label style="font-size: 20px; border: 1px;">Stadium</label></th><td>${matchDetail.san}</td>
                </tr>
                <!-- <tr>
                    <th><label style="font-size: 20px; border: 1px;">Chanel</label></th><td>VPF (VTV Cab)</td>
                </tr> -->
            </table>
        </div>
        <div id="btnConfirm">
            <input id="quaylai" type="submit" value="Quay Lại" onclick="goBack()" />
            <a href="datve?id=${matchDetail.id}&vong=${matchDetail.vong}&matran=${matchDetail.matran}"><input id="datve" type="submit" value="Đặt Vé" /></a>
            <%-- <a href="datve?vong=${matchDetail.vong}&matran=${matchDetail.matran}"><input id="datve" type="submit" value="Đặt Vé" onclick="loadDatve();" /></a> --%>
            <%-- <input id="datve?vong=${matchDetail.vong}&matran=${matchDetail.matran}" type="submit" value="Đặt Vé" /> --%>
        </div>
    </div>

<script type="text/javascript">
$(document).ready(function() {
    //console.log(${offset}+" count="+${count});
});

function loadDatve() {
	//alert(124);
    //$("#formSearchMatch").submit();
    //$("#formSearchMatch")[0].reset();
    //return false;
}
</script>
</body>
</html>
