<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Trang Đăng Kí</title>
<link rel="stylesheet" type="text/css" href="resources/css/regist.css" />
</head>

<body>
    <div class="container">
        <!-- <section id="content"> -->
        <div id="content">
        <form action="homepageTemplate">
            <div id="login" class="animate form">
                <h1 class="signupheader">Sign Up</h1>
                <p>
                    <label for="username" class="uname" data-icon="u"> Your username</label>
                    <input id="username" name="username" required="required" type="text" placeholder="myusername">
                </p>
                <p>
                    <label for="username" class="uname" data-icon="u"> Your email Or Cellfone</label>
                    <input id="username" name="username" required="required" type="text" placeholder="mymail@mail.com | 0987654321">
                </p>
                <p>
                    <label for="password" class="youpasswd" data-icon="p">Your password </label>
                    <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EODFD">
                </p>
                <p>
                    <label for="password" class="youpasswd" data-icon="p">Confirm Your password </label>
                    <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EODFD">
                </p>
                <label><input type="checkbox"/>* Cập nhật lịch thi đấu vào email cho tôi</label>
                <input type="submit" value="Đăng Kí" /><a href="login">Đăng Nhập</a><a href="homepageTemplate">Trang Chủ</a>
            </div>
        </form>
        </div>
        <!-- </section> -->
    </div>
</body>
</html>
