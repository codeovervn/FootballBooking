<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/tlds/Paginator.tld" prefix="display" %>
<%@ taglib prefix="tag" uri="/WEB-INF/taglibs/customTaglib.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>

</style>
<title>VFF Liên Đoàn Bóng Đá Việt Nam</title>
<link rel="stylesheet" type="text/css" href="resources/css/reset.css" />
<link rel="stylesheet" type="text/css" href="resources/css/header.css" />
<link rel="stylesheet" type="text/css" href="resources/css/main.css" />
</head>
<body>
    <jsp:include page="/WEB-INF/views/includes/header.jsp" />
    <div id="main_content">
        <div id="slideshow_area">
        <div class="container">
            <div id="slideshow_container">
                <ul>
                    <li><img src="resources/images/23.jpg" alt="banner1" /></li>
                    <!-- <li><img src="resources/images/banner_image.jpg" alt="banner1" /></li> -->
                </ul>
                <div id="slideshow_pagination">
                    <ul>
                        <li><a href="#"></a></li>
                        <li><a href="#"></a></li>
                        <li><a href="#" class="current"></a></li>
                        <li><a href="#"></a></li>
                        <li><a href="#"></a></li>
                    </ul>
                </div> <!-- END #slideshow_pagination -->
            </div> <!-- END #slideshow_container -->
        </div> <!-- END .container -->
        </div> <!-- END #slideshow_area -->
        <div id="mid_content">
            <div class="container">
            <div class="mid_content_info mid_content_space">
                <h2 id="clean">VFF Quyết tâm...</h2>
                <p>Gần đây, ban liên đoàn bóng đá Việt Nam, VFF, đang tỏ ra hết sức nỗ lực để phục hưng nền bóng đá nước nhà...</p>
                <a href="vffnews" style="float: right;"><img src="resources/images/arrow_right.png" alt="arrow right" />Đọc thêm</a>
            </div>
            <div class="mid_content_info mid_content_space">
                <h2 id="responsive">Xử Phạt</h2>
                <p>Vấn nạn bỏ thi đấu đang ngày càng gia tăng, điển hình như vụ việc các cầu thủ của đội bóng Long An ở vòng đấu thứ 8 vừa qua...</p>
                <a href="vffnews" style="float: right;"><img src="resources/images/arrow_right.png" alt="arrow right" />Đọc thêm</a>
            </div>
            <div class="mid_content_info mid_content_space">
                <h2 id="fully">Giao Hữu Quốc Tế</h2>
                <p>Liên tục trong những tuần qua, giới truyên thông trong nước đang rỉ tai nhau về việc VFF mời đội bóng hàng đầu Âu Châu qua Việt Nam du đấu...</p>
                <a href="vffnews" style="float: right;"><img src="resources/images/arrow_right.png" alt="arrow right" />Đọc thêm</a>
            </div>
            <div class="mid_content_info mid_content_space">
                <h2 id="responsive">Xử Phạt</h2>
                <p>Vấn nạn bỏ thi đấu đang ngày càng gia tăng, điển hình như vụ việc các cầu thủ của đội bóng Long An ở vòng đấu thứ 8 vừa qua...</p>
                <a href="vffnews" style="float: right;"><img src="resources/images/arrow_right.png" alt="arrow right" />Đọc thêm</a>
            </div><!-- 
            <div class="mid_content_info mid_content_space">
                <h2 id="clean">CLEAN THEME</h2>
                <p>Ut nec lorem id orci convallis porta. Donec pharetra neque eu velit dictum molestie. Duis porta gravida augue sed viverra. Quisque at nulla leo,
                non aliquet mi.</p>
                <a href="#"><img src="resources/images/arrow_right.png" alt="arrow right" />Read More</a>
            </div>
            <div class="mid_content_info mid_content_space">
                <h2 id="responsive">RESPONSIVE DESIGN</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi euismod placerat dui et tincidunt. Sed sollicitudin posuere auctor. Phasellus at
                ultricies nisl. Integer at leo eros.</p>
                <a href="#"><img src="resources/images/arrow_right.png" alt="arrow right" />Read More</a>
            </div>
            <div class="mid_content_info mid_content_space">
                <h2 id="fully">FULLY LAYERED PSD</h2>
                <p>Phasellus lobortis metus non augue sodales volutpat. Vestibulum sit amet nibh eros, hendrerit venenatis est. In vitae nulla nec purus cursus
                pretium sed id magna.</p>
                <a href="#"><img src="resources/images/arrow_right.png" alt="arrow right" />Read More</a>
            </div> -->
            <!-- <div class="mid_content_info">
                <h2 id="ready">READY FOR CODING</h2>
                <p>Vivamus convallis feugiat mauris sed posuere. Nam rutrum, quam quis euismod commodo, elit est porta quam, non placerat eros neque porta ante.
                Fusce quis odio urna.</p>
                <a href="#"><img src="resources/images/arrow_right.png" alt="arrow right" />Read More</a>
            </div> -->
            </div> <!-- END .container -->
        </div> <!-- END #mid_content -->
        <%-- <div id="mid_conten1t"> <jsp:include page="lichthidau.jsp" /></div> --%>
        <div id="latest_works">
            <h3>VIDEOS Mới nhất</h3>
            <div id="carousel_nav">
                <a href="#"><img src="resources/images/bluearrow_left.png" alt="arrow left" /></a>
                <a href="#"><img src="resources/images/bluearrow_right.png" alt="arrow right" /></a>
            </div> <!-- END #carousel_nav -->
            <div id="carousel_wrapper">
                <ul>
                    <li id="work01">
                        <a href="#"><img src="resources/images/sample_view.gif" alt="work01" /></a>
                    </li>
                    <li id="work02">
                        <a href="#"><img src="resources/images/sample_view.gif" alt="work02" /></a>
                    </li>
                    <li id="work03">
                        <a href="#"><img src="resources/images/sample_view.gif" alt="work03" /></a>
                    </li>
                    <li id="work04">
                        <a href="#"><img src="resources/images/sample_view.gif" alt="work04" /></a>
                    </li>
                </ul>
            </div> <!-- END #carousel_wrapper -->
        </div> <!-- END #latest_works -->
        <br/>
        <div id="bottom_content">
            <div id="testimonials">
                <h3>Thảo Luận</h3>
                <p>Vì nền thể thao nước nhà, chúng tôi đang ra sức tìm kiếm tài năng và bồi dưỡng nhiều lứa vận động viên trẻ...
                <br />
                <br />
                <span class="testimonial_name">vpf.org.com</span></p>
            </div> <!-- END #testimonials -->
            <div id="clients">
                <h3>Các kênh của chúng tôi</h3>
                <ul>
                    <li><img src="resources/images/client01.jpg" alt="Cox Communications" /></li>
                    <li><img src="resources/images/client02.jpg" alt="CNN" /></li>
                    <li><img src="resources/images/client03.jpg" alt="Apartment Finder" /></li>
                    <li><img src="resources/images/client04.jpg" alt="John Deere" /></li>
                    <li><img src="resources/images/client05.jpg" alt="Banana Boat" /></li>
                    <li><img src="resources/images/client06.jpg" alt="Fuji Film" /></li>
                </ul>
            </div> <!-- END #clients -->
        </div> <!-- END #bottom_content -->
        <!-- <div id="download">
            <p>This is a clean and modern, four column website PSD template. You can code it into a Wordpress website, HTML5 responsive website for your personal
            or client works. So ahead and download this wonderful PSD template!</p>
            <a href="#">DOWNLOAD PSD</a>
        </div> --> <!-- END #download -->
    </div> <!-- END #main_content -->
    <jsp:include page="/WEB-INF/views/includes/footer.jsp" />
</body>
</html>