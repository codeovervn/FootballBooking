<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.0/jquery.min.js"></script>
<title>Trang Cập Nhật Vé</title>
</head>
<body>
<div align="center">
        <h1>Add/Edit Tickets</h1>
        <form:form action="saveTickets" method="post" modelAttribute="tickets">
        <table>
            <%-- <form:hidden path="id"/> --%>
            <tr>
                <td style="text-align: right;">Giải Đấu:</td>
                <%-- <td><form:input path="giaidau" /></td> --%>
                <td><select name="giaidau" style="height: 25px;">
                    <option value="9">Chọn Giải...</option>
                    <c:forEach items="${getMenuList}" var="menu">
                    <option value="${menu.display}">${menu.name}</option>
                    </c:forEach>
                </select></td>
            </tr>
            <tr>
                <td style="text-align: right;">Vòng Đấu:</td>
                <td><form:input path="vongdau" /></td>
            </tr>
            <tr>
                <td style="text-align: right;">Trận Đấu:</td>
                <td><form:input path="trandau" /></td>
            </tr>
            <tr>
                <td style="text-align: right;">Sân Đấu:</td>
                <td><form:input path="sandau" /></td>
            </tr>
            <tr>
                <td style="text-align: right;">Khán Đài:</td>
                <td><select name="menuId" style="height: 25px;">
                    <option value="9">Chọn Khán Đài...</option>
                    <c:forEach items="${getMenuList}" var="menu">
                    <option value="${menu.display}">${menu.name}</option>
                    </c:forEach>
                </select></td>
            </tr>
            <tr>
                <td style="text-align: right;">Cửa Số:</td>
                
                <td><select name="menuId" style="height: 25px;">
                    <option value="9">Chọn Cửa...</option>
                    <c:forEach items="${getMenuList}" var="menu">
                    <option value="${menu.display}">${menu.name}</option>
                    </c:forEach>
                </select></td>
            </tr>
            <tr>
                <td style="text-align: right;">Giá Vé:</td>
                <td><select name="menuId" style="height: 25px;">
                    <option value="9">Chọn Vé...</option>
                    <c:forEach items="${getMenuList}" var="menu">
                    <option value="${menu.display}">${menu.name}</option>
                    </c:forEach>
                </select></td>
            </tr>
            <tr>
                <td style="text-align: right;">Trạng Thái:</td>
                <td><label><input type="radio" name="feed" checked="checked" value="0"/>Chưa Bán</label>
                <label><input type="radio" name="feed" value="1" />Đã Bán</label></td>
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
                <td><form:input path="createBy" /></td>
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