<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.0/jquery.min.js"></script>
<link href='http://fonts.googleapis.com/css?family=Vollkorn:400,700' rel='stylesheet' type='text/css'>
<title>Đặt Vé</title>
<link rel="stylesheet" type="text/css" href="resources/css/reset.css" />
<link rel="stylesheet" type="text/css" href="resources/css/main.css" />
<link rel="stylesheet" type="text/css" href="resources/css/header.css" />
<link rel="stylesheet" type="text/css" href="resources/css/datve.css" />
<script>
function goBack() {
    window.history.back();
}
</script>

</head>
<body>

    <jsp:include page="/WEB-INF/views/includes/header.jsp" />

    <form:form action="lichThiDau"  method="get" modelAttribute="booking">
    <h1 class="description">Giải ${ booking.tengiai } ${ booking.giai } : ${ booking.nam }</h1>
    <!-- Table demo -->
    <div class="box-table">
        <table>
            <tbody>
                <tr>
                    <th>Giải Đấu</th>
                    <td>${ booking.giai }</td></tr>
                <tr>
                    <th>Vòng Đấu</th>
                    <td>${ booking.vong }</td></tr>
                <tr>
                    <th>Trận Đấu</th>
                    <td>${ booking.chunha } vs ${ booking.khach }</td></tr>
                <tr>
                    <th>Sân</th>
                    <td>${ booking.san }</td></tr>
                <tr>
                    <th>Khán Đài</th>
                    <td><select id="khanDai" name="Khan Dai">
                       <option value="A">A</option>
                       <option value="B">B</option>
                       <option value="C">C</option>
                       <option value="C">D</option>
                    </select></td></tr>
                <tr>
                    <th>Cửa Số</th>
                    <td><select id="cuaSo" name="Cua so">
                       <option value="1">1</option>
                       <option value="2">2</option>
                       <option value="3">3</option>
                       <option value="4">4</option>
                       <option value="5">5</option>
                       <option value="6">6</option>
                       <option value="7">7</option>
                       <option value="8">8</option>
                    </select></td></tr>
            </tbody>
        </table>
        <div id="btnConfirm">
            <input id="quaylai" type="submit" value="Quay Lại" onclick="goBack()" />
            <input id="datve" type="submit" value="Đặt Vé" />
        </div>
    </div>
    </form:form>
</body>
</html>
