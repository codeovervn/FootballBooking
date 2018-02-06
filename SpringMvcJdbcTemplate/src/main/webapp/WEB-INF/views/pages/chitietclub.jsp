<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.0/jquery.min.js"></script> -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<link href='http://fonts.googleapis.com/css?family=Vollkorn:400,700' rel='stylesheet' type='text/css'>
<title>Thông Tin Đội Bóng</title>
<style type="text/css">
</style>
<link rel="stylesheet" type="text/css" href="resources/css/reset.css" />
<link rel="stylesheet" type="text/css" href="resources/css/main.css" />
<link rel="stylesheet" type="text/css" href="resources/css/chitietclub.css" />
</head>
<body>
    <h1 class="description">Thông tin chi tiết về Đội Bóng : ${clubInfoDetail.tendoituyen }</h1>
    <!-- Table demo -->
    <div class="box-table">
        <table>
            <tbody>
                <tr><td rowspan="5"><img class="user-tumb" src="resources/images/${clubInfoDetail.madoituyen }.jpg" /></td>
                    <td>Tên Đội Bóng : <label id="clubName" class="clubName">${clubInfoDetail.tendoituyen }</label></td></tr>
                <tr><td>Thành Phố : <label id="clubThanhPho" class="clubThanhPho">${clubInfoDetail.thanhpho }</label></td></tr>
                <tr><td>Thành Lập : <label id="clubThanhLap" class="clubThanhLap">${clubInfoDetail.ngaythanhlap }</label></td></tr>
                <tr><td>Danh Hiệu: ${clubInfoDetail.danhhieu }</td></tr>
                <tr><td>HLV : <label id="clubHlv" class="clubHlv">${clubInfoDetail.HLV }</label></td></tr>
            </tbody>
        </table>
        <div class="thongtin"><br/>
            <label style="font-size: 30px; border: solid 1px; background-color: green; color: red">Thông Tin Chính</label><br/><br/>
            <label id="clubMota" class="clubMota">${clubInfoDetail.thongtin }</label>
            <!-- <label>Là đội bóng cấp câu lạc bộ đầu tiên của Việt Nam được tham dự AFC CUP</label><br/>
            <label>Nhân tố để làm nên thành công như ngày hôm nay là biết tận dùng tốt nhân lực trong nước</label><br/>
            <label>Tuy còn non trẻ so với nhiều đội bóng khác nhưng đã rất thành công về mặt danh hiệu,</label><br/>
            <label>Thường xuyên tổ chức các giải đầu giao hữu quốc tế giữa các câu lạc bộ trên thế giới...</label><br/> -->
        </div>
        <div id="btnConfirm"><input id="quaylai" type="submit" value="Quay Lại" onclick="goBack()" /></div>
    </div>
<script>
$(document).ready(function() {
    /* var dataClub =  '${dataClubs}';*/
    //var dataClub = '[{ "_id" : { "$oid" : "58aeae499f99630a3adbb252"} , "logo" : "logo.jpg" , "tenDoiBong" : "Song Lam nghe an" , "thanhPho" : "Vinh" , "thanhLap" : "23 tháng 9 năm 1999" , "HLV" : "Nguyễn Hữu Thắng" , "mota" : "Là đội bóng cấp câu lạc bộ đầu tiên của Việt Nam được tham dự AFC CUP<br>Nhân tố để làm nên thành công như ngày hôm nay là biết tận dùng tốt nhân lực trong nước<br>Tuy còn non trẻ so với nhiều đội bóng khác nhưng đã rất thành công về mặt danh hiệu," , "createDate" : "2018/01/12" , "updateDate" : "2018/01/12" , "createBy" : "HoangNH10"}, { "_id" : { "$oid" : "58aeae5a9f99630a3adbb253"} , "logo" : "logo.jpg" , "tenDoiBong" : "Ha Noi" , "thanhPho" : "Ha Noi" , "thanhLap" : "11 tháng 4 năm 2001" , "HLV" : "Bầu Hiển" , "mota" : "Phần mô tả về câu lạc bộ về câu lạc bộ HN T&T" , "createDate" : "2018/01/12" , "updateDate" : "2018/01/12" , "createBy" : "HoangNH10"}]';
    //console.log(dataClub);
    //var jsonClub = JSON.parse(dataClub);
    //document.getElementById("clubName").innerHTML = "Hai Phong";
    /* for (var i = 0; i < jsonClub.length; i++) {
        //if (jsonClub[i].tenDoiBong = 'Song Lam nghe an') {
        if (jsonClub[i].tenDoiBong = 'Ha Noi') {
            //alert(jsonClub[i].thanhLap);
            $(".clubName").get(i).innerHTML = jsonClub[i].tenDoiBong;
            $(".clubThanhPho").get(i).innerHTML = jsonClub[i].thanhPho;
            $(".clubThanhLap").get(i).innerHTML = jsonClub[i].thanhLap;
            $(".clubHlv").get(i).innerHTML = jsonClub[i].HLV;
            $(".clubMota").get(i).innerHTML = jsonClub[i].mota;
        }
    } */
});

function goBack() {
    window.history.back();
};
</script>
</body>
</html>
