<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="header">
    <div class="container">
    <h1><a href="index">Bóng Đá</a></h1>
    <div id="main_menu">
        <ul>
            <li class="first_list"><a href="homepageTemplate" id="" class="main_menu_first" title="Trang Chủ">Trang Chủ</a></li>
            <li class="first_list"><a href="vffnews" id="" class="main_menu_first" title="Bản Tin VFF">Tin Chính VFF</a></li>
            <li class="first_list with_dropdown">
                <!-- <a href="lichThiDau" class="main_menu_first main_current">Lịch Thi Đấu</a> -->
                <!-- <a href="lichThiDau" id="" class="main_menu_first">Lịch Thi Đấu</a> -->
                <a href="" id="" class="main_menu_first">Lịch Thi Đấu</a>
                <ul>
                    <li class="second_list second_list_border"><a href="giaiVLeague" id="" class="main_menu_second" title="">V-League</a></li>
                    <li class="second_list second_list_border"><a href="giaiSeagame" id="" class="main_menu_second" title="">Seagames</a></li>
                    <li class="second_list second_list_border"><a href="giaiNgoaiHang" id="" class="main_menu_second" title="">Ngoại Hạng Anh</a></li>
                    <li class="second_list second_list_border"><a href="giaiCupC1" id="" class="main_menu_second" title="">Cúp C1</a></li>
                    <li class="second_list"><a href="giaiGiaoHuu" id="" class="main_menu_second" title="">Giao Hữu Quốc Tế</a></li>
                </ul>
            </li>
            <li class="first_list">
                <a href="bookinglist" id="" class="main_menu_first" title="">Đặt Vé</a>
            </li>
            <li class="first_list with_dropdown">
                <a href="bangxephang" id="" class="main_menu_first" title="">Bảng Xếp Hạng</a>
                <ul>
                    <li class="second_list second_list_border"><a href="#" id="" class="main_menu_second" title="">V-League</a></li>
                    <li class="second_list second_list_border"><a href="#" id="" class="main_menu_second" title="">Seagames</a></li>
                    <li class="second_list second_list_border"><a href="#" id="" class="main_menu_second" title="">Ngoại Hạng Anh</a></li>
                    <li class="second_list second_list_border"><a href="#" id="" class="main_menu_second" title="">Cúp C1</a></li>
                    <li class="second_list second_list_border"><a href="#" id="" class="main_menu_second" title="">Giao Hữu Quốc Tế</a></li>
                    <li class="second_list second_list_border"><a href="#" id="" class="main_menu_second" title="">Graphics</a></li>
                    <li class="second_list"><a href="#" class="main_menu_second" title="">Social Media Management</a></li>
                </ul>
            </li>
            <li class="first_list"><a href="videos_imgs" id="main_menu_first" class="main_menu_first" title="Tin Ảnh & Videos">Tin Ảnh & Videos</a></li>
            <li class="first_list"><a href="contact" id="" class="main_menu_first" title="Liên Hệ">Liên Hệ</a></li>
            <c:if test="${0 == checkdangnhap}">
                <!-- <li class="first_list"><a href="login" class=""><u>Đăng Nhập</u></a></li>
                <li class="first_list"><a href="regist" class=""><u>Đăng Kí</u></a></li> -->
                <li class="first_list">
                    <div class="classlogin_reg"><div><a href="login" class=""><u>Đăng Nhập</u></a></div><br>
                    <div><a href="regist" class=""><u>Đăng Kí</u></a></div></div>
                </li>
            </c:if>
            <c:if test="${1 == checkdangnhap}">
                <li class="first_list"><a href="logout" class=""><u>Thoát</u></a></li>
            </c:if>
       </ul>
   </div> <!-- END #main_menu -->
   </div> <!-- END .container -->
</div> <!-- END #header -->
