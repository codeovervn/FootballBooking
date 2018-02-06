<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.0/jquery.min.js"></script>
<title>Trang Cập Nhật Bản Tin</title>
</head>
<body>
<div align="center">
        <h1>Add/Edit News</h1>
        <!-- <label for="meeting">Meeting Date : </label><input id="meeting" type="date" value="2011-01-13"/> -->
        <form:form action="saveNews" method="post" modelAttribute="news">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td style="text-align: right;">Tiêu đề:</td>
                <%-- <td><form:input path="title" /></td> --%>
                <td><textarea name="title" rows="2" cols="50" placeholder="Viết tiêu đề vào đây"><c:out value="${news.title}" /></textarea></td>
                <%-- <td><form:textarea path="title" name="title" rows="2" cols="50" placeholder="Viết tiêu đề vào đây"><c:out value="${news.title}" /></form:textarea></td> --%>
            </tr>
            <tr>
                <td style="text-align: right;">Ảnh đại diện:</td>
                <td><form:input path="img" placeholder="C:\Users\bank.png" /></td>
            </tr>
            <tr>
                <td style="text-align: right;">Mô tả:</td>
                <%-- <td><form:input path="description" /></td> --%>
                <td><textarea name="description" rows="3" cols="50" placeholder="Viết mô tả gì nào?"><c:out value="${news.description}" /></textarea></td>
            </tr>
            <tr>
                <td style="text-align: right;">Chi tiết:</td>
                <%-- <td><form:input path="detail" /></td> --%>
                <td><textarea name="detail" rows="3" cols="50" placeholder="Cần viết chi tiết 1 bản tin"><c:out value="${news.detail}" /></textarea></td>
            </tr>
            <tr>
                <td style="text-align: right;">Tin nóng:</td>
                <%-- <td><form:input path="feed" /></td> --%>
                <td><label><input type="radio" name="feed" checked="checked" value="0"/>HOT</label>
                <label><input type="radio" name="feed" value="1" />Không HOT</label></td>
            </tr>
            <tr>
                <td style="text-align: right;">MenuId:</td>
                <td><select name="menuId" style="height: 25px;">
                    <option value="9">Chọn Menu</option>
                    <c:forEach items="${getMenuList}" var="menu">
                    <option value="${menu.display}">${menu.name}</option>
                    </c:forEach>
                </select></td>
                <%-- <td><form:select path="menuId" id="menuId">
                    <form:option value="0" label="--Vui lòng chọn items"/>
                    <form:options items="${menuId}" itemValue="company" itemLabel="company"/>
                    <form:options items="${getMenuList}" itemValue="${getMenuList.display}" itemLabel="company"/>
                </form:select></td> --%>
                <%-- <td><form:input path="menuId" /></td> --%>
            </tr>
            <tr>
                <td style="text-align: right;">Ngày tạo:</td>
                <%-- <td><form:input path="createDate" /></td> --%>
                <%-- <td><input id="createDate" name="createDate" type="date" value="${news.createDate}"/></td> --%>
                <!-- <td><input name="createDate" type="date" value="yyyy-mm-dd" class="input-medium search-query" onkeypress="return false"></td> -->
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
                <%-- <td><form:input path="updateDate" /></td> --%>
                <c:if test="${0 == checkdangki}">
                <td><input name="updateDate" type="date" value="yyyy-mm-dd" class="input-medium search-query" onkeypress="return false"></td>
                </c:if>
                <c:if test="${1 == checkdangki}">
                <td><form:input path="updateDate" /></td>
                </c:if>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="button" value="Cancel" onclick="cancel();"> &nbsp;&nbsp; <input type="submit" value="Save"></td>
                <!-- <td colspan="1" align="center"><input type="submit" value="Save"></td> -->
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