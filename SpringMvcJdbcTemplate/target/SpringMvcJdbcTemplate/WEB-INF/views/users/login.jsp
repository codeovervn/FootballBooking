<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Trang Đăng Nhập</title>
<link rel="stylesheet" type="text/css" href="resources/css/login.css" />
</head>

<body>
    <div class="container">
        <!-- <section id="content"> -->
        <div id="content">
        <form id="formLogin" action="loginsuccess" method="post">
            <div id="login" class="animate form">
                <h1 class="signinheader">Sign In</h1>
                <input type="hidden" name="checkdangnhap" value="${checkdangnhap}" />
                <p>
                    <label for="username" class="uname" data-icon="u"> Your email or Cellfone </label>
                    <input id="usercode" name="usercode" required="required" type="text" placeholder="mymail@mail.com or 0987654321">
                </p>
                <p>
                    <label for="password" class="youpasswd" data-icon="p">Your password </label>
                    <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EODFD">
                </p>
                <input type="submit" value="Đăng Nhập"><a href="homepageTemplate">Trang Chủ</a><a href="regist">Đăng Kí</a>
            </div>
        </form>
        </div>
        <!-- </section> -->
    </div>
</body>
</html>
