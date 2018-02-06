<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Trang Đăng Kí</title>
<link rel="stylesheet" type="text/css" href="resources/css/regist.css" />
<link rel="stylesheet" type="text/css" href="test/css/style.css" />
<script src="test/js/modernizr.custom.63321.js"></script>
<!--[if lte IE 7]><style>.main{display:none;} .support-note .note-ie{display:block;}</style><![endif]-->
<style>
body {
    background: #e1c192 url(images/wood_pattern.jpg);
}
</style>
</head>

<body>
    <div class="container">
        <!-- <section id="content"> -->
        <div id="content">
        <form id="formRegist" action="saveUsers" class="form-2" method="post">
            <div id="login" class="animate form">
                <h1 class="signupheader">Sign Up</h1>
                <input type="hidden" name="checkdangki" value="1" />
                <p>
                    <label for="username" class="uname" data-icon="u"> Your Username</label>
                    <input id="username" name="username" required="required" type="text" placeholder="myusername">
                </p>
                <p>
                    <label for="username" class="uname" data-icon="u"> Your Email Or Cellfone</label>
                    <input id="usercode" name="usercode" required="required" type="text" placeholder="mymail@mail.com | 0987654321">
                </p>
                <p>
                    <label for="password" class="youpasswd" data-icon="p">Your Password </label>
                    <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EODFD" class="showpassword">
                </p>
                <p>
                    <label for="password" class="youpasswd" data-icon="p">Confirm Your Password </label>
                    <input id="passwordconfirm" name="passwordconfirm" required="required" type="password" placeholder="eg. X8df!90EODFD">
                </p>
                <label><input type="checkbox"/>* Cập nhật lịch thi đấu vào email cho tôi</label>
                <input type="submit" value="Đăng Kí" /><a href="login">Đăng Nhập</a><a href="homepageTemplate">Trang Chủ</a>​​
            </div>
        </form>
        </div>
        <!-- </section> -->
    </div>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
    $(".showpassword").each(function(index,input) {
        var $input = $(input);
        $("<p class='opt' style='margin-left: 220px;'/>").append(
            $("<input type='checkbox' id='showPassword' />").click(function() {
                var change = $(this).is(":checked") ? "text" : "password";
                var rep = $("<input type='" + change + "' />")
                    .attr("id", $input.attr("id"))
                    .attr("name", $input.attr("name"))
                    .attr('class', $input.attr('class'))
                    .val($input.val())
                    .insertBefore($input);
                $input.remove();
                $input = rep;
             })
        ).append($("<label for='showPassword'/>").text("Show password")).insertAfter($input.parent());
    });
});
</script>
<style>
.opt{
height: 1px;
}
</style>
</body>
</html>
