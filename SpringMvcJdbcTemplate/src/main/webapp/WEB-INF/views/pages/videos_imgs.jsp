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
    <div id="mid_content1">
        <div class="container1">
            <jsp:include page="/WEB-INF/views/includes/videos_imgs_menu.jsp" />
            <div class="mid_content_info_contents">
                <!-- <label id="innerWrapper">ad</label> -->
                <!-- <div id="innerWrapper">đá</div> -->
                <div style="margin-bottom: 15px; margin-top: 10px;">
                    <form action="searchnews" id="formSearchNews" method="post">
                        <label>Tìm kiếm :</label>
                        <input id="searchnewsval" name="searchnewsname" type="text" placeholder="Bạn đang tìm ?"/>
                        <input name="searchnewsbtn" type="button" value="Tìm kiếm" style="margin-left: 2px; height: 25px;" onclick="searchNews();"/>
                    </form>
                </div>
                <div id="tinvideos" class="tinvideos" style="margin-bottom: 10px; margin-left: 260px; width: 700px; height: 400px;">
                    <!-- <a href="#" class="mid_content_space1_main"><img alt="" src="resources/images/suzukismall.jpg"></a> -->
                    <a href="#"><label style="height: 30px; font-size: 40px;"><u>Videos Hay Nhất</u></label></a>
                    <ul>
                        <li class="mid_content_info1 mid_content_space1"><img alt="" src="resources/images/latest_work01.jpg" /><a href="#" style="float: right;"><img src="resources/images/arrow_right.png" alt="arrow right"/>Xem</a></li>
                        <li class="mid_content_info1 mid_content_space1"><img alt="" src="resources/images/latest_work01.jpg" /><a href="#" style="float: right;"><img src="resources/images/arrow_right.png" alt="arrow right"/>Xem</a></li>
                        <!-- <li class="mid_content_info1 mid_content_space1"><img alt="" src="resources/images/latest_work01.jpg" /><a href="#" style="float: right;"><img src="resources/images/arrow_right.png" alt="arrow right"/>Xem thêm để hiểu thêm về đội bóng hoàng gia tây ban nha</a></li>
                        <li class="mid_content_info1 mid_content_space1"><img alt="" src="resources/images/latest_work01.jpg" /></li> -->
                        <li class="mid_content_info1 mid_content_space1"><img alt="" src="resources/images/latest_work01.jpg" /></li>
                        <li class="mid_content_info1 mid_content_space1"><img alt="" src="resources/images/latest_work01.jpg" /></li>
                        <li class="mid_content_info1 mid_content_space1"><img alt="" src="resources/images/latest_work01.jpg" /></li>
                        <li class="mid_content_info1 mid_content_space1"><img alt="" src="resources/images/latest_work01.jpg" /></li>
                    </ul>
                </div>
                <div id="tinanh" class="tinanh" style="margin-top: 20px; margin-left: 260px; width: 700px; height: auto;">
                    <a href="#"><label style="height: 30px; font-size: 40px;"><u>Bản tin khác...</u></label></a>
                    <ul>
                        <li class="mid_content_info1 mid_content_space1"><img alt="" src="resources/images/latest_work01.jpg" /><a href="#" style="float: right;"><img src="resources/images/arrow_right.png" alt="arrow right"/>Xem</a></li>
                        <li class="mid_content_info1 mid_content_space1"><img alt="" src="resources/images/latest_work01.jpg" /><a href="#" style="float: right;"><img src="resources/images/arrow_right.png" alt="arrow right"/>Xem</a></li>
                        <!-- <li class="mid_content_info1 mid_content_space1"><img alt="" src="resources/images/latest_work01.jpg" /><a href="#" style="float: right;"><img src="resources/images/arrow_right.png" alt="arrow right"/>Xem thêm để hiểu thêm về đội bóng hoàng gia tây ban nha</a></li>
                        <li class="mid_content_info1 mid_content_space1"><img alt="" src="resources/images/latest_work01.jpg" /></li> -->
                        <li class="mid_content_info1 mid_content_space1"><img alt="" src="resources/images/latest_work01.jpg" /></li>
                        <li class="mid_content_info1 mid_content_space1"><img alt="" src="resources/images/latest_work01.jpg" /></li>
                    </ul>
                </div>
            </div>
        </div> <!-- END .container -->
    </div> <!-- END #mid_content -->

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
