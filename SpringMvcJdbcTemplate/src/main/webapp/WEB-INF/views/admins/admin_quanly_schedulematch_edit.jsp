<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.0/jquery.min.js"></script>
<title>Trang Cập Nhật Lịch Thi Đấu</title>
</head>
<body>
<div align="center">
        <h1>Add/Edit ScheduleMatch</h1>
        <form:form action="saveScheduleMatchs" method="post" modelAttribute="schedulematchs">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td style="text-align: right;">Mùa Giải:</td>
                <%-- <td><form:input path="masan" placeholder="V-League"/></td> --%>
                <td><select name="masan" style="height: 25px;">
                    <option value="9">Chọn Mùa Giải......</option>
                    <c:forEach items="${getMenuList}" var="menu">
                    <option value="${menu.display}">${menu.name}</option>
                    </c:forEach>
                </select></td>
            </tr>
            <tr>
                <td style="text-align: right;">Vòng:</td>
                <td><form:input path="tensan" placeholder="3"/></td>
            </tr>
            <tr>
                <td style="text-align: right;">Mã Đội Nhà:</td>
                <td><form:input path="logo" placeholder="THANQUANGNINH"/></td>
            </tr>
            <tr>
                <td style="text-align: right;">Tên Đội Nhà:</td>
                <td><form:input path="logo" placeholder="Than Quảng Ninh"/></td>
            </tr>
            <tr>
                <td style="text-align: right;">Tỉ Số:</td>
                <td><form:input path="logo" placeholder="? vs ?"/></td>
            </tr>
            <tr>
                <td style="text-align: right;">Tên Đội Khách:</td>
                <td><form:input path="logo" placeholder="Hoàng Anh Gia Lai"/></td>
            </tr>
            <tr>
                <td style="text-align: right;">Mã Đội Khách:</td>
                <td><form:input path="logo" placeholder="HAGL"/></td>
            </tr>
            <tr>
                <td style="text-align: right;">Mã Trận:</td>
                <td><form:input path="masan" placeholder="THANQUANGNINH-HAGL" readonly="true"/></td>
            </tr>
            <tr>
                <td style="text-align: right;">Sân:</td>
                <td><form:input path="logo" placeholder="Lạch Tray"/></td>
            </tr>
            <tr>
                <td style="text-align: right;">Ngày Thi Đấu:</td>
                <c:if test="${0 == checkdangki}">
                <td><input name="createDate" type="date" value="yyyy-mm-dd" class="input-medium search-query" onkeypress="return false"></td>
                </c:if>
                <c:if test="${1 == checkdangki}">
                <td><form:input path="createDate" /></td>
                </c:if>
            </tr>
            <tr>
                <td style="text-align: right;">Trạng Thái:</td>
                <td><label><input type="radio" name="feed" checked="checked" value="0"/>Chưa Đá</label>
                <label><input type="radio" name="feed" value="1" />Đang Đá</label>
                <label><input type="radio" name="feed" value="2" />Đã Đá</label></td>
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