<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.0/jquery.min.js"></script>
<title>Trang Cập Nhật Thông Tin Club</title>
<style>
.thclass {
    _background-color: blue;
    _border: 1px solid black;
}
</style>
</head>

<body>
<div align="center">
        <h1>Add/Edit ClubInfo</h1>
        <form:form action="saveClubs" method="post" modelAttribute="clubs">
        <!-- <input type="hidden" name="checkdangki" value="" /> -->
        <table>
            <%-- <form:hidden path="id"/> --%>
            <tr>
                <td style="text-align: right;" class="thclass">Mã Club:</td>
                <td><form:input path="madoituyen" /></td>
            </tr>
            <tr>
                <td style="text-align: right;" class="thclass">Tên Club:</td>
                <td><form:input path="tendoituyen" /></td>
            </tr>
            <tr>
                <td style="text-align: right;" class="thclass">Logo:</td>
                <td><form:input path="imgdoituyen" /></td>
            </tr>
            <tr>
                <td style="text-align: right;" class="thclass">City:</td>
                <td><form:input path="thanhpho" /></td>
            </tr>
            <tr>
                <td style="text-align: right;" class="thclass">Hlv:</td>
                <td><form:input path="HLV" /></td>
            </tr>
            <tr>
                <td style="text-align: right;" class="thclass">Thành Lập:</td>
                <c:if test="${0 == checkdangki}">
                <%-- <td><form:input path="birthday" /></td> --%>
                <td><input name="birthday" type="date" value="yyyy-mm-dd" class="input-medium search-query" onkeypress="return false"></td>
                </c:if>
                <c:if test="${1 == checkdangki}">
                <td><form:input path="birthday" /></td>
                </c:if>
            </tr>
            <tr>
                <td style="text-align: right;" class="thclass">Danh Hiệu:</td>
                <td><form:input path="danhhieu" /></td>
            </tr>
            <tr>
                <td style="text-align: right;" class="thclass">Thông Tin:</td>
                <td><form:input path="thongtin" /></td>
            </tr>
            <tr>
                <td style="text-align: right;" class="thclass">Ngày tạo:</td>
                <%-- <td><form:input path="createDate" /></td> --%>
                <c:if test="${0 == checkdangki}">
                <td><input name="createDate" type="date" value="yyyy-mm-dd" class="input-medium search-query" onkeypress="return false"></td>
                </c:if>
                <c:if test="${1 == checkdangki}">
                <td><form:input path="createDate" /></td>
                </c:if>
            </tr>
            <tr>
                <td style="text-align: right;" class="thclass">Người tạo:</td>
                <td><form:input path="createBy" /></td>
            </tr>
            <tr>
                <td style="text-align: right;" class="thclass">Ngày cập nhật:</td>
                <%-- <td><form:input path="updateDate" /></td> --%>
                <c:if test="${0 == checkdangki}">
                <td><input name="updateDate" type="date" value="yyyy-mm-dd" class="input-medium search-query" onkeypress="return false"></td>
                </c:if>
                <c:if test="${1 == checkdangki}">
                <td><form:input path="updateDate" /></td>
                </c:if>
            </tr>
            <tr>
                <!-- <td colspan="1" align="center"><input type="button" value="Cancel" onclick="cancel();"></td> -->
                <td colspan="2" align="center"><input type="button" value="Cancel" onclick="cancel();"> &nbsp;&nbsp; <input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>

<script type="text/javascript">
function cancel() {
    window.history.back();
}
</script>
</body>
</html>