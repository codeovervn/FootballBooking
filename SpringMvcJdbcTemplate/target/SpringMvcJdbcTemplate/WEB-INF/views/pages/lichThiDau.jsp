<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/tlds/Paginator.tld" prefix="display" %>
<%@ taglib prefix="tag" uri="/WEB-INF/taglibs/customTaglib.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.0/jquery.min.js"></script>
<!-- <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script> -->
<link href='http://fonts.googleapis.com/css?family=Vollkorn:400,700' rel='stylesheet' type='text/css'>
<title>Lich Thi Dau</title>
<link rel="stylesheet" type="text/css" href="resources/css/reset.css" />
<link rel="stylesheet" type="text/css" href="resources/css/header.css" />
<link rel="stylesheet" type="text/css" href="resources/css/main.css" />
<link rel="stylesheet" type="text/css" href="resources/css/lichthidau.css" />
<link rel="stylesheet" type="text/css" href="resources/css/paging.css" />
<!-- <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css" /> -->
<!-- <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css" /> -->
<!-- <link rel="stylesheet" type="text/css" href="resources/css/font-awesome.min.css" /> -->
</head>

<body>
    <jsp:include page="/WEB-INF/views/includes/header.jsp" />
    <form action="seachlichthidau" id="formSearchMatch" method="POST">
    <div id="searchId" class="searchId">
        <label>GIẢI :</label>
        <select name="giaidau" style="height: 30px;">
            <option value="">Chọn giải đấu</option>
            <c:forEach items="${seasonListAll}" var="season">
            <option value="${season.giai}">${season.tengiai}</option>
            </c:forEach>
        </select>
        <label style="margin-left: 10px;">VÒNG :</label>
        <input id="vongdau" class="vongdau" name="vongdau" placeholder="Nhập vòng đấu..." type="text" style="height: 23px; width: 100px;" value="" />
        <label style="margin-left: 10px;">ĐỘI :</label>
        <select name="doituyen" style="height: 30px;">
            <option value="">Chọn đội bóng</option>
            <c:forEach items="${clubInfoList}" var="clubInfo">
            <option value="${clubInfo.madoituyen}">${clubInfo.tendoituyen}</option>
            </c:forEach>
        </select>
        <input type="button" onclick="searchMatch();" value="Tìm kiếm" style="margin-left: 10px; width: 90px; height: 30px; font-size: 18px;"/>
    </div>
    </form>
    <form action="chitietclub1" id="formChitietClub" method="get">
        <!-- Khu vục tìm kiếm -->
        <!-- Cai nay cho mau trang -->
        <div id="soGiaiDau1">
        <c:forEach var="giai" items="${listGiai}" varStatus="status1">
            <h1 class=description>Lịch Thi Đấu Của Giải ${giai} : 2017</h1>
            <!-- <h1 class=description>Lịch Thi Đấu Của Giải Vô Địch Quốc Gia V-League : 2017</h1> -->
            <div class=box-table>
                <c:if test="${!empty magiai}">
                <tag:paginate max="10" offset="${offset}" count="${count}" uri="/SpringMvcJdbcTemplate/${magiai}" next="&raquo;" previous="&laquo;" />
                </c:if>
                <table>
                    <thead>
                        <tr>
                            <th>Số</th>
                            <!-- <th>Giải</th> -->
                            <th>Tên</th>
                            <th>Vòng</th>
                            <th colspan=3>Trận Đấu</th>
                            <th>Ngày</th>
                            <th>Đặt Vé</th>
                            <th>Chi Tiết</th>
                        </tr>
                    </thead> 
                    <tbody>
                        <c:forEach var="contact" items="${listContact}" varStatus="status2">
                            <c:if test="${giai == contact.giai}">
                            <tr>
                                <td>${status2.index + 1 + offset}</td>
                                <%-- <td>${contact.id}</td> --%>
                                <%-- <td>${contact.giai}</td> --%>
                                <td>${contact.tengiai}</td>
                                <td>${contact.vong}</td>
                                <td>${contact.chunha}</td>
                                <td>${contact.tyso}</td>
                                <td>${contact.khach}</td>
                                <td>${contact.ngay}</td>
                                <c:if test="${contact.status != 2}">
                                    <td><a href="datve?id=${contact.id}&vong=${contact.vong}&matran=${contact.matran}">Đặt Vé</a></td>
                                    <td><a href="chitiettrandau?id=${contact.id}&vong=${contact.vong}&matran=${contact.matran}">Xem chi tiết</a></td>
                                </c:if>
                                <c:if test="${contact.status == 2}">
                                    <td>Đã kết thúc</td>
                                    <td><a href="xemlaitrandau?id=${contact.id}&vong=${contact.vong}&matran=${contact.matran}">Xem lại</a></td>
                                </c:if>
                            </tr>
                            </c:if>
                        </c:forEach>
                    </tbody>
                </table>
                <c:if test="${!empty magiai}">
                <tag:paginate max="10" offset="${offset}" count="${count}" uri="/SpringMvcJdbcTemplate/${magiai}" next="&raquo;" previous="&laquo;" />
                </c:if>
            </div>
            </c:forEach>
            <%-- <c:if test="${count}">
                <label>** Không tìm thấy data theo điều kiện tìm kiếm...</label>
            </c:if> --%>
        </div>
    </form><br/>
<jsp:include page="/WEB-INF/views/includes/footer.jsp" />

<script type="text/javascript">
$(document).ready(function() {
    //console.log(${offset}+" count s="+${count});
    //console.log(123456);
});

function doChiTietClub() {
    //$("#formChitietClub").submit();
    //windown.location.href = "chitietclub";
}

function searchMatch() {
    $("#formSearchMatch").submit();
    //$("#formSearchMatch")[0].reset();
    return false;
}
</script>

<script type="text/javascript" src="resources/js/jquery.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
</body>
</html>
