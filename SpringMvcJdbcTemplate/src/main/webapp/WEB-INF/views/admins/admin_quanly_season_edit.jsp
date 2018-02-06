<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.0/jquery.min.js"></script>
<title>Trang Cập Nhật Mùa Giải</title>
</head>
<body>
<div align="center">
        <h1>Add/Edit Season</h1>
        <form:form action="saveSeasons" method="post" modelAttribute="seasons">
        <table>
            <%-- <form:hidden path="id"/> --%>
            <tr>
                <td style="text-align: right;">Mùa Giải:</td>
                <td><form:input path="masan" placeholder="2017-2018"/></td>
            </tr>
            <tr>
                <td style="text-align: right;">Mã Giải:</td>
                <td><form:input path="tensan" placeholder="V-League"/></td>
            </tr>
            <tr>
                <td style="text-align: right;">Tên Giải:</td>
                <td><form:input path="logo" placeholder="Vô Địch Quốc Gia Việt Nam"/></td>
            </tr>
            <tr>
                <td style="text-align: right;">Địa Điểm:</td>
                <td><form:input path="logo" placeholder="Việt Nam"/></td>
            </tr>
            <tr>
                <td style="text-align: right;">Tổng Trận:</td>
                <td><form:input path="logo" placeholder="26"/></td>
            </tr>
            <tr>
                <td style="text-align: right;">Tên CLUBs:</td>
                <td><form:input path="logo" placeholder="Hà Nội T&T"/></td>
            </tr>
            <tr>
                <td style="text-align: right;">Lên Hạng:</td>
                <td><label><input type="radio" name="feed" checked="checked" value="0"/>NO</label>
                <label><input type="radio" name="feed" value="1" />YES</label></td>
            </tr>
            <tr>
                <td style="text-align: right;">Ngày tạo:</td>
                <c:if test="${0 == checkdangki}">
                <td><input name="createDate" type="date" value="yyyy-mm-dd" class="input-medium search-query" onkeypress="return false"></td>
                </c:if>
                <c:if test="${1 == checkdangki}">
                <td><form:input path="createDate" /></td>
                </c:if>
            </tr>
            <tr>
                <td style="text-align: right;">Người tạo:</td>
                <td><form:input path="createBy" placeholder="admin" /></td>
            </tr>
            <tr>
                <td style="text-align: right;">Ngày cập nhật:</td>
                <c:if test="${0 == checkdangki}">
                <td><input name="updateDate" type="date" value="yyyy-mm-dd" class="input-medium search-query" onkeypress="return false"></td>
                </c:if>
                <c:if test="${1 == checkdangki}">
                <td><form:input path="updateDate" /></td>
                </c:if>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="button" value="Cancel" onclick="cancel();"> &nbsp;&nbsp; <input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>

<script>
function cancel() {
    window.history.back();
}
</script>
</body>
</html>