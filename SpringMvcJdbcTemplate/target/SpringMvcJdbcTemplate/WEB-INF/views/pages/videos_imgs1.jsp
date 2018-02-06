<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>VFF Liên Đoàn Bóng Đá Việt Nam</title>
<link rel="stylesheet" type="text/css" href="resources/css/reset.css" />
<link rel="stylesheet" type="text/css" href="resources/css/header.css" />
<link rel="stylesheet" type="text/css" href="resources/css/main.css" />
<link rel="stylesheet" type="text/css" href="resources/css/vffnews1.css" />
</head>
<body>
    <jsp:include page="/WEB-INF/views/includes/header.jsp" />
    <div id="div_main_content" style="background-color: ">
        <div class="div_menu_left" style="width:200px; height:400px; margin-left: 200px; background-color: red;">
            <%-- <jsp:include page="/WEB-INF/views/includes/videos_imgs_menu.jsp" /> --%>
            menufs fsfsfsdf sdf sfsf sdf  fsfsdf sfsd fsd
        </div>
        <div class="div_content_right" style="width:800px; height:400px; position: absolute; top: 122px; left:400px">
            <img alt="" src="resources/images/latest_work01.jpg" />
            <img alt="" src="resources/images/latest_work01.jpg" />
            <img alt="" src="resources/images/latest_work01.jpg" />
            <img alt="" src="resources/images/latest_work01.jpg" />
            <img alt="" src="resources/images/latest_work01.jpg" />
        </div>
    </div>

    <jsp:include page="/WEB-INF/views/includes/footer.jsp" />

<script type="text/javascript">
$(document).ready(function() {
    //console.log(${offset}+" count s="+${count});
    //console.log(123456);
    //alert(1312324);
});

/* var currentdate = new Date();
var datetime = "Last Sync: " + currentdate.getDate() + "/" + (currentdate.getMonth()+1) + "/" + currentdate.getFullYear() + " @ " + currentdate.getHours() + ":" + currentdate.getMinutes() + ":" + currentdate.getSeconds();
var mini = currentdate.getMinutes();
//document.write(datetime);
//document.getElementById("dnt1").innerHTML = mini;
//document.getElementById("dnt2").innerHTML = mini;
for (var i = 0; i < $(".dnt").length; i++) {
$(".dnt").get(i).innerHTML = (Number(mini) + i) + " Phút";
} */
//document.getElementById("dnt").innerHTML = Date();

function searchNews() {
    var ad = document.getElementById("searchnewsval").value;
    //alert(ad);
    $("#formSearchNews").submit();
}

/* $("#main_menu_first").mouseover(function() {
    var titleString = $("#main_menu_first").attr("title");
    $("#innerWrapper").html("<h1>" + titleString + "</h1>");
}); */

$("#main_menu_first").click(function() {
    var titleString = $("#main_menu_first").attr("title");
    $("#innerWrapper").html("<h1>" + titleString + "</h1>");
});
</script>
</body>
</html>
